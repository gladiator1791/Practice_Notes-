package ArrayProblems;

public class Multi_Dim_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[2][3]; //creation of 2D array
		//insertion element in array
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		arr[1][0] = 201;
		arr[1][1] = 202;
		arr[1][2] = 203;
		
		// access elements of array 
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}


	}

}
