package org.gears.service;

import java.util.List;

import javax.inject.Inject;

import org.gears.domain.Criteria;
import org.gears.domain.ReviewVO;
import org.gears.persistence.ReviewDAO;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Inject
	ReviewDAO dao;
	
	@Override
	public void create(ReviewVO vo) {
		dao.Insert(vo);
		
	}

	@Override
	public int countTotal() {

		
		return dao.countTotal();
	}

	@Override
	public List<ReviewVO> getList(Criteria cri) {

		return dao.getList(cri);
	}

	@Override
	public ReviewVO readone(int rno) {

		return dao.read(rno);
	}

}
