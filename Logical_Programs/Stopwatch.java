package Logical_Programs;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch");
		int choice1=sc.nextInt();
		
		long old_time=System.currentTimeMillis();
		System.out.println("Press 0 to stop the stop watch");
		int choice2=sc.nextInt();
		long new_time=System.currentTimeMillis();
		System.out.println("You took "+((new_time-old_time)/1000)+"seconds");
		
		sc.close();

	}

}
