package Functional_Program;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("The formula is not valid if temperature is larger than 50 in absolute value or if velocity is \r\n"
				+ "larger than 120 or less than 3");
		System.out.println("Enter temperature of the wind in Fahrenheit: ");
		int temp=sc.nextInt();
		System.out.println("Enter velocity of the wind in miles per hour: ");
		int vel=sc.nextInt();
		//double cal=Math.pow(temp,vel);
		
		if(temp<50 && vel<120 && vel>3)
		{
		double mul=Math.pow(vel,0.16);
		double chill=35.74+(0.6215*temp)+(((0.4275*temp)-35.75)*mul);
		System.out.println("The wind chill = "+chill);
		}
		else 
			System.out.println("The value you entered are not in range");
		
		sc.close();

	}

}
