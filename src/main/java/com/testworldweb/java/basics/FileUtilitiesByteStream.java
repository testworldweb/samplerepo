package com.testworldweb.java.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtilitiesByteStream {

	public static void writeToFile(String fileName,String textToWrite) throws IOException 
	  {
		  FileOutputStream fos=new FileOutputStream(fileName);
		  fos.write(textToWrite.getBytes());
		  fos.close();
		  
	  }
	  
	  public  static void readContents(String filePath) throws IOException
	  {
		 
			
			 FileInputStream fis=new FileInputStream(filePath);
				 /*int b;
				 while((b=fis.read())!=-1)
				 {
					 System.out.print((char)b);
				 }*/
			   int b =fis.read();
			   while(b!=-1)
			   {
				   System.out.print((char)b);
				   b=fis.read();
			   }
				fis.close();
			
			
		
	  }
	  public static void main(String[] args) {
		try {
		readContents("textFile.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
}
