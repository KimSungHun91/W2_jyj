package com.sunrise.card.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunrise.card.vo.BillVo;
import com.sunrise.card.vo.CardVO;
import com.sunrise.card.vo.CustVo;
import com.sunrise.card.vo.RcvapplVo;

@Repository("cDao")
public class CardDaoImpl implements CardDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<CardVO> cardList() {
		return sqlSession.selectList("Card.cardList");
	}
	@Override
	public List<RcvapplVo> test(RcvapplVo rcvapplVo) {
		return sqlSession.selectList("Card.rcvapplList", rcvapplVo);
	}
	@Override
	public int deal(RcvapplVo rcvapplVo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("Card.insertCard", rcvapplVo);
	}
	@Override
	public int card(CardVO cardVo) {
		return sqlSession.insert("Card.card");
	}
	@Override
	public int cust(CustVo custVo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("Card.cust");
	}
	@Override
	public int bill(BillVo billvo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("Card.bill");
	}

	
}
