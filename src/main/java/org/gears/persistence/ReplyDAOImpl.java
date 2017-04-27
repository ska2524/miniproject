package org.gears.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.gears.domain.Criteria;
import org.gears.domain.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ReplyDAOImpl implements ReplyDAO {

	
	@Inject
	SqlSessionTemplate sess;

	private static final String namespace = "org.gears.persistence.ReplyDAO";

	
	/*HashMap<String,Object> map=new HashMap<String, Object>;
	map.put("cri",);
	map.put("VO",);*/
	
	
	@Override
	public void Insert(ReplyVO vo) {

		sess.insert(namespace + ".insert", vo);
	}

	@Override
	public int countTotal() {
		return sess.selectOne(namespace + ".getTotal");

	}

	@Override
	public List<ReplyVO> getList(Criteria cri) {
		return sess.selectList(namespace+".getlist",cri);

	}

	@Override
	public ReplyVO read(int rno) {
		return sess.selectOne(namespace+".read", rno);
	}

	

}
