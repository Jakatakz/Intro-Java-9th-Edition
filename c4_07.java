/*
 * (Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. Write a program that
computes the tuition in ten years and the total cost of four years’ worth of tuition
starting ten years from now.
 */
public class c4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tuition = 10000;
		
		for (int year = 1; year <=10; year++)
		{
			tuition *= 1.05;
		}
		
		System.out.println("Tuition in ten years: " + tuition);
		double sum = tuition;
		for (int i = 1; i<=3; i++)				//this only 3, idk y its that when it say 4 years worth but watever.
		{
			tuition *= 1.05;
			sum +=tuition;
		}
		
		System.out.println("total cost of four years worth in ten years from now: " + sum);
		
	}

}
