package com.kh.dao;

import java.util.List;

import com.kh.vo.HistoryDTO;

public interface HistoryDAO {

	public List<HistoryDTO> selectAll() throws Exception;

	public List<HistoryDTO> selectRecentHistory(int membernumber) throws Exception;

	public int insert(HistoryDTO historyDTO) throws Exception;
}
