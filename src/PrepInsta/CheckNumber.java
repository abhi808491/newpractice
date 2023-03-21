package PrepInsta;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CheckNumber nc=new CheckNumber();
		System.out.println(nc.isEven(n));
		

	}
	public int isEven(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println("Number is odd");
		}
		return n;
		
		
		//hi this is abhishek
			
	}

}
