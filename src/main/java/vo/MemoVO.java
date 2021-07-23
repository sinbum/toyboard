package vo;

import java.sql.Date;

public class MemoVO {
	
	int id;
	String name;
	String content;
	Date date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MemoVO [id=" + id + ", name=" + name + ", content=" + content + ", date=" + date + "]";
	}
	public MemoVO(int id, String name, String content, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.date = date;
	}
	
	
	

	
	
	
	
}
