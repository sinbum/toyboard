package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mybatis.MemoVO;


@Controller
public class MainController {
	@Autowired
	//@Qualifier(value = "ds")//value는 디스패쳐서블릿.xml에서의 빈객체를 만들었던 id를 사용한다.
	DriverManagerDataSource ds;//Connection 객체를 얻기위함.
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("index.jsp");
		
		//마이바티스에서의 데이터베이스 접근.
//				ApplicationContext ctx =new GenericXmlApplicationContext("mybatis.dbconfig.xml");
//				MemoService memo = (MemoService)ctx.getBean("memoservice");
		
		return "index.jsp";
	}
	
	
	@RequestMapping("/ds")
	//public ModelAndView ds(String parameta/*겟파라메타값이 여기에 넘겨온다. 변수명은 동일하게.*/){
	public ModelAndView ds(@RequestParam(defaultValue = "1") String id)/*겟파라메타값이 여기에 넘겨온다. 변수명은 동일하게.*/{
		ModelAndView mv= new ModelAndView();
		MemoVO memo=null;
		String sql="select * from memoboard where id=?";
		
		PreparedStatement pstmt;
		try {
			pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()){
				int memonum = rs.getInt(1);
				String memoname = rs.getString(2);
				String memocontent = rs.getString(3);		
				//memo = ()
						
						//new MemoVO(memonum,memoname,memocontent);				
				mv.addObject("memo",memo);
				mv.setViewName("ds.jsp");				
				rs.close();
				pstmt.close();				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mv;
	
	
	
	}
}
