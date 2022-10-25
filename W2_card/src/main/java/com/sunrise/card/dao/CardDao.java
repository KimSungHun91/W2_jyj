package com.sunrise.card.dao;

import java.util.List;

import com.sunrise.card.vo.BillVo;
import com.sunrise.card.vo.CardVO;
import com.sunrise.card.vo.CustVo;
import com.sunrise.card.vo.RcvapplVo;

public interface CardDao {
	List<CardVO> cardList();
	public int deal(RcvapplVo rcvapplVo);
	public int card(CardVO cardvo);
	public int cust(CustVo custVo);
	public int bill(BillVo billvo);
	
}

	
