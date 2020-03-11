package com.zyc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.zyc.common.SysConstants;
import com.zyc.common.util.ExcelUtil;
import com.zyc.entity.BigDataEntity;
import com.zyc.mapper.BigDataMapper;


@RestController
public class ExcelController {
	
	

	@Autowired
	BigDataMapper bigDataMapper; 
	
	
	@RequestMapping("/bigData")
	public void bigData(HttpServletRequest request, HttpServletResponse response) throws IOException{ 
		List<BigDataEntity> lists = bigDataMapper.findBigDataByDivision(null);
		String fileName = "fumin"; 
		ExcelUtil.downWrite(response,lists, fileName, SysConstants.SHEET_NAME,BigDataEntity.class);  
	}
	
	
	@RequestMapping("/findCurrentArea")
	public void findCurrentArea(HttpServletRequest request, HttpServletResponse response,String currentArea) throws Exception{
		
		if(StringUtils.isEmpty(currentArea)) {
			throw new Exception("参数不能为空");
		}
		
		List<BigDataEntity> lists = bigDataMapper.findBigDataByCurrentAreas(currentArea);
		String fileName = currentArea; 
		ExcelUtil.downWrite(response,lists, fileName, SysConstants.SHEET_NAME,BigDataEntity.class);   
	}

}
