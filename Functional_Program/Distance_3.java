package Functional_Program;

import java.util.Scanner;

public class Distance_3 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X-coordinate:");
		int x=sc.nextInt();
		System.out.println("Enter the Y-coordinate:");
		int y=sc.nextInt();

		 double length=Math.sqrt( Math.pow((x-0),2)+ Math.pow((y-0),2) );
		
		 System.out.println("Length of the line from the origin= "+length);
		 
		 sc.close();

	}

}
