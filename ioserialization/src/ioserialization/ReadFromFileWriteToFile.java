package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFileWriteToFile {
public static void main(String args[]) throws IOException
{	
	FileReader reader=new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
    BufferedReader buffer=new BufferedReader(reader);
	
    FileWriter writer=new FileWriter("Copy.txt");
    String data=null;
    while((data=buffer.readLine() )!= null) {
    	
    	writer.write(data + "\n");
    	
    }
writer.flush();
writer.close();
reader.close();
buffer.close();
}
}
