package ArrayProblems;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,0,0,1,1,1,1};
		// TODO Auto-generated method stub
		int ans =0,count=0, j=-1, k=2;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				count++;				
			}
			
			while(count>k) {
				j++;
				if(arr[j]==0) {
					count--;
				}
			}
			int len = i-j;
			if(len>ans){
				ans = len;
			}			
		}
		System.out.println(ans);
	}

}
