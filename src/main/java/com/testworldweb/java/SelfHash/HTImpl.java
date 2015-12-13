package com.testworldweb.java.SelfHash;

public class HTImpl {

	public static void main(String[] args) {
      MyHt ht=new MyHt();
      System.out.println(ht.put('a', 1));
      System.out.println(ht.put('b', 2));
      System.out.println(ht.put('c', 3));
      System.out.println(ht.put('d', 4));
      
      ht.print();
      System.out.println(ht.remove('d'));
      System.out.println(ht.put('c',5));
      System.out.println(ht.get('c'));
      ht.print();
	}

}
