package Functional_Program;


import java.util.Scanner;

public class SumOfThreeIntegerAddsToZero_2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=sc.nextInt();
	
		int array[]=new int[size];
		System.out.println("Enter the array elements:");
		for (int i=0;i<array.length; i++) 
			array[i]=sc.nextInt();
		int counter=0;
		
		for (int i=0;i<array.length-2; i++) 
		{
			for (int j=i+1;j<array.length-1;j++)
			{
				for (int k=j+1;k<array.length;k++)
				{
					int sum=array[i]+array[j]+array[k];
					if (sum==0)
					{
						++counter;
						System.out.println(counter+"th triplet= "+array[i]+","+array[j]+","+array[k]);
					}
				}
			}
		}
		System.out.println("Total number of triplets= "+counter);

	sc.close();
	}
}
