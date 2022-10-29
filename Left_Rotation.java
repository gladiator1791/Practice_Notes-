package ArrayProblems;

public class Left_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,6,9,8,4,5};
		int r=2;		

		// bruteforce algo used to left rotation of array
		while(r!=0) {
			
			int temp = arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1] = temp;
			
			r--;
		}
		
		for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]+ " ");
			}
	}

}
