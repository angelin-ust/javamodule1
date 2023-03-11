package day6;
import java.sql.*;
public class Exceptionaldemo5 {
static void method( ) throws SQLException{
	throw new SQLException("connection failed");
}
	public static void main(String[] args) throws SQLException {
		method();// try {
//	method();
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
	}

}
