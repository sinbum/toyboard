package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import service.MemoService;
import vo.MemoVO;

public class Test {
	
	@Autowired
	MemoService memoserivce;
	
public Test() {
	ModelAndView mv=new ModelAndView();
	List<MemoVO> list= memoserivce.getList();
	for(MemoVO m:list) {
		System.out.println(m);
	}		
}
}
