package org.gears.service;

import java.util.List;

import org.gears.domain.Criteria;
import org.gears.domain.ReplyVO;



public interface ReplyService {

public void create(ReplyVO vo);
	
	public int countTotal();

	public List<ReplyVO> getList(Criteria cri);
	
	public ReplyVO readone(int rno);
}
