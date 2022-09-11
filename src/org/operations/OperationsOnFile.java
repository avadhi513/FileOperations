package org.operations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class OperationsOnFile {
	
	public static void main(String[] args) throws IOException {
		// To create directory
		File f = new File("C://Java");
		boolean m = f.mkdir();
		System.out.println(m);
		
		// To create directories
		File f1 = new File("C://Java//Selenium");
		boolean mk = f1.mkdirs();
		System.out.println(mk);
		
		// To create a text file
		File f2 = new File("C://Java//Selenium//Dayone.txt");
		boolean cn = f2.createNewFile();
		System.out.println(cn);
		
		// To get the folder name
		File f3 = new File("C:\\");
		String[] l = f3.list();
		for(String x : l) {
			System.out.println(x);
		}
		
		// To get the folder name with location
		File f4 = new File("C:\\");
		File[] lf = f4.listFiles();
		for(File y : lf) {
			System.out.println(y);
		}
		
		// methods
		boolean d = f.isDirectory();
		System.out.println(d);
		
		boolean f5 = f2.isFile();
		System.out.println(f5);
		
		boolean h = f2.isHidden();
		System.out.println(h);
		
		boolean e = f2.exists();
		System.out.println(e);
		
		// Write
		File f6 = new File("C://Java//Selenium//Dayone.txt");
		FileUtils.write(f6, "Data");
		FileUtils.write(f6, "Jency", true);
		
		// Read
		File f7 = new File("C://Java//Selenium//Dayone.txt");
		FileUtils.readLines(f7);
		
	}

}
