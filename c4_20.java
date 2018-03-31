
public class c4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int count = 0;
		for (int i = 2; i<= 1000; i++) 
		{
			if (isPrime(i) && count <= 7)
			{
				System.out.print(i + " ");
				count++;
			}
			else if (isPrime(i) && count > 7 ) 
			{
				System.out.print("\n" + i + " ");
				count = 1;
			}
			
		}
			
	}
	//used https://en.wikipedia.org/wiki/Primality_test under Pseudocode to write this method
	public static boolean isPrime(int n) {
	       if (n <= 1) 
	           return false;
	       else if (n <= 3)
	        	   return true;
	       else if (n % 2 == 0 || n % 3 == 0)
	    	   return false;
	       int z = 5;
	       while ( z * z <= n)
	       {
	    	   if (n % z == 0 || n % (z + 2) == 0)
	    		   return false;
	    	   z = z + 6;
	       }
	       return true;
		}
	}
