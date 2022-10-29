package ArrayProblems;



public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,6,7,8,9,3,4,5,1};
		int n= arr.length;
		int j=0;
		System.out.print("Orignal Array is  - ");
		for(int k=0;k<n;k++) 
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println ("");
		int arr2[]= new int[n];
		
		for(int i=n-1;i>=0;i--)
		{
			arr2[j]= arr[i];
			j++;
		}
		System.out.print("Reversed  Array is - ");
		for(int k=0;k<n;k++) 
		{
			System.out.print(arr2[k]+" ");
		}
	}

}
