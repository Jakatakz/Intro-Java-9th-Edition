/*
 * (Find the smallest n such that n^2 >12,000) Use a while loop to find the smallest
integer n such that n^2 is greater than 12,000
 */
public class c4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		while ( (Math.pow(n, 2)) <= 12000)
		{
			n++;
		}
		System.out.println("The smallest integer such that n^2 is greater than 12000 is: " + n);
		
	}

}
