package stackprogram;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Sivalingam P
 * @version 24-05-2022
 */
public class MaximumLengthOfIndexJumping {

	public static void main(String[] args) 
	{
		int k = 3, maxi = 0,key =0,value=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=input.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>(size); //4, 5, 7, 3, 10, 2 

		System.out.println("Enter the array value :");
		for(int i =0; i<size;i++)
		{
			arr.add(input.nextInt());
		}
		for(int i =0;i<arr.size();i++)
		{
			for(int j=1; j<arr.size();j++)
			{
				if(arr.get(j)>arr.get(i) && arr.get(j) -arr.get(i)>=k)
				{
					 maxi= arr.get(j)- arr.get(i);
					 key = arr.get(i);
					 value = arr.get(j);
					
				}
			}
		}
		
		System.out.println("The pair is [i][j] :("+key+","+value+")\nMaximum length of index Jumping  possible is :"+maxi);
	}

}
