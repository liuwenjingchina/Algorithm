import java.util.Arrays;
class MergeSort{
	public static void main (String [] args){
		int [] A = {1,4,2,6,9,3,0,8,5,7};
		System.out.println("the input array is:");
		System.out.println(Arrays.toString(A));
		doMergeSort(A, 0, A.length-1);
		System.out.println("The output array is:");
		System.out.println(Arrays.toString(A));
	}
	
	public static void doMergeSort(int [] A, int p, int r){
		if (p < r)
		{
			int q = (p+r)/2;
			doMergeSort(A, p, q);
			doMergeSort(A, q+1, r);
			merge(A, p, q, r);
		}	
	}

	public static void merge(int [] A, int p, int q, int r){
		int n1 = q - p + 1; 		//size of L
		int n2 = r - q; 		// size of R
		
		int[] L = new int[n1];
		int[] R = new int[n2];

		System.arraycopy(A, p, L, 0, n1);
		System.arraycopy(A, q+1, R, 0, n2);

		int i = 0, j = 0;	
		for ( int k = p; k <= r; k ++ )
		{	
			if ( i >= n1)
			{
				// all L has been added to A
				A[k] = R[j];
				j = j + 1;
			}
			else if (j >= n2)
			{
				// all R has been added to A
				A[k] = L[i];
				i = i + 1;
			}
			else if (L[i] <= R[j])
			{
				// L is smaller
				A[k] = L[i];
				i = i + 1;
			}
			else
			{
				// R is smaller
				A[k] = R[j];
				j = j + 1;
			}	
		}
		
	}
}
