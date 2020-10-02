package Sorting;

import java.util.Scanner;

public class GcdFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m =sc.nextInt();
		int n =sc.nextInt();
		if(m>n) {
		gcdFinder(m,n);
		}
		else {
			gcdFinder(n,m);
		}
		System.out.println(n);
		
		
		
	}
	public static int gcdFinder(int m ,int n) {
		int r=m%n;
		while(r!=0) {
			 m=n;
			 n=r;
			 gcdFinder(m,n);
		}
		return n;

	}

}
