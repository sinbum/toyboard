package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class OracleMemberDAO implements MemberDAO{
	//아 이렇게하니까 잘되는구나.
	@Autowired
	DriverManagerDataSource ds; //Connection

	public int insert(String id, String name,String content) {
		String sql="insert into memoboard values(?,?,?)";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1,Integer.parseInt(id));
			pstmt.setString(2, name);
			pstmt.setString(3, content);
			
			int result=pstmt.executeUpdate();
			pstmt.close();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
