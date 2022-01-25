package Basic_Core_Program;

import java.util.Scanner;

public class FindPrimefactors_6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("The prime factors of "+num+" are:");
		
		for (int i=2;i<=num/2;i++)
		{
				if ( (num%i)==0 )
				{
					int c=0;
					for (int j=2;j<i;j++)
					{
						if ( (i%j)==0 )
						{
							c++;
							break;
						}
					}
					if (c==0)
					System.out.println(i);
				}
		}
		sc.close();
	}

}
