package ArrayProblems;

public class Missing_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,0,3};
		
		int max= 0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1]) {
				max = nums[i];
			}
			else
				max= nums[i+1];
		}
		
		System.out.println("Max "+ max);
		
		int sum=0;
		//===================================================			
		for(int i=1;i<=max;i++) {
			sum += i;
		}
		//===================================================		
		System.out.println("Sum" + " " +sum);
		
		int total=0;
		//===================================================		
		for(int i=0;i<nums.length;i++) {
			total += nums[i];
		}
		System.out.println("Total "+total);
		
		
		int missing_ele = sum-total;
		
		System.out.println("missing element " + missing_ele);
	}

}
