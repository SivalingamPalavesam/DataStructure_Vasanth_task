package Subarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumNumberofsubsetOfArraySumValue 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = input.nextInt();
		int maxi[] = new int[200];
		int arr[] =new int[size];//-2, 9, 3, -7 , 1
		List<Integer> list= new ArrayList<>();
		System.out.println("Enter The Array Value is  :");
		for(int i = 0; i<arr.length ; i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the Subset Value is  :");
		int SubArray = input.nextInt();

		int largestArr = maxi[0];
		
		
		for(int i = 0;i <= size-1;i++)
		{
			for(int  j =0 ; j<=size-1;j++)
			{
				for(int  k =0;k<size;k++)
				{	
					for( int l=0;l<size;l++)
					{
						if(SubArray == 4)
						{
							maxi[i] = (arr[i]) + (arr[j]) + (arr [k]) + (arr[l]) ;
							//System.out.println("(  "+arr[i]+  "  ,  "  +arr[j]+  "  ,  "+arr[k]+  "  ,  "  +arr[l]+  "  )   => "+maxi[i]);
							for (int num : maxi)
							{
								if(largestArr<num)
								{
									largestArr=num;
								}

							}
						}
					}
					if(SubArray == 3)
					{
						maxi[i] = (arr[i]) + (arr[j]) + (arr [k]) ;
						//System.out.println("(  "+arr[i]+  "  ,  "  +arr[j]+  "  ,  "+arr[k]+  "  )   => "+maxi[i]);
						for (int num : maxi)
						{
							if(largestArr<num)
							{
								largestArr=num;
							}

						}
					}
				}
				if(SubArray == 2)
				{
					maxi[i] = (arr[i]) + (arr[j]) ;
					//System.out.println("(  "+arr[i]+  "  ,  "  +arr[j]+  "  )   => " +maxi[i]);
					for (int num : maxi)
					{
						if(largestArr<num)
						{
							largestArr=num;
						}

					}
				}
			}

		}System.out.println("The Maximum Value is  :"+largestArr);
	}
}
