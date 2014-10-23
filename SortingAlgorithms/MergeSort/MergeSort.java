import java.util.Arrays;
class MergeSort{
	public static void main (String [] args){
		int [] arr = {1,4,2,5,8,3,9,10,7,6};
		System.out.println("the input array is:");
		System.out.println(Arrays.toString(arr));
		doMergeSort(arr, 0, ,);
		System.out.println("The output array is:");
		System.out.println(arr);
	}
	
	public static void doMergeSort(int [] arr, int p, int r){
		if (p < r)
		{
			q = (p+r)/2;
			doMergeSort(arr, p, q);
			doMergeSort(arr, q+1, r);
			merge(arr, p, q, r);
		}	
	}

	public static void merge(int [] arr, int p, int q, int r){
		n1 = q - p + 1;
		n2 = r - q;
		int L[] =  
	}
}
