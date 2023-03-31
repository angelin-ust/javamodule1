package singleton;

public class Connection {
static Connection con;
private Connection() {
	
}




public static Connection getConnection() {
	if(con!=null) {
		return con;
	}
	else
		con=new Connection();
	return con;}
//} singleton aneee 1) static akknum 2)private constructor 3)same object a pine pinee call cheyum

//	return new Connection();
}

