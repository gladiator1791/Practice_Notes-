package ArrayProblems;



import java.util.Scanner;
public class Cyclically_Rotate_An_Array_By_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int nums[] = new int[scn.nextInt()];
		System.out.println("Enter Elements of Array");
		for(int i=0;i<nums.length;i++) {
			nums[i] = scn.nextInt();
		}
		
		
		System.out.println("Elements of Array Are - ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		
		int last = nums[nums.length -1];
		for(int j=nums.length-1;j>0;j--) {
			nums[j]=nums[j-1];
		}
		nums[0] = last;
		System.out.println("");	
		System.out.println("Cyclically rotate Elements of Array Are - ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

	}

}
