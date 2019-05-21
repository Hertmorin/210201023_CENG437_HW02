
public class Main {

	public static void main(String[] args) {
		int array[] = { 9, 4, 8, 5, 1, 2, 7, 6, 3 };
		InsertionSort.insertionSort(array);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
