package kc.ac.inje.comsi.board.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:D:/h2/db","sa","1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) pstmt.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		if(conn != null) {
			try {
				if(!pstmt.isClosed()) conn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	public static void close(ResultSet rset, PreparedStatement pstmt,Connection conn) {
		if(rset != null) {
			try {
				if(!pstmt.isClosed()) rset.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		close(pstmt, conn);
	}
	
}
