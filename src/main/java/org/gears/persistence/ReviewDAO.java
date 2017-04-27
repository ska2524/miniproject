package org.gears.persistence;

import java.util.List;

import org.gears.domain.Criteria;
import org.gears.domain.ReviewVO;

public interface ReviewDAO {

	public void Insert(ReviewVO vo);
	
	public int countTotal();

	public List<ReviewVO> getList(Criteria cri);
	
	
	public ReviewVO read(int rno);
	
	
}
