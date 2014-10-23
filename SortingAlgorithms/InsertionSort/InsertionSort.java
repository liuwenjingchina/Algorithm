import java.util.Arrays;
class InsertionSortApp {
	public static void main (String[] args){
		int [] arr = {5,4,2,7,8,9,3,11,10,6};
		System.out.println("The input is:");
		System.out.println(Arrays.toString(arr));
		InsertionSortApp.insertionSort(arr);
		System.out.println("The output is:");
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int [] arr){
		for ( int j = 1; j < arr.length; j ++ )
		{
			int key = arr[j];
			int i;
			for ( i = j-1; i >= 0; i -- )
			{
				if (arr[i] > key)
				{
					arr[i+1] = arr[i];
				}
				else
				{
					break;
				}
			} 	
			arr[i+1] = key;
		}
	}
}
