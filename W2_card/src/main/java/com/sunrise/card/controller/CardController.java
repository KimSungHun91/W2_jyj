package com.sunrise.card.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunrise.card.service.CardServiceImpl;
import com.sunrise.card.vo.RcvapplVo;

@Controller
public class CardController {

	@Autowired
	CardServiceImpl cService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String card(Locale locale, Model model) {
		
		return "first";
	}
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String form1(RcvapplVo rcvapplVo) {
		// 접수일자 별 해당 고객의 입회신청서 내역 select
		List<RcvapplVo> testDate = cService.test(rcvapplVo);
		
		// select 해온 입회신청서 내역의 길이를 체크(불능인 입회신청서를 하드코딩 해둠) ex) testDate.size()
		// if문을 작성해보세요~!
		// 정상 입력된 건이 하나도 없으면 해당 고객의 입회신청서 insert
		if(false) {
			cService.deal(rcvapplVo);
		}
		
		return "inquire";
	}
	/*
	@RequestMapping(value = "/a", method = RequestMethod.POST)
	public String form1(@ModelAttribute CardVO cardVo) {
		cService.card(cardVo);
		return "inquire";
	}
	@RequestMapping(value = "/c", method = RequestMethod.POST)
	public String form1(@ModelAttribute CustVo custVo) {
		cService.cust(custVo);
		return "inquire";
	}
	@RequestMapping(value = "/d", method = RequestMethod.POST)
	public String form1(@ModelAttribute BillVo billVo) {
		cService.bill(billVo);
		return "inquire";
	}
	*/
	
	
}
