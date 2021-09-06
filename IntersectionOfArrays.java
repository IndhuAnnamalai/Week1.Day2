package week1.day2;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstArray[]= {1,2,3,6,7,9};
		int secondArray[]= {2,5,7,8,9,10};
		for(int i =0;i<=(firstArray.length)-1;i++) {
			//System.out.println("Length of FirstArray: "+firstArray.length );
			for(int j=0;j<=(secondArray.length)-1;j++) {
				//System.out.println("Length of SecondArray : "+secondArray.length );
				if(firstArray[i]==secondArray[j]) {
					System.out.println("The intersection points are: " + secondArray[j]);
				}
			}
			
		}
	}

}
