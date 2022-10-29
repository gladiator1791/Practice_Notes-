package ArrayProblems;

public class Maximum_Number_Of_Once_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int [3][3];
		arr[0][0] = 0;
		arr[0][1] = 0;
		arr[0][2] = 1;
		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[1][2] = 1;
		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		
		int max =0;
		int n = arr.length;
		//int counter =0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;i<arr[i].length;j++)
				
			{
				int counter=0;
				
				if(arr[i][j]==1)
				{
					counter++;
				}
				
				if(counter > max) 
				{
					max=counter;
				}
				
			}
		}
		
		System.out.println(max);

	}

}
