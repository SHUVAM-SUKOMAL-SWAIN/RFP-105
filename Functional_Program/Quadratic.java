package Functional_Program;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value : ");
		int a=sc.nextInt();
		System.out.println("Enter second value : ");
		int b=sc.nextInt();
		System.out.println("Enter third value: ");
		int c=sc.nextInt();
		
		System.out.println("Your expression is "+a+"x^2+"+b+"x+"+c);
		int delta = b*b - 4*a*c;
		if(delta<0)
			delta=delta*-1;
		
		double root1= (-b + Math.sqrt(delta))/(2*a);
		double root2= (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("The first root is= "+root1);
		System.out.println("The second root is= "+root2);
		
		
		sc.close();

	}

}
