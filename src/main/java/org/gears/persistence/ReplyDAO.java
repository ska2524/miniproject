package org.gears.persistence;

import java.util.List;

import org.gears.domain.Criteria;
import org.gears.domain.ReplyVO;

public interface ReplyDAO {

	
	public void Insert(ReplyVO vo);
	
	public int countTotal();

	public List<ReplyVO> getList(Criteria cri);
	
	public ReplyVO read(int rno);
	
	
}
