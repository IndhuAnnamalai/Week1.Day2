package week1.day2;

public class FrequencyOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstArray[] = {3,4,2,5,1,2,6,3,6,2,4,7,1};
		int secondArray[]= new int[firstArray.length];
		
		int count = 0;
		int visited = -1;
		for(int i=0;i<firstArray.length;i++) {
			count = 1;
		for(int j=i+1;j<firstArray.length;j++) {
			if(firstArray[i]==firstArray[j]) {
				count++;
				secondArray[j]= visited;
				//System.out.println("The value of visited is: "+ visited);
				//System.out.println("The value of frequency array is: "+secondArray[j] );
			}
		}
		if(secondArray[i]!=visited) {
			secondArray[i]=count;
			
			System.out.println("The value of count is: " + count);
		}

		}
		
		for(int i=0;i<firstArray.length;i++) {
			if(secondArray[i]!=visited) {
				System.out.println("The number " + firstArray[i] + "occured" + secondArray[i] + " times");
			}
		}
	}

}
