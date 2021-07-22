package mybatis;

import java.util.List;

public interface MemoMapper {
	
	public int insert(String id);
	public String select(String id);
	public List<MemoVO> selects();
	public int update(String id);
	public int delete(String id);

}
