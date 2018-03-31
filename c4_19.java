
public class c4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	;
		for (int i = 1; i <= 8; i++)
		{
			for (int j = i; j <= 8; j++)
				System.out.printf("%4s", " ");
			
			for (int k = 0; k <= i-1 ; k++)		//have to make 0 to get 1, have to -1 as well to get to work
				//System.out.printf("%4d", k);
				System.out.printf("%4d",(int)(Math.pow(2, k)));
			
			for (int k = i-2; k >= 0 ; k--)		//have to make 0 to get 1, have to -1 as well to get to work
				//System.out.printf("%4d", k);
				System.out.printf("%4d",(int)(Math.pow(2, k)));
			
			/*
			for (int k = i; k >= 1 ; k--)
				System.out.printf("%1d%1s", k, "  ");
			*/
			
			System.out.println();
		}
		
		
		
	}

}
