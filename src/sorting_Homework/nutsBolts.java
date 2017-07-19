package sorting_Homework;

import java.util.Arrays;
import java.util.Random;

public class nutsBolts {
//	private static int size = 10;
//	private static int[] nuts = new int[size];
//	private static int[] bolts = new int[size];
	
//	private static int[] nuts = {5,2,7,0,2,4,8,2};
//	private static int[] bolts = {2,5,8,2,4,2,0,7};
	
	private static int[] nuts = {9,4,8,7,2,1,3,5,6};
	private static int[] bolts = {1,9,2,8,3,7,6,4,5};
	
	public static void main (String[] args) {
		
//		Random generator = new Random();
//	    for (int i = 0; i < size; i++) {
//	        nuts[i] = generator.nextInt(20);
//	        bolts[i] = generator.nextInt(20);
//	    }
//		nutsBolts sorter = new nutsBolts();
		
	    System.out.println("Unsorted Nuts: " + Arrays.toString(nuts));
	    System.out.println("Unsorted Bolts: " + Arrays.toString(bolts));
		
        nutsBolts.recursion();
        System.out.println("Nuts: " + Arrays.toString(nuts));
        System.out.println("Bolts: " + Arrays.toString(bolts));
	}
	
	
	
	private static void recursion() {
		for(int i = 0; i < nuts.length; i++) {
			quickSort(nuts, bolts[i]);
			System.out.println("NUTS QS - Pivot value: " + bolts[i] + Arrays.toString(nuts));
		}
		for(int j = 0; j < nuts.length; j++) {
			quickSort(bolts, nuts[j]);
			System.out.println("BOLTS QS - Pivot value: " + bolts[j] + Arrays.toString(nuts));
		}
	}
	
	private static void quickSort(int[] array, int pivot) { //partitions around one pivot
		int i = 0; int j = array.length - 1;
		while(i <= j) {
			while(array[i] < pivot && i < array.length - 1) {
				i++;
			}
			while(array[j] > pivot && j > 0) {
				//System.out.println(j);
				j--;
			}
			if(i <= j) {
				swap(array, i, j);
				//System.out.println(Arrays.toString(array));
				i++; j--;
			}
		}
	}

	private static void swap(int[] inputArray, int i, int j) {
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
		
	}

	////////////////////////////////////////////////
	
	private int[] numbers;
    private int number;
    
	public static void mvin(String[] args) {
    	
    	int[] numbers = new int[20];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(20);
        }
        System.out.println("Numbers unsorted: " + Arrays.toString(numbers));
        QuickSort1 sorter = new QuickSort1();
        
        sorter.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
    }
	
//	public void sort(int[] values) {
//        // check for empty or null array
//        if (values ==null || values.length==0){
//            return;
//        }
//        this.numbers = values;
//        number = values.length;
//        
////        quickSelect(0, number - 1, 7);
////        System.out.println("Quick Selected (7): " + Arrays.toString(numbers));
//        
//        Random rand = new Random();
//        int  n = rand.nextInt(20);
//        
//        qS(0, number - 1);
//        System.out.println("Sorted: " + Arrays.toString(numbers));
//    }
 
}
