package stackprogram;

import java.util.Scanner;
/**
 * 
 * @author Sivalingam
 *
 */
public class LongestSequence {

	public static void main(String[] args)
	{
		int k=3,c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=input.nextInt();

		int [] arr = new int[size]; //1 3 1 4 5 7 10 

		System.out.println("Enter the array value :");

		for(int i =0; i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i = 0;i<arr.length;i++)
		{
			for(int j =1;j<arr.length;j++)
			{
				if(arr[j]>arr[i] && arr[j]-arr[i]>=k)
				{
					System.out.println(arr[j]+" - "+arr[i]+" >= "+k );
					System.out.println();
					c++;
				}
			}

		}System.out.println("The result is :"+c);
	}

}
