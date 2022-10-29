package ArrayProblems;

import java.util.ArrayList;

public class Intersection_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,4,5,6,7,8}; // Array must be sorted for this approach
		
		int nums[] = {1,2,5};
		
		ArrayList <Integer> al = new ArrayList<>();
		
		int i=0;
		int j=0;
		
		// 2pointers approach
		
		while(i<arr.length && j<nums.length) {
			if(arr[i]<nums[j]) {
				i++;
			}
			else if(arr[i]>nums[j]) {
				j++;
			}
			else {
				al.add(arr[i]);
				i++;
				j++;
			}
		}
		
		// print elements 
		for(int k=0;k<al.size();k++)
		{
			System.out.print(al.get(k)+" ");
		}

	}

}
