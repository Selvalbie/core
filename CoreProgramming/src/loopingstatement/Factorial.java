package loopingstatement;

import java.util.Scanner;

public class Factorial {

	static long armstrongGenerator(long input) {
		long result =1;
		for(long i =input;i>0;i--) {
			result *=i;// result = result* i
		}
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		long result =armstrongGenerator(input);
		System.out.println("the factorial of "+input +" is "+result);
		scan.close();
	}

}
