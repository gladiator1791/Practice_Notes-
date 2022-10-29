package ArrayProblems;

public class LargestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,6,44,66,34,96,90,7,48,86};
		int largest_Element = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				if(largest_Element<arr[i]) {
					largest_Element = arr[i];
				}
			}
			else if(largest_Element < arr[i+1]) {
				largest_Element = arr[i+1];
			}
			
		}
		
		System.out.print(largest_Element);
	}

}
