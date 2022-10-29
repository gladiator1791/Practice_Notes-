package ArrayProblems;

public class All_Zeros_Move_To_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,0,5,3,0,0,1,3,4,0};
		int n=arr.length;
//		int temp[] = new int[n];		
		//int m=0;
		int count_Zero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count_Zero++;				
			}
		}		
		System.out.println("number of Zeros - "+ count_Zero);
		
		//shift all non zeros to the left
		int l=0;
		for(int m=0;m<n;m++)
		{
			if(arr[m]!=0) {
				arr[l]= arr[m];
				l++;
			}
		}
		// rest all elements becomes zero
		while(l<n) {			
				arr[l] = 0;		
				l++;
		}	
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");				
			}
		}

}


