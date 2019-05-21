
public class InsertionSort {
	
	public static int[] insertionSort(int arr[]) {
		int n = arr.length;
		if(n < 2)
			return arr;
		else {
			int i, key, j;
			for (i = 1; i < n; i++){
				key = arr[i];
				j = i-1;
				while (j >= 0 && arr[j] > key){
					arr[j+1] = arr[j];
					j = j-1;
				}
				arr[j+1] = key;
			}
			return arr;
		}
	}
}
