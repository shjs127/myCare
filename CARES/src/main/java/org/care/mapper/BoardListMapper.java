package org.care.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.care.domain.BoardInfo;
import org.care.domain.BoardPicInfo;
import org.care.domain.CommentInfo;
import org.care.domain.Criteria;
import org.care.domain.NextNo;
import org.care.domain.PrevNo;
import org.care.domain.UserInfo;
import org.care.dto.BoardDTO;
import org.care.dto.CommentDTO;

public interface BoardListMapper {

	List<BoardInfo> listCriteria(Criteria cri);

	int countCriteria(Criteria cri);
	
}
