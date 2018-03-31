/*
 * (Display pyramid ) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
 */
import java.util.Scanner;
public class c4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 7; i++)
		{
			//these 3 for loops are seperating the problem into 3 parts
			//this first part creates the blank spaces before the numbers
			for (int k = 1; k <= 7-i; k++)
				System.out.print("  ");		//notice this is two spaces so it'll work with a variable and then a space , for example (j + " ") is 2 spaces.
			
			//this part creates everything that is a number from left to rigiht until the 1 column
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			
			//this part skips the first line and finishes off the 2nd numbers
			for (int z = 2; z <= i; z++)	//is 2 less than or equal to 1? no, so skip iteration, this starts u at 2nd line
				System.out.print(z + " ");
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter an intger 1 to 15: " );
		int numberOfLines = input.nextInt();
		
		for (int i = 1; i <= numberOfLines; i++)
		{
			System.out.println();
			for (int k = i; k <= numberOfLines-1; k++)
			{
				System.out.print("    ");
			}
			
			for (int s = numberOfLines; s>= i; s--)
			{
				System.out.print(s);
			}
			//System.out.print(i);
		}
		*/
		
		
		
		
		
	}

}
