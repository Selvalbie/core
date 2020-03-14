package loopingstatement;
import java.util.Scanner;
public class PrimedigitGenerator {
	static int isPrime(int input) {
		int digit = 0;
		for (int i = 1; i <= input; i++) {// iterating each digit 
			int counter = 0;
			for (int j = i; j >= 1; j--) {// to check how many numbers gets divided 
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.print(i + " ");
				digit++;
			}
		}
		return digit+1;
	}
	public static void main(String[] args) {
		System.out.println("enter the input");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input==0) {
			System.out.println("kindly enter the valid input");
			System.exit(0);
		}
		System.out.print("the prime number are : 1 ");
		int digit = isPrime(input);
		System.out.println(" the count of prime number inside " + input + " is " + digit);
		scan.close();
	}

}
