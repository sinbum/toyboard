package vo;

import java.sql.Date;

public class MemoVO {
	
	int id;
	String name;
	String content;
	Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public MemoVO(int id, String name, String content, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.time = time;
	}
	@Override
	public String toString() {
		return "MemoVO [id=" + id + ", name=" + name + ", content=" + content + ", time=" + time + "]";
	}
	
	
	

	
	
	
	
}
