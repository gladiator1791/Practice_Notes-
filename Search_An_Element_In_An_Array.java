package ArrayProblems;

public class Search_An_Element_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,6,9,3,8,7,1};
		int to_find= 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==to_find) {
				System.out.println("element is available in "+i+" position ");	
		
			}
		}
		
		System.out.println("element is not available in array ");

	}

}
