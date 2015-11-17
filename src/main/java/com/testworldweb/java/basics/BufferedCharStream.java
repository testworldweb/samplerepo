package com.testworldweb.java.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class BufferedCharStream {

	public static void writeToFile(String fileName,String textToWrite) throws IOException
	  {
		
	        BufferedWriter output = null;
	        try {
	            
	            output = new BufferedWriter(new FileWriter(fileName));
	            output.write(textToWrite);
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } finally {
	            if ( output != null ) output.close();
	        }
		  
	  }
	public static void writeToFileCondensed(String fileName,String textToWrite) throws IOException
	  {
		
	        BufferedWriter output = new BufferedWriter(new FileWriter(fileName));
	            output.write(textToWrite);
	            if ( output != null ) 
	            	output.close();
	  
		  
	  }
	  public  static String readContentsCondensed(String filePath) throws IOException
	  {
		  BufferedReader br = new BufferedReader(new FileReader(filePath));
		 
		      StringBuilder sb = new StringBuilder();
		      String line = br.readLine();
		      while (line != null) 
		      {
		      sb.append(line);
		          sb.append(System.lineSeparator());
		          line = br.readLine();
		      }
		      br.close();
		  return sb.toString();
	  }
	  public  static String readContents(String filePath) throws IOException
	  {
		  BufferedReader br = new BufferedReader(new FileReader(filePath));
		  String everything ;
		  try {
		      StringBuilder sb = new StringBuilder();
		      //String line = br.readLine();
		      //while (line != null) {
		      String line=null;
		      while((line=br.readLine())!=null){
		      sb.append(line);
		          sb.append(System.lineSeparator());
		         // line = br.readLine();
		      }
		       everything = sb.toString();
		  } finally {
		      br.close();
		  }
		  return everything;
	  }
	
	  public  static String readContents1(String filePath) throws IOException
	  {
		  String everything ;
		  FileInputStream inputStream = new FileInputStream(filePath);
		  try {
		       everything = IOUtils.toString(inputStream);
		  } finally {
		      inputStream.close();
		  }
		return everything;
	  }
		  
	  
	  
	  
	  public static void main(String[] args) throws IOException {
	 System.out.println(readContents("textFile.txt"));
	 System.out.println("-------");
	 System.out.println(readContents1("textFile.txt"));
	 
	 writeToFileCondensed("writtenFile.txt","hello1");
	 
	 System.out.println("-------");
	 System.out.println(readContentsCondensed("textFile.txt"));
		}
}
