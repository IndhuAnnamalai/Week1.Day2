package week1.day2;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[]= {1,2,3,4,6,7,8};
		int temp;
		for (int i=0; i<=(numArray.length)-1;i++) {
			
			System.out.println(numArray[i]);
			System.out.println("I is :" +i);
			
			temp = i+1;
			
			if(temp!=numArray[i]) {
				System.out.println("The missing number in an array is: " + temp);
			break;
			}
			
		}
		
	}

}
