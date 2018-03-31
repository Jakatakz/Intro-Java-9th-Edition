/*
 * (Find the largest n such that n3 < 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000
 */
public class c4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		while ( (Math.pow(n,  3) < 12000))
		{
			n++;
		}
		System.out.println("The largest integer n , less than 12000 is: " + (n-1));
		
	}

}
