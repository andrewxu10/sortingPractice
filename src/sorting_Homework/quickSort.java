package sorting_Homework;

import java.util.Arrays;
import java.util.Random;

public class quickSort {
	static Random rand = new Random();
	
	public static void main(String[] args) {
		int [] x= {8,7,5,6,2,4,3,1};
		System.out.println(Arrays.toString(x));
		qSort(x, 0, 7);
		//int a = partition(x, 0, 7, 6);
		System.out.println(Arrays.toString(x));
		//System.out.println(a);

	}

	public static void qSort(int[] array, int start, int end) {
		if(end - start == 0){
			return;
		}
		if(start < end) {
			
			int pivot = start + (int)(Math.random() * ((end - start) + 1));
					//rand.nextInt(end - start + 1) -1 + start;
			System.out.println("start: " +start + "," + "end: " + end + "pivot: " + array[pivot]);
			int index = partition(array, start, end, pivot);
			
			if(start < index - 1) {
				qSort(array, start, index - 1);
			}
			if(index < end) {
				qSort(array, index, end);
			}
			
		}
		
		
	}
	
//	public static int partition(int[] array, int start, int end, int piv) {
//		int left = start, right = end, pivot = array[piv];
////		if (left > right) {
////			return start;
////		}
//		while (left < right) {
//			while(array[left] < pivot && left < array.length) {
//				left++;
//			}
//			while(array[right] >= pivot && right > 0) {
//				right--;
//			}
//			if(left<right && array[left] >= pivot && array[right] < pivot) { //
//				
//					int temp = array[left];
//					array[left] = array[right];
//					array[right] = temp;
//					
//				System.out.println( "...swapping...");	
//				System.out.println(Arrays.toString(array));
//				
//				left++;
//				right--;
//			//} else {
//			//	System.out.println( "...NO SWAP!...");
//			}
//		}
//		return left;
//	}
	
	public static int partition(int[] array, int start, int end, int piv) {
		int left = start, right = end, pivot = array[piv]; //dynamic boiz
		System.out.println(Arrays.toString(array));
		
		if (left >= right) {
			return start;
		}
		
		while (left < right) {
			
			while(array[left] < pivot && left < array.length) {
				left++;
			}
			while(array[right] >= pivot && right > 0) {
				right--;
			}
			System.out.println("left: " + left + "," + "right: " + right + "," + "pivot value: " + pivot);
			if(left<right && array[left] >= pivot && array[right] < pivot) { //
				
					int temp = array[left];
					array[left] = array[right];
					array[right] = temp;
					
				System.out.println( "...swapping...");	
				System.out.println(Arrays.toString(array));
				
				left++;
				right--;
			//} else {
			//	System.out.println( "...NO SWAP!...");
			}
		}
		return left;
	}
}
