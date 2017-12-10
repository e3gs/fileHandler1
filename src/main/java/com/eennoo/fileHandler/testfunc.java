package com.eennoo.fileHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testfunc {

	public static void main(String[] args) {
		// 要验证的字符串
		String str = "_4\"class=\"inbox_tr_hover\"onmouseover=\"EHRResumeList.TrBgColorChange(this,true,false)\"onmouseout=\"EHRResumeList.TrBgColorChange(this,false,false)\"><tdclass=\"Common_list_chk\"><inputid=\"chkBox\"type=\"checkbox\"name=\"chkBox\"value=\"69586193\"value1=\"1\"><inputid=\"hidIsExp_4\"type=\"hidden\"value=\"1\"></td><tdclass=\"Common_list_table-id-text\"style=\"text-align:left;\"><spanid=\"spanB69586193\"><ahref=\"https://ehire.51job.com/Candidate/ResumeView.aspx?hidUserID=69586193&amp;hidEvents=23&amp;pageCode=3&amp;hidKey=e0c053c6beb2f289f50ba1a3ee15590f\"onclick=\"EHR.Common_AsyncAddLog(&#39;3&#39;,&#39;8&#39;,&#39;&#39;)\"target=\"_blank\">69586193</a></span><imgid=\"downPic_69586193\"class=\"Common_picidsp\"alt=\"已下载\"title=\"已下载\"src=\"./无忧简历库搜索_files/02.jpg\"align=\"absmiddle\"></td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">35</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">12年</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">男</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">深圳-福田区</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">高级软件工程师</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">硕士</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\">2017-12-11</td><tdclass=\"Common_list_td\"onclick=\"EHRResumeList.SetTrDetailDisplay(4)\"><spanclass=\"Common_width_12\">北京大学</span></td><tdonclick=\"EHRResumeList.SetTrDetailDisplay(4)\"></td></tr><trid=\"trDetail_4\"class=\"display:;\"style=\"display:;\"onmouseover=\"EHRResumeList.TrBgColorChange(this,true,false)\"onmouseout=\"EHRResumeList.TrBgColorChange(this,false,false)\"><tdcolspan=\"12\"><divid=\"divDetail_4\"class=\"Common_list-detailed\"><divclass=\"Common_list-pic\"id=\"divImg_69586193\"style=\"display:;\"><imgid=\"img69586193\"class=\"Common_list_detailed_img\"alt=\"\"src=\"./无忧简历库搜索_files/man.png\"></div><divid=\"divResult_69586193\"><dlclass=\"Common_clearfix\"><dt>最近工作：</dt><dd><p><span>VicePresident,高级软件工程师&nbsp;&nbsp;|&nbsp;&nbsp;松河投资咨询有限公司（PineRiver）&nbsp;&nbsp;|</span>&nbsp;&nbsp;<span>2013/8-今</span><br><span><spantitle=\"定价清算系统设计开发了一个基于asp.netwebapi的webservice设计开发了一个基于asp.netwebapi和angularjs的前端网站设计开发了一个基于SQLSERVER的存储内部定价的数据库创建了一系列的自动化定价程序（基于ActiveBatch）风控系统参与设计开发了一个基于.net和RabbitMQ/Redis的自动抓取价格数据并计算风险值参与开发了前端显示实时价格和风险数据的系统（WPF/Winform）设计开发了一个量化分析股票以及相关衍生品的前端网站（基于asp.net）创建了一系列自动化程序（基于ActiveBatch）行情系统设计开发期货行情系统(后端,kafka,redis,mongo)\">定价清算系统设计开发了一个基于asp.netwebapi的webservice设计开发了一个基于asp.......</span></span></p></dd></dl><dlclass=\"Common_clearfix\"><dt>毕业院校：</dt><dd><p>北京大学&nbsp;|&nbsp;&nbsp;软件工程&nbsp;|&nbsp;&nbsp;硕士</p></dd></dl><dlclass=\"Common_clearfix\"><dt>历史工作：</dt><dd><p><spanstyle=\"display:block;\">高级开发工程师&nbsp;&nbsp;|&nbsp;&nbsp;汤森路透（中国）（ThomsonReuters）&nbsp;&nbsp;|&nbsp;&nbsp;<span>2010/6-2013/8</span></span><spanstyle=\"display:block;\">软件工程师&nbsp;&nbsp;|&nbsp;&nbsp;CA(ComputerAssociate)&nbsp;&nbsp;|&nbsp;&nbsp;<span>2009/8-2010/6</span></span></p></dd></dl><dlclass=\"Common_clearfix\"><dt>关&nbsp;&nbsp;键&nbsp;&nbsp;字：</dt><dd><p>&nbsp;</p></dd></dl></div><script>EHRResumeList.V_GetResumeContent('69586193','e0c6f446c3c9c49d','0','0','1','%e5%8c%97%e4%ba%ac%e5%a4%a7%e5%ad%a6%26nbsp%3b%7c%26nbsp%3b%26nbsp%3b%e8%bd%af%e4%bb%b6%e5%b7%a5%e7%a8%8b%26nbsp%3b%7c%26nbsp%3b%26nbsp%3b%e7%a1%95%e5%a3%ab','0','4')</script><divclass=\"Common_list-set\"id=\"divOperationBtn69586193\"><ahref=\"javascript:void(0);\"onclick=\"javascript:EHRResumeList.ShowResumeView(&#39;69586193&#39;,&#39;3&#39;);EHR.Common_AsyncAddLog(&#39;3&#39;,&#39;9&#39;,&#39;&#39;);returnfalse;\"class=\"Common_btn-redCommon_btn-red_mt8\">查看简历</a><ahref=\"javascript:void(0);\"onclick=\"javascript:EHRResumeList.OpenResumeCommonLayer(&#39;HRTMPS&#39;,&#39;69586193&#39;,&#39;&#39;,&#39;&#39;,this,3);EHR.Common_AsyncAddLog(&#39;3&#39;,&#39;10&#39;,&#39;&#39;);returnfalse;\"class=\"Common_btn-redCommon_btn-red_mt8\">暂存简历</a><ahref=\"javascript:void(0);\"onclick=\"javascript:EHRResumeList.OpenResumeCommonLayer(&#39;TOCOHR&#39;,&#39;69586193&#39;,&#39;&#39;,&#39;&#39;,this,3);EHR.Common_AsyncAddLog(&#39;3&#39;,&#39;11&#39;,&#39;&#39;);returnfalse;\"class=\"Common_btn-redCommon_btn-red_mt8\">下载简历</a></div></div></td></tr>";

		String[] ss1 = str.split("SetTrDetailDisplay\\((\\w+)\\)\">");
		for (String ssi : ss1) {
			System.out.println(ssi);
		}
		System.out.println(ss1[9]);
		System.out.println(ss1[9].split("</span><span>")[0]);
		// ******************************************************************
		// 正则表达式规则
		// <a href=\"\/artist\/104331\/songlist\">
		String regex = "<spanid=\"spanB(\\w+)\">";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			System.out.println("fd");
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println(i + ":" + matcher.group(i));
			}
		}

	}

}
