import java.util.Arrays;

/*
	Insertion Sort is like sorting a hand of cards.
	Start from inserting the second card, you start comparing with the last card on
	your hand, until you find the place to insert in your current card.

	Best Case:
		O(n)
	Worse Case:
		O(n^2)
	Average Case:
		O(n^2)
*/

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
			int itemToInsert = arr[j];
			int i;
			for ( i = j-1; i >= 0; i -- )
			{
				int itemToCompareWith = arr[i];
				if (itemToCompareWith > itemToInsert)
				{
					// Shift item to compare with right and continue
					arr[i+1] = itemToCompareWith;
				}
				else
				{
					// Found the place for item to insert
					break;
				}
			} 
			// Insert the item	
			arr[i+1] = itemToInsert;
		}
	}
}
