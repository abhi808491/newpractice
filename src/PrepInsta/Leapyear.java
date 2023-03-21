package PrepInsta;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%400==0 ||n%4==0 && n%100!=0)
			System.out.println("Leap year"+n);
		else
			System.out.println("Not Leap year"+n);
		System.out.println();
	}
}
