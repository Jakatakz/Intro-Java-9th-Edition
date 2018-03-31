/*
 * (Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds):

Kilograms Pounds
1 					2.2
3 					6.6
...
197 				433.4
199 				437.8

 */
//import java.util.Scanner;

public class c4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner input = new Scanner(System.in);
		
		System.out.println("Kilograms\tPounds");
		for (int n = 1; n <= 199; n+=2)
		{
			System.out.printf(" %-9d%18.1f\n", n, (n*2.2));
		}
		
	}

}
