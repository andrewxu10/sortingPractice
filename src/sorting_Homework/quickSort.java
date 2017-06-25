package sorting_Homework;

import java.util.Random;

public class quickSort {
	static Random rand = new Random();
	
	public static void main(String[] args) {
		System.out.println("hello");
	}

	public static void quickSort(int[] array, int start, int end) {
		int pivot = rand.nextInt(array.length);
		int index = partition(array, start, end, pivot);
		
		quickSort(array, start, index - 1);
		quickSort(array, index, end);
	}
	
	public static int partition(int[] array, int start, int end, int pivot) {
		int left = start, right = end; //dynamic
		return left;
	}
}
