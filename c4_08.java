/*
 * (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name of the
student with the highest score.
 */
import java.util.Scanner;
public class c4_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter # of students: " );
		int numberOfStudents = input.nextInt();
		int currentHighestScore = 0;
		String nameHighestScore ="";
		
		for (int i = 1; i <= numberOfStudents; i++)
		{
			System.out.println("Enter student name");
			String studentName = input.next(); //<-- input.next(); works, look wat nextline does when running, goes past andruns the next syso
			System.out.println("Enter student score:");
			int score = input.nextInt();
			
			if (score > currentHighestScore)
			{
				currentHighestScore = score;
				nameHighestScore = studentName;
			}
		}
		System.out.println("Student with highest Score: " + nameHighestScore + " with Score of: " + currentHighestScore);
	}

}
