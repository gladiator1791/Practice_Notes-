package ArrayProblems;

public class Rotate_Array_With_K_Value {

	public static void main(String[] args) {
		
		int nums[]= {5,9,6,3,8,5};

		System.out.println("Orignal Array");
		for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }		
        	System.out.println();
        int k=3;
		
		int[] ans=new int[nums.length];
		
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%nums.length]=nums[i];
        }
        
        for(int i=0; i<ans.length; i++){
            nums[i]=ans[i];
        }
        
        System.out.println("Reversed K element Array");
        
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }

	}

}
