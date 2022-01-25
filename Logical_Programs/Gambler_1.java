package Logical_Programs;

import java.util.Scanner;

public class Gambler_1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial amount of Stake:");
		int money=sc.nextInt();
		System.out.println("Enter the winning stake of the game:");
		int win=sc.nextInt();
		int bet=0,won=0;
		
		while (money>0 && money<win)
		{
			++bet;
			--money;
		
			double luck=Math.floor((Math.random()*10) % 2);
			
			if (luck==1)
			{
				++won;
				money=money+2;
			}
		}

		if (money==0)
			System.out.println("You Loose");
		else 
			System.out.println("You Won");
			
		System.out.println("Total money= "+money);
		System.out.println("Total number of bet made= "+bet);
		System.out.println("Number of times won="+won);
		
		sc.close();
	}

}
