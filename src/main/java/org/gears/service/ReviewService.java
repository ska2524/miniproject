package org.gears.service;

import java.util.List;

import org.gears.domain.Criteria;
import org.gears.domain.ReviewVO;

public interface ReviewService {


	public void create(ReviewVO vo);
	
	public int countTotal();

	public List<ReviewVO> getList(Criteria cri);
	
	public ReviewVO readone(int rno);
	
}
