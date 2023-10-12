package kc.ac.inje.comsi.board.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JDBCExam {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			conn = JDBCUtil.getConnection();
			System.out.println("Connection:" + conn);
			pstmt = conn.prepareStatement("select count(*) as cnt from board");
			rset = pstmt.executeQuery();
			rset.next();
			int count = rset.getInt("CNT");
			System.out.println("계시물의 수 : "+ count);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rset, pstmt, conn);
		}
	}

}
