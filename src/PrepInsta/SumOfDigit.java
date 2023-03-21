package PrepInsta;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SumOfDigit nc=new SumOfDigit();
		System.out.println(nc.sumOfDigit(n));

	}

	public int sumOfDigit(int n) {
		int sum = 0;
		while (n != 0) {

			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}

}
