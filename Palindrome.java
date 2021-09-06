package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12321;
		int temp = number;
		int rem;
		int quo;
		int result = 0;
		
		while(number!=0) {
			rem = number%10;
			result = (result*10)+rem;
			quo = number/10;
			number = quo;
		}
		
		if (result == temp) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}
	}

}
