package Basic_Core_Program;

import java.util.Scanner;

public class CalculatePowerOfTwo_4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the power 31: ");
		int power=sc.nextInt();
		int num=2;
		
		if(power==0)
			System.out.println("2^0 =1");
		else if(power>0 && power<31)
		{
			for (int i=2;i<=power;i++)
				num=num*2;
		
			System.out.println("2^"+power+"="+num);
		}
		else 
			System.out.println("Invalid Input");
		sc.close();
	}

}
