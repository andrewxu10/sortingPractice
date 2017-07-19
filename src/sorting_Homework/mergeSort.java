package sorting_Homework;
import java.util.Arrays;
import java.util.Random;

public class mergeSort {	
	
	public static void main(String[] args) {
		int [] x= {8,2,53,2,8,6,34,76};
		int [] a= {8,2,53,2,8,6,34,76};
		
		int[] numbers = new int[20];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        
        
		//int [] y= mergeySort(x);
		
		int [] axu = mergeSortt(numbers);
		
		System.out.println(Arrays.toString(axu));
		
		//System.out.println(Arrays.toString(y));
		
	}
	
	public static int[] mergeSortt(int[] array) {
		if(array.length == 1) {
			return array;
		}
		int[] a = Arrays.copyOfRange(array, 0, array.length / 2);
		int[] b = Arrays.copyOfRange(array, array.length / 2, array.length);	
		return mergee(mergeSortt(a), mergeSortt(b));
	}
	
	public static int[] mergee(int[] a, int[] b) {
		int i = 0, j = 0, p = 0;
		int[] z = new int[a.length + b.length];
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				z[p] = a[i];
				p++; i++;
			}
			else  { //(b[j] < a[i])
				z[p] = b[j];
				p++; j++;
			}
		}
		if(i == a.length) {
			while(j < b.length) {
				z[p] = b[j];
				p++; j++;
			}
		}
		if(j == b.length) {
			while(i < a.length) {
				z[p] = a[i];
				p++; i++;
			}
		}
		return z;
	}
	
	public static int[] quickSort(int[] input, int start, int end) {
		int a = start, b = end, pivot = input[(end - start) / 2+start];
		//System.out.println("pivot value: " + pivot + " pivot index: " + ((end - start)/2 +a)) ;
		while(a<=b) {
			while(input[a] < pivot) {
				a++;
			}
			while(input[b] > pivot) {
				b--;
			}
			if(a<=b) {
				swap(input, a,b);
				a++; b--;
			}
		}
		if(start < b){ // && pivot > input.length - k 
			//System.out.println("start: " + start);
			quickSort(input, start, b);
		}
		if(a < end){ // && end >= input.length - k 
			//System.out.println("a: " + a);
			quickSort(input, a, end);
		}
		return input;
	}
	
	public static void swap(int[] input, int a, int b){
		int z = input[a];
		input[a] = input[b];
		input[b] = z;
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
