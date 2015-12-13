package com.testworldweb.java.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ArithmeticStack {
	public static void main(String[] args) {
	String exp="(((8/(3+1))*10)-15)";
	Stack<Character> s=new Stack<Character>();
	int operand1=Integer.MIN_VALUE;
	int operand2=Integer.MIN_VALUE;
	char operator='`';
	for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)==')')
			{
				char popped=s.pop();
			    while (popped!='(')
			    {
			    	if(isNumeric(popped))
			    	{
			    		if(operand2==Integer.MIN_VALUE)
			    		{
			    			operand2=Integer.parseInt(popped+"");
			    		}
			    		else if(operand1==Integer.MIN_VALUE)
			    		{
			    			operand1=Integer.parseInt(popped+"");
			    			int ans=0;
			    			switch(operator)
						    {
						    
						    case '+': ans= 	operand1 + operand2;
						               break;

						    case '-': ans= 	operand1 - operand2;
						               break;

						    case '*': ans= 	operand1 * operand2;
						               break;

						    case '/': ans= 	operand1 / operand2;
						               break;          
						     
						    }
			    			if(s.peek()=='(')
			    			s.pop();	
						    s.push(Character.forDigit(ans,10));
						    operand1=Integer.MIN_VALUE;
						    operand2=Integer.MIN_VALUE;
						    
			    		}
			    	}
			    	else if(isOperator(popped))
			    	{
			    		operator=popped;
			    	}
			    	popped=s.pop();
			    }
			    
			    
			    //continue;//dont increase i fr this case
			}
			else
			{	
			s.push(exp.charAt(i));
			}
		}
	System.out.println(Arrays.toString(s.toArray()))
	;
	}
	public static boolean isNumeric(char x)
	{
		try
		{
			Integer.parseInt(x+"");
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
	public static boolean isOperator(char x)
	{
		if ((x=='+')||(x=='-')||(x=='*')||(x=='/'))
			return true;
		else
			return false;
		
	}
}
