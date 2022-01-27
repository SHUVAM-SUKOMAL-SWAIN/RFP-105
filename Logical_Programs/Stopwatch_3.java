package Logical_Programs;

import java.util.Scanner;

public class Stopwatch_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter any text,and you will get the time taken to write it");
		//System.out.println("If you are ready press 1 and enter your text and then press ENTER");
		//int choice=sc.nextInt();
		
			long old_time=System.currentTimeMillis();
			System.out.println("Enter text");
			String text=sc.nextLine();
			long new_time=System.currentTimeMillis();
			System.out.println("You took "+((new_time-old_time)/1000)+"seconds");

		
		sc.close();
		
	}

}
