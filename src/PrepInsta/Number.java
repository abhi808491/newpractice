package PrepInsta;

import java.util.Scanner;

public class Number {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Number nc=new Number();
		String s=numberType(n);
		System.out.println(s);
	}
	public static String numberType(int n)
	{
		if(n>0)
			return "Number is positive";
		else
			return "negative";
	}
	}


