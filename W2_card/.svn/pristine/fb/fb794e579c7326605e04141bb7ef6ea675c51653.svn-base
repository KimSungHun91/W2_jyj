package com.sunrise.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunrise.card.service.CardService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	/*
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	 Simply selects the home view to render by returning its name.
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		*/
	@Autowired
	private CardService sv;
	
	@RequestMapping(value ="/")
	public String first() {
		return "first";
		
	}
	
	@RequestMapping(value ="/inquire", method = RequestMethod.GET)
	public String inquire() {
		return "inquire";
	
	}
	///public String 
}
/*@Controller
public class testPageController {
    
    @Autowired
    private testPageMapper testpagemapper;
    
    @RequestMapping(value = "/testPage", method = RequestMethod.GET)
    
    //DB 출력 동작 메서드
    public String testPage_print(Model model){
        //<> 안에 DTO or VO 이름
        List<testPage> testpage = testpagemapper.getList_testpage();
        
        //model을 통해 View로 전달
        model.addAttribute("testpage",testpage);
        
        return "testPage/testpage";
    }
    
 
}
 * 
 * */
