package com.kh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kh.dao.HistoryDAO;
import com.kh.vo.HistoryDTO;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {
	@Resource(name = "historyDAO")
	private HistoryDAO historyDAO;

	@Override
	public List<HistoryDTO> selectAll() throws Exception {
		return historyDAO.selectAll();
	}
	
	@Override
	public List<HistoryDTO> selectRecentHistory(int membernumber) throws Exception {
		return historyDAO.selectRecentHistory(membernumber);
	}
	
	@Override
	public int insert(HistoryDTO historyDTO) throws Exception {
		return historyDAO.insert(historyDTO);
	}

}