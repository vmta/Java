package week2;

public class BinarySearch {

	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		int startIndex = 0;
		int endIndex = data.length - 1;
		
		while (startIndex <= endIndex) {
			int middleIndex = startIndex + (endIndex - startIndex) / 2;
			if (numberToFind < data[middleIndex]) {
				endIndex = middleIndex - 1;
			} else if (numberToFind > data[middleIndex]) {
				startIndex = middleIndex + 1;
			} else {
				System.out.print(middleIndex);
				return;
			}
		}
		System.out.print("-1");
	}

}
