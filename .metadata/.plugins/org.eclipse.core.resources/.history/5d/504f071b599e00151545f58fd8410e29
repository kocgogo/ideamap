package com.mycom.d3.control;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.d3.biz.Biz;
import com.mycom.view.View;

@Controller
public class MainControl {


	@RequestMapping(value="/main.do") 
	public ModelAndView main(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		View view = new View();	
		mv.addObject("view",view);		
		
		return mv;
	}
}
