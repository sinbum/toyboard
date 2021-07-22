package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mybatis.MemoService;


public class IndexController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("indexcontroller test");
		ModelAndView mv= new ModelAndView();	
		mv.addObject("data","1234");		
		//mv.setViewName("index.jsp");		
		mv.setViewName("/WEB-INF/index.jsp");
		return mv;
	}
}
//실행함.