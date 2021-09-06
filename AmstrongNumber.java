package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 370;
		int original = number;
		int rem, result,temp,quo;
		int sum =0;
		
		while (number!=0) {
			rem = number %10;
			result = (rem*rem*rem);
			//System.out.println(result);
			temp= result;
			sum = sum+temp;
			System.out.println(sum);
			quo = number/10;
			number = quo;
			
		}

		if (original == sum) {
			System.out.println("The number is Amstrong number");
		}
		else {
			System.out.println("The number is not Amstrong number");
		}
	}

}
