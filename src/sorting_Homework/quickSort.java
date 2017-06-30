package sorting_Homework;

import java.util.Arrays;
import java.util.Random;

public class quickSort {
	static Random rand = new Random();
	
	public static void main(String[] args) {
		int [] x= {8,7,5,6,2,4,3,1};
		System.out.println(Arrays.toString(x));
		qSort(x, 0, 7);
		//int a = partition(x, 0, 7, 1);
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
			System.out.println("start: " +start + "," + "end: " + end + " pivot: " + array[pivot] + " pivot index: " + pivot);
			int index = partition(array, start, end, pivot);
			if(start < index - 1) {
				qSort(array, start, index - 1);
			}
			if(index < end) {
				qSort(array, index, end);
			}	
		}
	}
	
	public static int partition(int[] array, int start, int end, int pivot) { //for debugging in qSort
		while (start <= end) {
			while (array[start] < pivot) {
				if(start < end){
					start++;
				}	
			}
			while (array[end] >= pivot) {
				if(end > start){
					end--;
				} else {
					break;
				}
			}
			if (array[start] >= pivot && array[end] < pivot) { //swap if qualifies
				swap(array, start, end);
				start++;
				end--;
			}
			if (end < start) { //if they cross over in flight, return start (left)
				System.out.println("partitioned1 array: ");
				System.out.println(Arrays.toString(array));
				System.out.println("p returned: " + start);
				return start;
			}
			if (end == start) { //if they meet in flight, return start ++
				if (array[start] < pivot) {
					System.out.println("partitioned2 array: ");
					System.out.println(Arrays.toString(array));
					System.out.println("p returned: " + (start+1));
					return start+1;
				} else {
					System.out.println("partitioned3 array: ");
					System.out.println(Arrays.toString(array));
					System.out.println("p returned: " + start);
					return start;
				}
			}
		}
		System.out.println("partitioned array: ");
		System.out.println(Arrays.toString(array));
		System.out.println("p returned: " + end);
		return end;
	}
	
	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
//	public static int partition(int[] array, int start, int end, int pivot) {
//		while (start <= end) {
//			System.out.println("new while iteration");
//			System.out.println(Arrays.toString(array));
////			System.out.println("left: " + start);
////			System.out.println("right: " + end);
//			
//			while (array[start] < pivot) {
//				if(start < end){
//					start++;
//					System.out.println("start updated: " + start);
//				}
//				
//			}
//			
//			while (array[end] >= pivot) {
//				if(end > start){
//					end--;
//					System.out.println("end updated: " + end);
//					System.out.println(start);
//				} else {
//					break;
//				}
//				
//			}
//			
//			
//			
//			if (array[start] >= pivot && array[end] < pivot) { //swap if qualifies
//				swap(array, start, end);
//				start++;
//				end--;
//				System.out.println("swapped");
//				System.out.println("start updated: " + start);
//				System.out.println("end updated: " + end);
//			}
//			
//			if (end < start) { //if they cross over in flight, return start (left)
//				System.out.println("partition returned start: " + start);
//				return start;
//			}
//			
//			if (end == start) { //if they meet in flight, return start ++
//				System.out.println("equals");
//				if (array[start] < pivot) {
//					return start+1;
//				} else {
//					return start;
//				}
//					
//			}
//		}
//		System.out.println("partition returned end: " + end);
//		System.out.println("left: " + start);
//		System.out.println("right: " + end);
//		return end;
//	}
	

	

//	public static int partition1(int[] array, int start, int end, int piv) {
//		int left = start, right = end, pivot = array[piv]; //dynamic boiz
//		System.out.println(Arrays.toString(array));
//		
//		if (left >= right) {
//			return start;
//		}
//		
//		while (left < right) {
//			
//			while(array[left] < pivot && left < array.length && !(left+1>right)) {
//				left++;
//				
//			}
//			while(array[right] >= pivot && right > 0 && !(right-1<left)) {
//				right--;
//			}
//			System.out.println("left: " + left + "," + "right: " + right + "," + "pivot value: " + pivot);
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
//			} else if (right < left) { //if crossed over, return left
//				return left;
//			}
//		}
//		return right;
//		//left steps into right if there is a final swap
//		
//	}
}
