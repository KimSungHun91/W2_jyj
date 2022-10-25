package com.sunrise.card.service;

import java.util.List;

import com.sunrise.card.vo.CardVO;
import com.sunrise.card.vo.RcvapplVo;

public interface CardService {
	List<CardVO> cardList();

	public List<RcvapplVo> test(RcvapplVo rcvapplVo);
	
}
