package week1.day2;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,13,15,16,13,14,17,26,16,26};
		int count;
		
		for(int i=0;i<=(arr.length)-1;i++){
			count = 0;
			for (int j=i+1;j<=(arr.length)-1;j++) {
				if(arr[i]==arr[j]) {
					//System.out.println("The value is a duplicate");
					count++;
				}
			}
			if(count>0) {
				System.out.println("The duplicate values are: " + arr[i]);
			}
			
		}
		

}
}
