package PrepInsta;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		
	}
	public static int sum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
