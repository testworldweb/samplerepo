package com.testworldweb.java.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtilitiesCharStream {

	public static void writeToFile(String fileName,String textToWrite) throws IOException
	  {
		  FileWriter fw=new FileWriter(fileName);
		  fw.write(textToWrite);
		  fw.close();
		  
	  }
	  
	  public  static void readContents(String filePath) throws IOException
	  {
		 	
			 FileReader fr=null;
				 fr =new FileReader(filePath);
				 int ch;
				 while((ch=fr.read())!=-1)
				 {
					 System.out.print((char)ch);
				 }
		
				fr.close();	
		
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
