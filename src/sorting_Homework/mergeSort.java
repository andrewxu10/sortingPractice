package sorting_Homework;
import java.util.Arrays;

public class mergeSort {	
	
	public static void main(String[] args) {
		int [] x= {8,2,53,2,8,6,34,76};
		int [] y= mergeySort(x);
		System.out.println(Arrays.toString(y));
	}
	public static int[] mergeySort(int[] x) {
		if(x.length == 1) {
			return x;
		}
		return mergeymerge(mergeySort(Arrays.copyOfRange(x, 0, x.length/2)), mergeySort(Arrays.copyOfRange(x, x.length/2, x.length)));
	}
	public static int[] mergeymerge(int[] a, int b[]) {
		int i = 0; int j = 0; int z = 0; int[] ret = new int[a.length + b.length];
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				ret[z] = a[i];
				z++; i++;
			} else { 
				ret[z] = b[j];
				z++; j++;
			}
		}
		if(i == a.length) {
			while(j<b.length) {
				ret[z] = b[j];
				z++; j++;
			}
		}
		if(j == b.length) {
			while(i<a.length) {
				ret[z] = a[i];
				z++; i++;
			}
		}
		return ret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] mS(int[] x){ //7.3.17 practice
		if(x.length == 1) {
			return x;
		}
		int[] a = Arrays.copyOfRange(x, 0, x.length / 2);
		int[] b = Arrays.copyOfRange(x, x.length / 2, x.length);
		return m(mS(a),mS(b));
	}
	public static int[] m(int[] a, int[] b) { //7.3.17 practice
		int i = 0, j = 0, p = 0;
		int[] r = new int[a.length + b.length];

		while (i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				r[p] = a[i];
				p++; i++;
			} else {
				r[p] = b[j];
				p++; j++;
			}
		}
		if (j == b.length) {
			while(p < r.length) {
				r[p] = a[i];
				p++; i++;
			}
		}
		if (i == a.length) {
			while(p < r.length) {
				r[p] = b[j];
				p++; j++;
			}
		}
		return r;
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
