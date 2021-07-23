package dao;

import java.util.List;

import vo.MemoVO;

public interface MemoDAO {

	int insert(String id, String name,String content);

	List<MemoVO> getlist();

}
