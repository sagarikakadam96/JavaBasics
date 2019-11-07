package com.lti.io2;

import java.io.BufferedReader;
import java.io.FileReader;


public class FilesRead {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("d:/test.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) //reads and when it gets no value, you get -1
			System.out.print((char) i);
		br.close();
	}

}
