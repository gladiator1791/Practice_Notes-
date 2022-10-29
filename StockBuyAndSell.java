package ArrayProblems;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int A[] = { 100, 180, 260, 310, 40, 535, 695 };
		// TODO Auto-generated method stub
		
		int min=A[0];
		int max = 0;
		int i=0;
		int j=i+1;
		while(i<A.length) {
			if(A[i]<A[j]) {
				int local_min = A[i];				
			//		System.out.println(local_min);
					i++;
					j++;
					if(local_min < min )
					{
						min = local_min;
					}					
			}		
			System.out.println(min);
		}
	
	
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<A.length;i++) {
//			min = Math.max(min,A[i]);
//			int profit = A[i]- min;
//			max = Math.max(profit,max);				
//			}
//		
//		System.out.println(max);
	}

}
