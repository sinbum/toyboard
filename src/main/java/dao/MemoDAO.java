package dao;

import java.util.List;

import vo.MemoVO;

public interface MemoDAO {

	public int insert(String title,String content);

	public List<MemoVO> getList();
	
	public MemoVO select(String idx);

	public int update(String idx, String title, String content);

	public int delete(String idx);
	
	public List<MemoVO> searchList(String fieldname, String search);

}
