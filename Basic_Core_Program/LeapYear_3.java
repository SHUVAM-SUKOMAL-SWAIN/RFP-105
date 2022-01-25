package Basic_Core_Program;

import java.util.Scanner;

public class LeapYear_3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year after 1000: ");
		int year=sc.nextInt();
		
		if(year>1000)
		{
			if( ((year%4==0) && (year%100!=0)) || (year%400==0) )
				System.out.println(year+" is a leap year");
			else
				System.out.println(year+" is not a leap year");
		}
		else 
			System.out.println("Year must be greater than 1000");
		
		
		sc.close();
	}

}
