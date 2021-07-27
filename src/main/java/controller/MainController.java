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
public ModelAndView index() {
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.getList();	
	mv.addObject("list",list);
	mv.addObject("section","default.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}



@RequestMapping("/update")
public ModelAndView update(String idx) {
	ModelAndView mv=new ModelAndView();
	MemoVO select= memoserivce.select(idx);	
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	List<MemoVO> list= memoserivce.getList();	
	mv.addObject("list",list);
	mv.addObject("section","update.jsp");
	mv.addObject("select",select);
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}
@RequestMapping("/updateProc")
public ModelAndView updateProc(String idx,String title,String content) {
	System.out.println("updateporc을 실행합니다 : "+idx+title+content);
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.getList();
	int result = memoserivce.update(idx,title,content);	
	//섹션 이동경로는 현재 write로 되어있지만.index전용 section페이지 생성예정
	MemoVO select= memoserivce.select(idx);
	mv.addObject("select",select);
	mv.addObject("list",list);
	mv.addObject("section","updateProc.jsp");
	mv.addObject("result",result);
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
@RequestMapping("/selectId")
public ModelAndView selectId(String idx) {
	ModelAndView mv=new ModelAndView();
	MemoVO select= memoserivce.select(idx);	
	List<MemoVO> list= memoserivce.getList();	
	mv.addObject("list",list);
	mv.addObject("select",select);		
	mv.addObject("section","select.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;		
}
	
@RequestMapping("/input")
public ModelAndView input(String title,String content) {
	ModelAndView mv=new ModelAndView();	
	mv.addObject("section","input.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}

@RequestMapping("/inputProc")
public ModelAndView inputProc(String title, String content ) {
	ModelAndView mv=new ModelAndView();	
	int result=memoserivce.insert(title, content);
	mv.addObject("result",result);
	mv.addObject("section","inputProc.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}

@RequestMapping("/delete")
public ModelAndView delete(String idx) {
	ModelAndView mv=new ModelAndView();	
	int result=memoserivce.delete(idx);
	mv.addObject("result",result);
	mv.addObject("section","deleteProc.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;
}




@RequestMapping("/search")
public ModelAndView search(String fieldname,String search) {
	System.out.println("필드네임과 서치기능. : "+fieldname+search);
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.searchList(fieldname,search);	
	mv.addObject("list",list);
	mv.addObject("section","default.jsp");
	mv.setViewName("/WEB-INF/views/index.jsp");
	return mv;	
}





	
}
