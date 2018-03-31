/*
 * (Find the two highest scores) Write a program that prompts the user to enter
the number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
 */
import java.util.Scanner;
public class c4_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int maxNumber = 0;
		int secondMaxNumber = 0;
		String maxNumberName = "";
		String secondMaxNumberName = "";
		
		System.out.println("Enter # of students: ");
		int numberOfStudents = input.nextInt();
		
		if (numberOfStudents == 0)
		{
			System.out.println("Error, students = 0. System.exit(1)");
			System.exit(1);
		}
		
		for (int i = 1; i <= numberOfStudents; i++)
		{
			System.out.println("Enter student name: ");
			String studentName = input.next();
			System.out.println("Enter student score: " );
			int studentScore = input.nextInt();
			if (studentScore >= maxNumber)
			{
				maxNumber = studentScore;
				maxNumberName += studentName + " ";
			}
			else if ((studentScore >= secondMaxNumber) && (studentScore < maxNumber))
			{
				secondMaxNumber = studentScore;
				secondMaxNumberName += studentName + " ";
			}
		}
		
		System.out.println("Student with the highest score: " + maxNumberName + " with score: " + maxNumber + "\nThe Student with the "
				+ "second highest score is: " + secondMaxNumber + " with score: " + secondMaxNumberName);
		
	}

}
