package loopingstatement;
import java.util.Scanner;
public class ArmstrongChecker {
	static int digit = 0;
// calculate the digits in the input 
	static void calculateDigit(long input) {
		while (input > 0) {
			input = input / 10;
			digit++;
		}
	}
	// check whether the input is armstrong or not
	static double armstrongChecker(long input) {
		calculateDigit(input);
		long temp =0;
		double result =0;
		while(input>0) {
			temp = input%10;// separtion of digit
			input =input/10;//decreasing the digit in the input
			result = result+Math.pow(temp, digit);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		double num = armstrongChecker(input);
		if (num == input) {
			System.out.println(input + "  is an armstrong number");
		} else {
			System.out.println(input + " is not an armstrong number");
		}
		scan.close();
	}
}
