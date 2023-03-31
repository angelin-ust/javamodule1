package singleton;

public class TestConnection {
	public static void main(String[] args) {
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();
		//one object is created
		for(int i=1;i<=10;i++)
		{System.out.println(con1);
		System.out.println(con2);
	
		
		if(con1.equals(con2)) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}
	
	
	}
	

}
