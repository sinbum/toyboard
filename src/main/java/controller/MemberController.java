package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberserivce;

	@RequestMapping("input")
	public String input() {
		return "/WEB-INF/views/input.jsp";
	}
	@RequestMapping("inputProc")
	public ModelAndView inputProc(String id, String name, String content ) {
		System.out.println(id+":"+name);
		int result = memberserivce.insert(id,name,content);		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result==1 ? "성공":"실패");
		mv.setViewName("/WEB-INF/views/result.jsp");
		return mv;
	}
}
