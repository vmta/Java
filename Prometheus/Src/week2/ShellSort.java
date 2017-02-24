package week2;

public class ShellSort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for (int k = length / 2; k > 0; k /= 2) {
			
			for (int i = k; i < length; i += 1) {
				
				int t = array[i];
				
				int j;
				
				for (j = i; j >= k; j -= k) {
					
					if (t < array[j - k]) {
						array[j] = array[j - k];
					} else {
						break;
					}
					
				}
				
				array[j] = t;
				
			}
			
		}
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
