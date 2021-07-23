package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MemoService;
import vo.MemoVO;

@Controller
@RequestMapping("/memo/")
public class MemoController {
	
	@Autowired
	MemoService memoserivce;

	@RequestMapping("input")
	public ModelAndView input() {
		ModelAndView mv = new ModelAndView();
		List<MemoVO> list= memoserivce.getList();
		mv.addObject("list",list);
		mv.addObject("section","write.jsp");
		mv.setViewName("/WEB-INF/views/index.jsp");
		return mv;
	}
	@RequestMapping("inputProc")
	public ModelAndView inputProc(String id, String name, String content ) {
		System.out.println(id+":"+name);
		int result = memoserivce.insert(id,name,content);		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result==1 ? "성공":"실패");
		mv.setViewName("/WEB-INF/views/result.jsp");
		return mv;
	}
	
	@RequestMapping("list")
	public ModelAndView list() {
		ModelAndView mv=new ModelAndView();
		List<MemoVO> list= memoserivce.getList();
		for(MemoVO m:list) {
			System.out.println(m);
		}
		mv.addObject("list",list);
		mv.setViewName("/WEB-INF/views/list.jsp");
		return mv;
		
	}
	
}
