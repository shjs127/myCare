package org.care.service;

import java.util.List;

import org.care.domain.BoardInfo;
import org.care.domain.Criteria;
import org.care.mapper.BoardListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListArticleServiceImpl implements ListArticleService {

	@Autowired
	private BoardListMapper boardListMapper;


	@Override
	public List<BoardInfo> listCriteria(Criteria cri) throws Exception{
		return boardListMapper.listCriteria(cri);
	}


	@Override
	public int listCountCriteria(Criteria cri) {
		return boardListMapper.countCriteria(cri);
	}




}
