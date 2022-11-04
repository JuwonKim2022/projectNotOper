package com.kh.dao;

import java.util.List;

import com.kh.vo.MarketDTO;

public interface MarketDAO {

	List<MarketDTO> selectAll() throws Exception;

	List<MarketDTO> selectByDistrict(String district) throws Exception;
	
	List<MarketDTO> selectDataByDYQ(String district) throws Exception;
}