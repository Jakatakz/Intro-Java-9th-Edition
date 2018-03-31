import java.util.Scanner;
public class c4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter positive and negative numbers,  ends if 0");
		
		Scanner input = new Scanner(System.in);
		
		int numbers;
		int sum = 0;
		int count = 0;
		int numPos = 0;
		int numNeg = 0;
		
		
		do {
			numbers = input.nextInt();
			if (numbers > 0)
				numPos++;
			else if (numbers < 0)
				numNeg++;
			sum += numbers;
			count++;
		} while (numbers != 0);
		
		double average = (double)sum / (double)count;	//don't need (double) just tesitng something
		
		System.out.println("The number of positives is: " + numPos + "\nThe Number of negatives is: " + numNeg + "\nThe total is " + count + "\naverage: " + average);
	}

}