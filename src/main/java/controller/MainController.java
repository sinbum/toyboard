package controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MemoService;
import vo.MemoVO;

@Controller
public class MainController {
	
	@Autowired
	MemoService memoserivce;
	
public MainController() {
	System.out.println("메인컨트롤러실행");
}

@RequestMapping("/index")
public ModelAndView list() {
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.getList();
	for(MemoVO m:list) {
		System.out.println(m);
	}
	mv.addObject("list",list);
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;	
}
	
	
	
	
}
