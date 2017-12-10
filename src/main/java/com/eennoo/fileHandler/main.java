package com.eennoo.fileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.eennoo.fileHandler.model.Jobbean;
import com.eennoo.fileHandler.utils.ExportExcel;

public class main {

	public static void main(String[] args) {
		String fileString = readToString(main.class.getResource("/").getPath() + "/file/file.html");

		fileString = fileString.replaceAll("[\n]", "");
		fileString = fileString.replaceAll("[ ]", "");
		fileString = fileString.replaceAll("&nbsp;", "");
		fileString = fileString.replaceAll("&nbsp;", "");
		// fileString = fileString.replaceAll("<trid=\"trBaseInfo", "\n");
		// fileString = fileString.split("\n", 0)[1];
		String[] tables = fileString.split("<trid=\"trBaseInfo");
		// fileString = fileString.split("</tbody></table>")[0];
		List<String> tableList = new ArrayList<String>();
		List<Jobbean> jobbeans = new ArrayList<Jobbean>();
		for (int i = 1; i < tables.length; i++) {
			if (i < tables.length - 1)
				tableList.add(tables[i]);
			else
				tableList.add(tables[i].split("</tbody></table>")[0]);
		}

		for (String ss : tableList) {
			// System.out.println(ss);
			String regex = "<spanid=\"spanB(\\w+)\">";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ss);
			Jobbean jobbean = new Jobbean();
			if (matcher.find()) {
				jobbean.setId(matcher.group(1));
			} else {
				continue;
			}

			String[] ss1 = ss.split("SetTrDetailDisplay\\((\\w+)\\)\">");
			// for (String ssi : ss1) {
			// System.out.println(ssi);
			// }
			jobbean.setAge(ss1[1].split("</td>")[0]);
			jobbean.setWorkage(ss1[2].split("</td>")[0]);
			jobbean.setSex(ss1[3].split("</td>")[0]);
			jobbean.setPosition(ss1[5].split("</td>")[0]);
			jobbean.setEducation(ss1[6].split("</td>")[0]);
			jobbean.setSchool(ss1[8].replace("<spanclass=\"Common_width_12\">", "").split("</span>")[0]);
			System.out.println(ss1[9]);
			String[] value1 = ss1[9].split("</span><span>")[0].split("</dt><dd><p><span>");
			if (value1.length > 1) {
				jobbean.setLastwork(value1[1]);
			}
			if (ss.indexOf("Common_picdisp_none\"alt=\"������") >= 0) {
				jobbean.setIsdown("��");
			} else {
				jobbean.setIsdown("��");
			}
			if (ss1[9].indexOf("�ؼ��֣�</dt><dd><p>") >= 0) {
				jobbean.setKeyword(ss1[9].split("�ؼ��֣�</dt><dd><p>")[1].split("</p></dd>")[0]);
			}
			//
			jobbeans.add(jobbean);
		}

		export(jobbeans);

		// *************************************************************************************************

	}

	private static void export(List<Jobbean> jobbeans) {
		Map<String, String> titleMap = new LinkedHashMap<String, String>();
		titleMap.put("id", "����id");
		titleMap.put("age", "����");
		titleMap.put("workage", "��������");
		titleMap.put("sex", "�Ա�");
		titleMap.put("position", "ְ��");
		titleMap.put("education", "ѧ��");
		titleMap.put("school", "ѧУ��");
		titleMap.put("lastwork", "�������");
		titleMap.put("isdown", "�����أ�");
		titleMap.put("education", "ѧ��");
		titleMap.put("keyword", "�ؼ���");
		String sheetName = "��Ϣ����";
		/** ģ�����ݽ��� */

		System.out.println("start����");
		long start = System.currentTimeMillis();
		ExportExcel.excelExport(jobbeans, titleMap, sheetName);
		long end = System.currentTimeMillis();
		System.out.println("end����");
		System.out.println("��ʱ��" + (end - start) + "ms");
	}

	public static String readToString(String fileName) {
		String encoding = "UTF-8";
		File file = new File(fileName);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return new String(filecontent, encoding);
		} catch (UnsupportedEncodingException e) {
			System.err.println("The OS does not support " + encoding);
			e.printStackTrace();
			return null;
		}
	}

}
