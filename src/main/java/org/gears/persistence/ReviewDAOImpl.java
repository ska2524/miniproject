package org.gears.persistence;

import java.util.List;

import javax.inject.Inject;

import org.gears.domain.Criteria;
import org.gears.domain.ReviewVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAOImpl implements ReviewDAO {

	@Inject
	SqlSessionTemplate sess;

	private static final String namespace = "org.gears.persistence.ReviewDAO";

	@Override
	public void Insert(ReviewVO vo) {

		sess.insert(namespace + ".insert", vo);

	}

	@Override
	public int countTotal() {
		
		return sess.selectOne(namespace + ".getTotal");

	}

	@Override
	public List<ReviewVO> getList(Criteria cri) {
		return sess.selectList(namespace+".getlist",cri);
		 
	}

	@Override
	public ReviewVO read(int rno) {
		return sess.selectOne(namespace+".read", rno);
	}

}
