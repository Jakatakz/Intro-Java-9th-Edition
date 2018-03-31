
public class c4_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ) Write a program
that displays the following two tables side by side (note that 1 kilogram is 2.2
pounds and that 1 pound is .453 kilograms):
 */
		
		System.out.printf("%-15s%7s%5s%10s%15s" , "Kilograms", "Pounds", "|", "Pounds", "Kilograms\n");
		for (int i = 1, j = 20; i <= 199 && j <= 515; i+= 2, j+=5)
			System.out.printf("%9d%13.1f%5s%10d%14.2f\n",i, (i * 2.2), "|", j, (j * .453));
			//System.out.println(i + "\t\t\t" + (i * 1.609));
		//look at page 114, i think this is mainly using printf and using %-11 etc to work this problem out
		
	}

}
