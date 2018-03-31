/*
 (Repeat additions) Listing 4.4, SubtractionQuizLoop.java, generates five random
subtraction questions. Revise the program to generate ten random addition
questions for two integers between 1 and 15. Display the correct count and test
time.
 */

import java.util.Scanner;

public class c4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int testQuestionsGenerated = 0;
		int countCorrect = 0;
		
		long startTime = System.currentTimeMillis();
		
		while (testQuestionsGenerated < 10)
		{
			int number1 = (int)(Math.random() * 15);
			int number2 = (int)(Math.random() * 15);
			System.out.println("What is: " + number1 + " + " + number2 + "?");
			int answer = input.nextInt();
			if (number1 + number2 == answer)
				countCorrect++;
			testQuestionsGenerated++;
		}
		long endTime = System.currentTimeMillis();
		long quizDuration = (endTime - startTime) / 1000;
		
		System.out.println("Correct: " + countCorrect + " out of " + testQuestionsGenerated +"\nTime: " + quizDuration + " seconds");
		
	}

}
