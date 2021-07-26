package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import vo.MemoVO;

@Repository
public class OracleMemoDAO implements MemoDAO{
	
	@Autowired
	DriverManagerDataSource ds; //Connection

	public int insert(String id, String name,String content) {
		String sql="insert into memoboard values(?,?,?,sysdate)";
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

	@Override
	public List<MemoVO> getlist() {
		String sql="select * from memoboard";
		try {
			PreparedStatement pstmt=ds.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			List <MemoVO> list= new ArrayList<MemoVO>();
			while(rs.next()) {
				MemoVO memo= new MemoVO(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDate(4));
				list.add(memo);
			}
			
			rs.close();
			pstmt.close();
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MemoVO select(String id) {
		String sql="select * from memoboard where id=?";
		MemoVO mv=null;
		try {
			PreparedStatement pstmt=ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				mv= new MemoVO(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDate(4));				
			}
			System.out.println(mv.toString());
			rs.close();
			pstmt.close();
			return mv;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

	@Override
	public int update(String id, String name, String content) {
		String sql="update memoboard set name=?,content=? where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, content);
			pstmt.setInt(3,Integer.parseInt(id));
			
			int result=pstmt.executeUpdate();
			pstmt.close();
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
}
