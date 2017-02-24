package week2;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] array = {30, 2, 10, 4, 6, 7};
		int length = array.length;

		for (int i = 0; i < length; i++) {
			
			for (int j = i; j < length; j++) {
				if (array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
			
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
