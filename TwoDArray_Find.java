package ArrayProblems;

import java.util.Arrays;

public class TwoDArray_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,3,5},{16,15,19},{7,8,9},{12,14,17}};
		int k=15;
		System.out.println("=================Array without sorting===============");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++) {
			
				System.out.print(arr[i][j]+" ");
						
			}
			System.out.println();
		}
		
		System.out.println("================================");
		int row =0;
		int col =2;
		int i=0;
		int K=19;
		while(row<4 && col >=0) {
			if(arr[row][col]== K) {
				System.out.print("element is Prsent in the Array");
				break;
			}
			else if(arr[row][col]>K) {
				col--;
			}
			else 
				row ++;			
		}
		
		
	}

}
