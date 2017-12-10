package com.eennoo.fileHandler.utils;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

/***
 * ����List<Object>���ݵ�excel�����ɵ���65535�У�
 * 
 * @author user
 */
public final class ExportExcel {

	/***
	 * ���췽��
	 */
	private ExportExcel() {

	}

	/***
	 * ������
	 */
	private static HSSFWorkbook workbook;

	/***
	 * sheet
	 */
	private static HSSFSheet sheet;
	/***
	 * �����п�ʼλ��
	 */
	private static final int TITLE_START_POSITION = 0;

	/***
	 * ʱ���п�ʼλ��
	 */
	private static final int DATEHEAD_START_POSITION = 1;

	/***
	 * ��ͷ�п�ʼλ��
	 */
	private static final int HEAD_START_POSITION = 2;

	/***
	 * �ı��п�ʼλ��
	 */
	private static final int CONTENT_START_POSITION = 3;

	/**
	 * 
	 * @param dataList
	 *            ���󼯺�
	 * @param titleMap
	 *            ��ͷ��Ϣ��������������->Ҫ��ʾ�ı���ֵ)[��˳�����]
	 * @param sheetName
	 *            sheet���ƺͱ�ͷֵ
	 */
	public static void excelExport(List<?> dataList, Map<String, String> titleMap, String sheetName) {
		// ��ʼ��workbook
		initHSSFWorkbook(sheetName);
		// ������
		createTitleRow(titleMap, sheetName);
		// ʱ����
		createDateHeadRow(titleMap);
		// ��ͷ��
		createHeadRow(titleMap);
		// �ı���
		createContentRow(dataList, titleMap);
		// �����Զ�����
		// autoSizeColumn(titleMap.size());
		// д�봦����
		try {
			// ����UUID�ļ�����
			UUID uuid = UUID.randomUUID();
			String filedisplay = "����" + ".xls";
			// ���web��Ŀ��1���������ؿ�ĵ���������response��ز���)��2��ͨ��httpservletresponse.getOutputStream()��ȡ
			OutputStream out = new FileOutputStream("" + filedisplay);
			workbook.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * 
	 * @param sheetName
	 *            sheetName
	 */
	private static void initHSSFWorkbook(String sheetName) {
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet(sheetName);
	}

	/**
	 * ���ɱ��⣨�����д�����
	 * 
	 * @param titleMap
	 *            ������������->��ͷ��ʾ����
	 * @param sheetName
	 *            sheet����
	 */
	private static void createTitleRow(Map<String, String> titleMap, String sheetName) {
		CellRangeAddress titleRange = new CellRangeAddress(0, 0, 0, titleMap.size() - 1);
		sheet.addMergedRegion(titleRange);
		HSSFRow titleRow = sheet.createRow(TITLE_START_POSITION);
		HSSFCell titleCell = titleRow.createCell(0);
		titleCell.setCellValue(sheetName);
	}

	/**
	 * ����ʱ���У���һ�д�����
	 * 
	 * @param titleMap
	 *            ������������->��ͷ��ʾ����
	 */
	private static void createDateHeadRow(Map<String, String> titleMap) {
		CellRangeAddress dateRange = new CellRangeAddress(1, 1, 0, titleMap.size() - 1);
		sheet.addMergedRegion(dateRange);
		HSSFRow dateRow = sheet.createRow(DATEHEAD_START_POSITION);
		HSSFCell dateCell = dateRow.createCell(0);
		dateCell.setCellValue(new SimpleDateFormat("yyyy��MM��dd��").format(new Date()));
	}

	/**
	 * ������ͷ�У��ڶ��д�����
	 * 
	 * @param titleMap
	 *            ������������->��ͷ��ʾ����
	 */
	private static void createHeadRow(Map<String, String> titleMap) {
		// ��1�д���
		HSSFRow headRow = sheet.createRow(HEAD_START_POSITION);
		int i = 0;
		for (String entry : titleMap.keySet()) {
			HSSFCell headCell = headRow.createCell(i);
			headCell.setCellValue(titleMap.get(entry));
			i++;
		}
	}

	/**
	 * 
	 * @param dataList
	 *            �������ݼ���
	 * @param titleMap
	 *            ��ͷ��Ϣ
	 */
	private static void createContentRow(List<?> dataList, Map<String, String> titleMap) {
		try {
			int i = 0;
			for (Object obj : dataList) {
				HSSFRow textRow = sheet.createRow(CONTENT_START_POSITION + i);
				int j = 0;
				for (String entry : titleMap.keySet()) {
					String method = "get" + entry.substring(0, 1).toUpperCase() + entry.substring(1);
					Method m = obj.getClass().getMethod(method, null);
					String value = null;
					if (m.invoke(obj, null) != null) {
						value = m.invoke(obj, null).toString();
					} else {
						value = "";
					}
					HSSFCell textcell = textRow.createCell(j);
					textcell.setCellValue(value);
					j++;
				}
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * �Զ������У���Ǳ�Ҫ������򿪴˷��������ڴ棩
	 * 
	 * @param size
	 *            ����
	 */
	private static void autoSizeColumn(Integer size) {
		for (int j = 0; j < size; j++) {
			sheet.autoSizeColumn(j);
		}
	}
}