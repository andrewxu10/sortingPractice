package sorting_Homework;
import java.util.Arrays;

public class mergeSort {	
	
	public static void main(String[] args) {
		int [] x= {8,7,5,6,2,4,3,1};
		int [] y= mSort(x);
		System.out.println(Arrays.toString(y));
	}
	
	public static int[] mSort(int[] x) {
		if(x.length == 1) { //sorted
			return x;
		}
		int[] a = Arrays.copyOfRange(x, 0, x.length/2);
		int[] b = Arrays.copyOfRange(x, x.length/2, x.length);
		int[] sorted = merge(mSort(a),mSort(b));
		return sorted;
	}
	
	public static int[] merge(int[] arrayA, int[] arrayB) {
		int[] merged = new int[arrayA.length + arrayB.length];
		int a = 0, b = 0, c = 0;		
		while (a < arrayA.length && b < arrayB.length) {
			if (arrayA[a] < arrayB[b]) {
				merged[c] = arrayA[a];
				a++;
				c++;
			} else {
				merged[c] = arrayB[b];
				b++;
				c++;
			}		
		}
		while (c < merged.length && b < arrayB.length) {			
			if (a == arrayA.length) {
				merged[c] = arrayB[b];
				b++;
				c++;
			}		
		}
		while (c < merged.length && a < arrayA.length) {
			if (b == arrayB.length) {
				merged[c] = arrayA[a];
				a++;
				c++;
			}
		}
		return merged;
	}
}
