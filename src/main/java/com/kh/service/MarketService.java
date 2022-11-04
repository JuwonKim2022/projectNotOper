package com.kh.service;

import java.util.List;

import com.kh.vo.MarketDTO;

public interface MarketService {
	public List<MarketDTO> selectAll() throws Exception;

	List<MarketDTO> selectByDistrict(String district) throws Exception;
	
	List<MarketDTO> selectDataByDYQ(String district) throws Exception;
}