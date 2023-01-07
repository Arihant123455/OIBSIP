package com.arihant;

import java.util.Scanner;

public class NumberGuessingGame 
{

	static void NumberGuessingGame()
	{
		
		Scanner sc = new Scanner(System.in);
		int Number = (int)(100*Math.random());
		int rounds = 5;
		int prediction;
		int i;
		int oncemore;
		int points = 0;
		
		System.out.println("Welcome , This is Number Guessing Game.\n");
		System.out.println("All You Need To Do Is a To Guess A Number Between 1 To 100 .\n");
	
		for(i=0;i<5;i++)
		{
			System.out.println("Write Your Number Here :");
			prediction = sc.nextInt();
			
			if(prediction > 100 || prediction < 0)
			{
				System.out.println("Error !! Please enter number between 1 to 100 only.\n");
			}
			else if(prediction==Number)
			{
				System.out.println("The Number You Have Guessed is Correct !! Congratulations.\n");
				points+=10;
				System.out.println("Your Scored is like :"+points);
				break;
			}
			else if(prediction > Number && i!=rounds-1)
			{
				System.out.println("Sorry ! But Your Prediction Was Wrong. The Number is less than:"+prediction);		
			}
			else if(prediction < Number && i!=rounds-1)
			{
				System.out.println("Sorry ! But Your Prediction Was Wrong. The Number is more than:"+prediction);
			}
		}
		
		if(rounds==i)
		{
			System.out.println("Your Round Has Been Completed. The Number was:"+Number+"Press 0 to continue:"+"Thankyou so much !!\n");
			
			oncemore = sc.nextInt();
			if(oncemore==0)
			{
				NumberGuessingGame();
			}
			else
			{
			   System.out.println("Thankyou so much, keep playing !!");	
			   
			}
		}
		
	}
			
				
			
	public static void main(String[] args) 
	{
	  //	Task 2 - Number Guessing Game.
	 //	    By Arihant Jain.
		
         NumberGuessingGame();
	}

}
