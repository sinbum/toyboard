package controller;

import java.util.List;

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
	mv.addObject("list",list);
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	mv.addObject("section","default.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}



@RequestMapping("/update")
public ModelAndView update(String id) {
	ModelAndView mv=new ModelAndView();
	MemoVO select= memoserivce.select(id);	
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	List<MemoVO> list= memoserivce.getList();	
	mv.addObject("list",list);
	mv.addObject("section","update.jsp");
	mv.addObject("select",select);
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}

//select만들기.
@RequestMapping("/select")
public ModelAndView select(String id) {
	ModelAndView mv=new ModelAndView();
	MemoVO select= memoserivce.select(id);	
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	List<MemoVO> list= memoserivce.getList();	
	mv.addObject("list",list);
	mv.addObject("section","select.jsp");
	mv.addObject("select",select);
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}
	


	
}
