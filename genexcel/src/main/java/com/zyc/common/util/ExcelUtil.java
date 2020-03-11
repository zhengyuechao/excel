package com.zyc.common.util;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.excel.EasyExcel;

public class ExcelUtil {

	/**
	 * 下载excel
	 * 
	 * @param response
	 * @param data      数据
	 * @param fileName  文件名
	 * @param sheetName sheet页
	 * @param head      标题(实体类属性)
	 * @throws IOException 异常
	 */
	@SuppressWarnings("rawtypes")
	public static void downWrite(HttpServletResponse response, List data, String fileName, String sheetName, Class head)
			throws IOException {
		// 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("utf-8");
		// 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
		String fileNames = URLEncoder.encode(fileName, "UTF-8");
		response.setHeader("Content-disposition", "attachment;filename=" + fileNames + ".xlsx");
		EasyExcel.write(response.getOutputStream(), head).sheet(sheetName).doWrite(data);
	}

}
