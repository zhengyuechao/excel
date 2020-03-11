package com.zyc.mapper;
 

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zyc.entity.BigDataEntity;

import java.util.List;

 
@Repository
@Mapper
public interface BigDataMapper {

	List<BigDataEntity> findBigDataByDivision(String division);
	
	
    List<BigDataEntity> findBigDataByCurrentAreas(String currentArea);
}
