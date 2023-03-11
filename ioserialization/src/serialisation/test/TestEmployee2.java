package serialisation.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
public class TestEmployee2 {
	
	
	/*
	 * void method() {
	 * 
	 * }
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
         FileInputStream fis=new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
         ObjectInputStream ois  =new   ObjectInputStream(fis);
         Object obj=ois.readObject();
         Employee ref=(Employee) obj;
         System.out.println(ref);
	}

}
