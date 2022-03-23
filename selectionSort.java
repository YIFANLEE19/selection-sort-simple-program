/*
 * Selection sort
 * Steps 1: find the minimum element in array
 * Steps 2: place it at beginning
 */
public class selectionSort {
	
	static void sort(int arr[]) {
		//array length
		int n = arr.length;
		//one by one move
		for(int i=0;i<n-1;i++) {
			//set a minimum index
			int min_idx = i;
			//find minimum element
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_idx])
					min_idx = j;
			//swap the minimum element with the first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i]=temp;
			printArr(arr);
		}
	}//end sort array

	static void printArr(int arr[]) {
		for(int array:arr)
			System.out.print(array + " ");
			System.out.println();
	}//end print array
	
	public static void main(String[] args) {
		int arr[] = {12,76,32,89,67,21,77,100,28,77,88};
		System.out.println("Original arrays is");
		printArr(arr);
		System.out.println("\nAfter sorting is");
		sort(arr);
	}//end main method
}
