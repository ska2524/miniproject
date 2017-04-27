package org.gears.service;

import java.util.List;

import javax.inject.Inject;

import org.gears.domain.Criteria;
import org.gears.domain.ReplyVO;
import org.gears.persistence.ReplyDAO;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

	
	@Inject
	ReplyDAO dao;
	
	@Override
	public void create(ReplyVO vo) {
		dao.Insert(vo);
		
	}

	@Override
	public int countTotal() {

		
		return dao.countTotal();
	}

	@Override
	public List<ReplyVO> getList(Criteria cri) {

		return dao.getList(cri);
	}

	@Override
	public ReplyVO readone(int rno) {

		return dao.read(rno);
	}

}
