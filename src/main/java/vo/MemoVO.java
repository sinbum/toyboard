package vo;

import java.sql.Date;

public class MemoVO {
	
	int idx;
	String title;
	String content;
	Date date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "MemoVO [idx=" + idx + ", title=" + title + ", content=" + content + ", date=" + date + "]";
	}
	public MemoVO(int idx, String title, String content, Date date) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	
		
	
}
