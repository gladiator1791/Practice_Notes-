package ArrayProblems;

public class Sorted_Array_Zeros_Onces_Twos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,2,0,1,2,1,2,0,0};
		int count_Zero=0,count_one=0,count_two=0;
		for(int i=0 ;i<nums.length;i++) {
			if(nums[i]==0) {
				count_Zero++;
			}
			else if(nums[i]==1) {
				count_one++;				
			}
			else {
				count_two++;
			}
		}
		int j=0;
		while(count_Zero!=0) {
			nums[j]=0;
			j++;
			count_Zero--;
		}
		while(count_one!=0) {
			nums[j]=1;
			j++;
			count_one--;
		}
		while(count_two!=0) {
			nums[j]=2;
			j++;
			count_two--;
		}
		for(int k=0;k<nums.length;k++)
		{
			System.out.print(nums[k]+" ");
		}

	}

}
