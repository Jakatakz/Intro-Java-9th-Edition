
public class c4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-15s%7s %5s %10s%15s" , 
				"Miles", "Kilometers", "|", "Kilometers", "Miles\n");
		
		for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j+=5)
			System.out.printf("%5d%20.1f%6s%11d%14.3f\n",i, (i * 1.609), "|", j, (j * .621));
			//System.out.println(i + "\t\t\t" + (i * 1.609));
		//look at page 114, i think this is mainly using printf and using %-11 etc to work this problem out
	}

}
