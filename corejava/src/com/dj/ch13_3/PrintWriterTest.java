package com.dj.ch13_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	
	public static void main(String[] args) {
		PrintWriter out = null;
		try {
//			out = new PrintWriter("src/com/dj/ch13_3/c.txt");
//			File file = new File("src/com/dj/ch13_3/c.txt");
//			out = new PrintWriter(new FileOutputStream("src/com/dj/ch13_3/c.txt"));
			out = new PrintWriter(new FileWriter("src/com/dj/ch13_3/c.txt"));
			out.println("test1");
			out.println("test2");
			out.println("test3");
			out.println("test4");
			out.println("test5");
			out.println("tom");
			out.println("zhangsan");
			out.println("lisi");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)out.close();
		}
	}
}
