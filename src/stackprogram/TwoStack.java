package stackprogram;

import java.util.Scanner;
import java.util.Stack;

public class TwoStack 
{
	public static void main(String[] args)
	{
		int c=0,count=0;
		Scanner input = new Scanner(System.in);
		Stack<Integer>  stack1 = new Stack<Integer>();// 7, 5, 1, 6, 1
		Stack<Integer>  stack2 = new Stack<Integer>();
		Stack<Integer>  stack3 = new Stack<>();
		System.out.println("Enter First Stack size");
		int size1 = input.nextInt();
		System.out.println("Enter  Stack value :");
		char[] str ;
		for(int i = 0 ;i <size1 ; i++)
		{
			stack1.add(input.nextInt());
		}
		System.out.println("Enter Second Stack size :");
		int size2 = input.nextInt();
		System.out.println("Enter Stack Value :");

		for(int i = 0 ; i<size2;i++)
		{
			stack2.add(input.nextInt());
		}
		for(int i=stack1.size()-1;i>=0;i--)
		{
			if(12>stack1.get(i) && 12>(stack1.get(i)+c)) 
			{
				c = c + (stack1.get(i));				
				stack1.remove(i);
				count++;
			}
			else 
			{
				stack1.pop();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			}		
		}
		for(int i=stack2.size()-1;i>=0;i--)
		{
			if(12>stack2.get(i) && 12>(stack2.get(i)+c)) 
			{
				c = c + (stack2.get(i));				
				stack2.remove(i);
				count++;
			}
			else 
			{
				stack2.pop();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			}		
		}	
		System.out.println("The Result is :"+count);
	}
}
