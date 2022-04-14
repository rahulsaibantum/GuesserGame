package com.wipro.calculator;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n=sc.nextInt();
		System.out.println("Enter Second number");
		int n1=sc.nextInt();
		int sum=n+n1;
		System.out.println("Addition="+sum);
	}
	

}
