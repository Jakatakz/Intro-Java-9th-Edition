/*
 * (Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space
 */
public class c4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 33; i <= 126; i++)
		{
			if (count < 10)
			{
			System.out.print((char)i + " ");
			count++;
			}
			else 
			{
				System.out.print("\n" + (char)i + " ");
				count=1;
			}
		}
		
	}

}
