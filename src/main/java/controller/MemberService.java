package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	MemberDAO memberdao;
	
	public int insert(String id, String name,String conetent) {
		return memberdao.insert(id,name,conetent);
		
	}

}
