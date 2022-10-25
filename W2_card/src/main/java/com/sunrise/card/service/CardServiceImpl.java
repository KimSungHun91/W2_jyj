package com.sunrise.card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunrise.card.dao.CardDao;
import com.sunrise.card.vo.CardVO;
import com.sunrise.card.vo.RcvapplVo;

@Service("cService")
public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardDao cDao;

	@Override
	public List<CardVO> cardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RcvapplVo> test(RcvapplVo rcvapplVo){
		List<RcvapplVo> rcvapplList = cDao.test(rcvapplVo);
		return rcvapplList;
	}
	
	public int deal(RcvapplVo rcvapplVo) {
		
		return cDao.deal(rcvapplVo);
	} 
	
//	@Override
//	public List<CardVO> cardList(){
//		List<CardVO> list = bDao.cardList();
//		return list;
//	}
}
