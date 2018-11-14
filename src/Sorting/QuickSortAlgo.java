package Sorting;

public class QuickSortAlgo {
	
	static void Quicksort(int arr[], int start, int end){
		if(start < end){
		int pIndex = Partition(arr, start, end);
		Quicksort(arr, start, pIndex-1);
		Quicksort(arr, pIndex+1, end);
		}
	}
	
	static int Partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i = start;i<end;i++){
			if(arr[i]<=pivot){
				//swap(arr[i],arr[pIndex]);
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		//swap(arr[pIndex],arr[end]);
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		return pIndex;
	}
	static void swap(int i, int pIndex) {
		// TODO Auto-generated method stub
		int temp = i;
		i = pIndex;
		pIndex = temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,2,1,6,8,5,3,4};
		Quicksort(arr, 0, arr.length-1);
		for(int i = 0;i<arr.length;i++)
			System.out.print(" " + arr[i]);
	}

}
