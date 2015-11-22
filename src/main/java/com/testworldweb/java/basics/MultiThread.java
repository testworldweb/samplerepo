package com.testworldweb.java.basics;

public class MultiThread implements Runnable {

	public void run() {
		for(int i=0;i<100;i++)
		{
		System.out.println("From Thread"+i);
		}
	}
	public static void main(String[] args) {
		
		MultiThread mt=new MultiThread();
		Thread t=new Thread(mt);
	//	t.start();
		for(int i=0;i<100;i++)
		{
		if(i==10)
		{
			t.start();
		}
		System.out.println("From Main"+i);
		}

	}

	

}
