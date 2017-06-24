package sorting_Homework;

import java.util.Arrays;

public class mergeSort {
	
	public static void main(String[] args) {
		int [] x= {8,7,5,6,2,4,3,1};
		int [] y= mSort(x);
		System.out.println(Arrays.toString(y));

		
		
//		int [] a= {8,7,5,6};
//		int [] b= {2,4,3,1};
		
//		int [] a= {1,2,3,4};
//		int [] b= {2,4,5,8};
		
//		int [] a= {8};
//		int [] b= {2};
//		int [] dick= merge(a,b);
//		System.out.println(Arrays.toString(dick));
		
//		int len = x.length;
//		int [] y= Arrays.copyOfRange(x, 0, len/2);
//		
//		System.out.println(len);
//		System.out.println(y.length);
	}
	
	public static int[] mSort(int[] x) {
		if(x.length == 1) { //sorted
			return x;
		}
		int[] a = Arrays.copyOfRange(x, 0, x.length/2);
		int[] b = Arrays.copyOfRange(x, x.length/2, x.length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		mSort(a);
		mSort(b);
		
		int[] sorted = merge(a,b);
		System.out.println(Arrays.toString(sorted));
		return sorted;
		
//		int[] sorted = new int[arrayA.length + arrayB.length];
//		
	}
	
	public static int[] merge(int[] arrayA, int[] arrayB) {
		int[] merged = new int[arrayA.length + arrayB.length];
		int a = 0, b = 0, c = 0;		
		while (a < arrayA.length && b < arrayB.length) {
			if (arrayA[a] < arrayB[b]) {
				System.out.println("hit1");
				merged[c] = arrayA[a];
				a++;
				c++;
			} else {
				System.out.println("hit2");
				merged[c] = arrayB[b];
				b++;
				c++;
			}		
		}
		while (c < merged.length) {
			if (a == arrayA.length) {
				System.out.println("hit3");
				merged[c] = arrayB[b];
				b++;
				c++;
			}		
		}
		while (c < merged.length) {
			if (b == arrayB.length) {
				System.out.println("hit4");
				merged[c] = arrayA[a];
				a++;
				c++;
			}
		}
		return merged;
	}

}
