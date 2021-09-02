package org.care.service;

import java.util.List;

import org.care.domain.BoardInfo;
import org.care.domain.Criteria;

public interface ListArticleService {
	
	public List<BoardInfo> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri);
	

 
}
