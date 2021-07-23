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
}

@RequestMapping("/index")
public ModelAndView list() {
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.getList();
	
	
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	mv.addObject("section","default.jsp");
	mv.addObject("list",list);
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;	
}
	
	
	
	
}
