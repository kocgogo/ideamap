package com.mycom.d3.control;

import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycom.d3.biz.Biz;
import com.mycom.d3.vo.MemberVO;
import com.mycom.view.View;

@Controller
public class MemberControl {
   @Autowired
   @Qualifier("MemberBiz")  
   Biz biz;
   
 
   @RequestMapping(value="/login.do") 
   public ModelAndView main(){
      ModelAndView mv = new ModelAndView();
      mv.setViewName("main");
      View view = new View();   
      view.setCenter("member/login");
      view.setTop("topPage");
      mv.addObject("view",view);         
      return mv;
   }   
  @Deprecated
   @RequestMapping(value="/mypage.do")  
   public ModelAndView main0(){
      ModelAndView mv = new ModelAndView();
      mv.setViewName("main");
      View view = new View();   
      view.setCenter("member/mypage");
      view.setTop("topPage");
      mv.addObject("view",view);         
      return mv;
   }   
  
   @RequestMapping(value="/join.do") 
   public ModelAndView main2(){
      ModelAndView mv = new ModelAndView();
      mv.setViewName("main");
      View view = new View();   
      view.setCenter("member/join");
      view.setTop("topPage");   
      mv.addObject("view",view);   
      
      return mv;
   }   
  @Deprecated
   @RequestMapping(value="/joinImpl.do", method=RequestMethod.POST)  
   public ModelAndView main5(MemberVO jvo, HttpServletRequest request){
	  System.out.println(jvo);
		//   MemberVO mvo = new MemberVO(jvo.getId(), jvo.getPassword(), jvo.getM_name(), jvo.getM_affiliate(), jvo.getM_division(), jvo.getM_date());	
		 //  biz.register(mvo);
	  
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("main");
	   View view = new View();   
	   view.setCenter("member/login");
	   view.setTop("topPage");
	   mv.addObject("view",view); 
	   return mv; 
      
   }     
  @Deprecated
   @RequestMapping(value="/loginImpl.do", method=RequestMethod.POST) 
   public ModelAndView main3(MemberVO mvo, HttpServletRequest request){ 	   
	  if(biz.getCorrect(mvo)!=null){
		  MemberVO mvo2 = (MemberVO) biz.get(mvo);		  
		 System.out.println(mvo2);
		  HttpSession login = request.getSession();
		  login.setAttribute("userInfo", mvo2);				
		  ModelAndView mv = new ModelAndView();  		  
		  mv.setViewName("redirect: main.do");
		  return mv;
	  }
	  else
	  {		
		  ModelAndView mv = new ModelAndView();    
		  mv.setViewName("main");
	      View view = new View();   
	      view.setCenter("member/loginfail");
	      view.setTop("topPage");
	      mv.addObject("view",view); 
	      return mv;
	  } 
      
   }   
  @Deprecated
   @RequestMapping(value="/logout.do")
   public ModelAndView main4(MemberVO mvo, HttpServletRequest request){
	   HttpSession login = request.getSession();
	   login.invalidate();
	   ModelAndView mv = new ModelAndView();    
	   mv.setViewName("redirect: main.do");
	   return mv;      
   }   
  @Deprecated
   @RequestMapping(value="/idfind.do") 
   public ModelAndView main6(){
	   ModelAndView mv = new ModelAndView();    
	   mv.setViewName("main");
	   View view = new View();   
	   view.setCenter("member/idfind");
	   mv.addObject("view",view); 
	   return mv;      
   }   
  @Deprecated
   @RequestMapping(value="/pwdfind.do")  
   public ModelAndView main7(){
	   ModelAndView mv = new ModelAndView();    
	   mv.setViewName("main");
	   View view = new View();  	
	   view.setCenter("member/pwdfind");
	   mv.addObject("view",view); 
	   return mv;      
   }   
  @Deprecated
   @RequestMapping(value="/changepwd.do") 
   public ModelAndView main11(){
	   ModelAndView mv = new ModelAndView();    
	   mv.setViewName("main");
	   View view = new View();   
	   view.setCenter("member/changePassword");
	   mv.addObject("view",view); 
	   return mv;      
   } 
  @Deprecated
   @RequestMapping(value="/changepwdImpl.do", method=RequestMethod.POST)  
   public ModelAndView main9(MemberVO mvo, HttpServletRequest request){
	    	    
	/*   MemberVO mvo2 = (MemberVO) biz.get(mvo);	  
	   MemberVO result = new MemberVO(mvo2.getId(),
		mvo.getPassword(),
		mvo2.getM_name(),
		mvo2.getM_affiliate(),
		mvo2.getM_division(),
		mvo2.getM_date()
		);
	   biz.modify(result);*/

		HttpSession login = request.getSession();
		login.invalidate();
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("main");
	   View view = new View();   //view������ View��ü
	   view.setCenter("member/confirm");
	   view.setTop("topPage");
	   mv.addObject("view",view); 
	   return mv; 
      
   }     
  @Deprecated
   @RequestMapping(value="/changeinfo.do")
   public ModelAndView main13(){
	   ModelAndView mv = new ModelAndView();    
	   mv.setViewName("main");
	   View view = new View();   
	   view.setCenter("member/editAccount");
	   mv.addObject("view",view); 
	   return mv;      
   } 
 
  /*  @RequestMapping(value="/idcheck.do", method=RequestMethod.POST)  
   public @ResponseBody MemberVO idcheck(MemberVO mvo){
	   MemberVO mvo2 = (MemberVO) biz.get(mvo);	   
	   if(mvo2==null){
		   MemberVO mvo3 = new MemberVO("1");
		   return mvo3;
	   }
	   else{
		   MemberVO mvo3 = new MemberVO("0");
		   return mvo3;
	   }      
   } */
}