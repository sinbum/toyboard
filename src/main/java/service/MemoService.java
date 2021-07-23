package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemoDAO;
import vo.MemoVO;

@Service
public class MemoService {
	@Autowired
	MemoDAO memodao;
	
	public int insert(String id, String name,String conetent) {
		return memodao.insert(id,name,conetent);
		
	}

	public List<MemoVO> getList() {
		
		return memodao.getlist();
	}

	

}
