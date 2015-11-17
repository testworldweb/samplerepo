package com.testworldweb.java.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstration of Runtime expections 
 * 1.NullPointerException
 * 2.ArrayIndexOutOfBoundsException
 * 3.ArithmeticException
 * 
 * And 
 * 1.Catching the exception to continue program flow
 * 2.Printing stacktrace of exception
 */
public class Checked {
	public static void main(String[] args) throws IOException {
		writeToFile("checked.txt", "Reading exceptions");
		
	}
	public static void writeToFile(String fileName,String textToWrite) throws IOException 
	  {
		  FileOutputStream fos;
		
			fos = new FileOutputStream(fileName);
			  fos.write(textToWrite.getBytes());
			  fos.close();
		
		
		  
	  }
}
