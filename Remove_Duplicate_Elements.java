package ArrayProblems;

import java.util.HashSet;


public class Remove_Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,9,9,2,1,4,6,5,7};
		int len = arr.length;
		
		//Using Hasset remove all duplicates 
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<len;i++) {
			set.add(arr[i]);
			
		}
		
		System.out.print(set +" ");
			
		
		

	}

}
