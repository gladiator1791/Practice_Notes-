package ArrayProblems;

public class Rearrange_Array_Elements_by_Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  nums[] = {3,1,-2,-5,2,-4};
		int []ans = new int[nums.length];
        //int []neg =new int[nums.length];
		int even_idx =0;
		int odd_idx =1;
        for(int i=0;i< nums.length;i++) {
        	if(nums[i]>0) {
        		ans[even_idx] = nums[i];
        		even_idx +=2 ;
        	}
        	else {
        		ans[odd_idx] = nums[i];
        		odd_idx += 2;
        	}
        		
        	
        }
        System.out.print("{");
        for(int i=0;i<nums.length-1;i++) {
        System.out.print(ans[i]+" ");
        }
        System.out.print("}");

	}

}
