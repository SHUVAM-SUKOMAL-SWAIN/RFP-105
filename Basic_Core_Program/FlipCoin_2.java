package Basic_Core_Program;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin_2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of timesyou want to flip the coin: ");
		int range=sc.nextInt();
		int counterHead=0,counterTail=0;
		if(range>0)
		{
			for(int i=1;i<=range;i++)
			{
				Random rad=new Random();
				double num=rad.nextDouble(1);//to get random number 0 to 1
				
				if(num<0.5)
					counterTail++;
				else 
					counterHead++;
			}
			int headPercnt=((counterHead*100)/range);
			int tailPercnt=((counterTail*100)/range);
			
			System.out.println("Percentage of head = "+headPercnt);
			System.out.println("Percentage of tail = "+tailPercnt);
		}
		
		else {
			System.out.println("Your choice should be a positive number");
		}
		
		sc.close();

	}

}
