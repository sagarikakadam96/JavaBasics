package com.lti.io2;

import java.io.*; //file handling(input output) is used to store data(results) into file permanently

public class FilesWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:/test.txt",true); //true will append when the prog is run again. if true is not written, it will rewrite.
		BufferedWriter bw=new BufferedWriter(fw); //buffered gives faster cache memory access
		bw.write("Welcome to LTI, mumbai");
		System.out.println("success");
		bw.close();
	}

}
