package PrepInsta;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int j=n;j<=m;j++)
		{
			int count=0;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
				count++;
				
		}
		if(count==0)
			System.out.println(j);
		

	}
	}

}
