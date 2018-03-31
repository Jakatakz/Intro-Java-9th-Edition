/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/

import java.io.PrintStream;

public class ch4_P {

	public static void main(String args[]) {
		int count = 1;
		int number = 2;
		boolean isPrime = true;
		System.out.println("The prime numbers from 2 to 1000 are \n");
		for (; number <= 1000; number++) {
			isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor != 0)
					continue;
				isPrime = false;
				break;
			}

			if (isPrime) {
				if (count % 8 == 0)
					System.out.println(number);
				else
					System.out.print((new StringBuilder(String.valueOf(number))).append(" ").toString());
				count++;
			}
		}

	}
}

/*
import java.io.PrintStream;

public class ch4_P {

	public static void main(String args[]) {
		double tuition = 10000D;
		for (int count = 1; count <= 10; count++)
			tuition *= 1.05D;

		System.out.println((new StringBuilder("Tuition in ten years is ")).append(tuition).toString());
		double sum = tuition;
		for (int i = 2; i <= 4; i++) {
			tuition *= 1.05D;
			sum += tuition;
		}

		System.out.println((new StringBuilder("The four-year tuition in ten years is ")).append(sum).toString());
	}
}
*/
/*

import java.util.Scanner;
public class ch4_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 5;
		int timeStart = (int)(System.currentTimeMillis() / 1000);
		int count = 1;
		int numberOfCorrect = 0;
		
		while (count <= NUMBER_OF_QUESTIONS)
		{
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			if (number1 < number2)
			{
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What's " + number1 + " - " + number2 + "?");
			int answer = input.nextInt();
			
			if (number1 - number2 == answer)
			{
				System.out.println("Correct, " + number1 + " - " + number2 + " = " + answer);
				numberOfCorrect++;
			}
			else 
				System.out.println("Wrong, " + number1 + " - " + number2 + " !=" + answer);
			
			count++;
		}
		
		int timeEnd = (int)(System.currentTimeMillis() / 1000 );
		int timeTaken = timeEnd - timeStart;
		
		System.out.println("You had " + numberOfCorrect + "/5 correct.\nYou took " + timeTaken + " seconds for the test.");
		
	}
}
*/




//LISTING 4.3 GuessNumber.java
/*
import java.util.Scanner;
public class ch4_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int magicNumber = (int)(Math.random() * 101);
		System.out.println("guess number between 0 and 100");
		int guess = input.nextInt();
		while (guess != magicNumber)
		{
			if (guess < magicNumber)
				System.out.println("your guess is too low\ndebug: \nguess: " + guess + "  magicNumber: " + magicNumber);
			else
				System.out.println("your guess is too high\ndebug: \nguess: " + guess + "  magicNumber: " + magicNumber);
			
			System.out.println("Try Again: ");
			guess = input.nextInt();
		}
		
		System.out.println("Correct: \nguess: " +guess + " \nmagicNumber: " + magicNumber);
		
	}

}
*/