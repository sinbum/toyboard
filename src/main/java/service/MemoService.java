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
	
	public int insert(String name,String conetent) {
		return memodao.insert(name, conetent);
		
	}

	public List<MemoVO> getList() {
		
		return memodao.getList();
	}
	
	public MemoVO select(String idx) {
		return memodao.select(idx);
		
	}

	public int update(String idx, String title, String content) {
		return memodao.update(idx, title, content);
	}
	
	public int delete(String idx) {
		return memodao.delete(idx);
	}
	
	public List<MemoVO> searchList(String fieldname,String search) {
		return memodao.searchList(fieldname, search);
	}

	
	

	

}
