import java.util.Scanner;

/**
	This is a personal project
	
	I can use this program to calculate the average of my
	homework grades
*/

public class MathGradeCalc
{	
	public static void main(String[] args)
	{
		boolean status = true;
		Scanner keyboard = new Scanner(System.in);
		
		// Calculate the average of each homework
		do
		{		
			// Get the number of grades from the user
			System.out.print("How many homeworks are there? : ");
			double homeworks = keyboard.nextInt();
		
			double average = 0.0;			// To hold the accumulated average
			double addingAverage = 0.0;
			double percentAverage = 0.0;	// The percentage average(readability)
			double totalQuestions;
			double totalCorrect;
		
			for(int i = 0; i < homeworks; i++)
			{
				System.out.println("\nHomework #" + (i + 1));
			
				// The total number of questions
				System.out.print("Enter the total number of questions: ");
				totalQuestions = keyboard.nextDouble();
			
				// The number of correct answers
				System.out.print("Enter the number of correct answers: ");
				totalCorrect = keyboard.nextDouble();
				
				// Calculate the current homework's grade
				average = totalCorrect / totalQuestions;
				percentAverage = average * 100;
				
				// Add the grade to the total average placeholder
				addingAverage += percentAverage;
				
				// Display the average of that homework
				System.out.printf("The average is %.2f%%\n", percentAverage);
			}
		
			// Calculate and display the average for all homeworks
			double totalAverage = (addingAverage / homeworks);
			System.out.printf("\nThe homework average is %.2f%%\n", totalAverage);
			
			// Calculate letter grade
			if(totalAverage < 65)
			{
				System.out.println("Your grade is F");
			}
			else{
				if(totalAverage < 70)
				{
					System.out.println("Your grade is D");
				}
				else{
					if(totalAverage < 80)
					{
						System.out.println("Your grade is C");
					}
					else{
						if(totalAverage < 90)
						{
							System.out.println("Your grade is B");
						}
						else{
							if(totalAverage <= 100)
							{
								System.out.println("Your grade is A");
							}
							else{
								System.out.println("ERROR IN CALCULATION");
							}
						}
					}
				}
			}
			
			
			status = again();
			
		} while (status == true);
		
	}

	/*
		The again method asks if the user would
		like to calculate another set of scores
		@return The status
	*/
	public static boolean again()
	{
		boolean status;
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("\nWould you like to calculate another " +
							"set of scores?");
		String str = keyboard.nextLine();
		char reply = str.charAt(0);
	
		if(reply == 'y' || reply == 'Y')
			status = true;
		else
			status = false;
		
		return status;
	}
}