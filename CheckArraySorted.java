package ArrayProblems;

public class CheckArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,50,60,70,80,90,9};
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				
				if(i==arr.length-1) 
				{
					System.out.println("array is sorted");
				}
			}	
			else
				System.out.print("array is not sorted");
		}
		
	}

}
