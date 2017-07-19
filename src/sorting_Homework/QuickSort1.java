package sorting_Homework;

import java.util.Arrays;
import java.util.Random;

public class QuickSort1  {
    private int[] numbers;
    private int number;
    
    public static void main(String[] args) {
    	
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
    
    
//    public void qS (int start, int end) {
//    	int i = start, j =end, pivot = numbers[(end - start)/2 + start];
//    	while (i <= j) {
//    		while(numbers[i] < pivot) {
//    			i++;
//    		}
//    		while(numbers[j] > pivot) {
//    			j--;
//    		}
//    		if(i <= j) {
//    			s(i,j);
//    			i++; j--;
//    		}
//    	}
//    	if(start < j) {
//    		qS(start, j);
//    	}
//    	if(i < end) {
//    		qS(i, end);
//    	}
//    }
//    
//    public void s (int a, int b) {
//    	int temp = numbers[a];
//    	numbers[a] = numbers[b];
//    	numbers[b] = temp;
//    }
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void qS(int start, int end) {
//    	int a = start, b = end, c = 0;
//    	int pivot = numbers[(end - start) + start];
//    	
//    	while (a <= b) {
//    		while (numbers[a] < pivot) {
//    			a++;
//    		}
//    		while (numbers[b] > pivot) {
//    			b--;
//    		}
//    		if (a<=b) {
//    			swap(a,b);
//    			a++; b--;
//    		}
//    	}
//    	if(start < b) {
//    		qS(start, b);
//    	}
//    	if(a < end) {
//    		qS(a, end);
//    	}
//    }
    
	public void quickieSortSelect(int start, int end, int k) { // really quickselect
		int a = start, b = end, pivot = numbers[(end - start) / 2+start];
		//System.out.println("pivot value: " + pivot + " pivot index: " + ((end - start)/2 +a)) ;
		
		if(k < start || k > end) {
    		return;
    	}
		
		while(a<=b) {
			while(numbers[a] < pivot) {
				a++;
			}
			while(numbers[b] > pivot) {
				b--;
			}
			if(a<=b) {
				swap(a,b);
				a++; b--;
			}
		}
//		if(start >= b && start == k) {
//			System.out.println("start: " + numbers[start]);
//		}
//		if(a >= end && start == k) {
//			System.out.println("end: " + numbers[end]);
//		}
		if(k >= b && k <= a){
			System.out.println("middle: " + numbers[k] + ", index: " + k);

		}
		if(start < b){ // && pivot > input.length - k 
			//System.out.println("start: " + start);
			quickieSortSelect(start, b, k);
		}
		if(a < end){ // && end >= input.length - k 
			//System.out.println("a: " + a);
			quickieSortSelect(a, end, k);
		}

	}
    
    
    public void quickSelect(int low, int high, int k) { //find k th number (sorted)
    	if(k < low || k > high) {
    		return;
    	}
    	int i = low, j = high;
    	int pivot = numbers[low + ((high - low) / 2)];
    	while(i<=j) {
    		while(numbers[i] < pivot) {
    			i++;
    		}
    		while(numbers[j] > pivot) {
    			j--;
    		}
    		if(i<=j) {
    			swap(i,j);
    			i++; j--;
    		}
    	}
    	if(j > low) {
    		quickSelect(low, j, k);
    	}
    	if(i < high) {
    		quickSelect(i, high, k);
    	}
    }

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        
//        quickSelect(0, number - 1, 7);
//        System.out.println("Quick Selected (7): " + Arrays.toString(numbers));
        
        Random rand = new Random();
        int  n = rand.nextInt(20);
        
        qS(0, number - 1);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }


    private void swap(int i, int j) {
    	int a = numbers[j];
    	numbers[j] = numbers[i];
    	numbers[i] = a;
    }
    
    //////////////////////////////////////////quicksort debug version below
    
    private void quicksort(int low, int high) {
        int i = low, j = high;    
        int pivot = numbers[low + (high-low)/2];

        while (i <= j) {       
            while (numbers[i] < pivot) {
                i++;
            }          
            while (numbers[j] > pivot) {
                j--;
            }          
            if (i <= j) { // = : easier to just exchange w/yourself and step++ -- so you don't have to write an exception
                exchange(i, j);
                i++;
                j--;
            }
        }
        
        System.out.println("Partitioned via: " + "low[" + low + "] " + "high[" + high + "] " + "pivot index[" + (low + (high-low)/2) + "] " + "pivot value[" + pivot + "] " + Arrays.toString(numbers));

        
        
        
			        if(j+1 != i){
			        	//System.out.println("POSSIBLE WTF WTF WTF" + j + ", " + i);
			        	System.out.println("placed: " + (j+1));
			        }
        
        if (low >= j && low!=0) {
        	//System.out.println("j : " +  numbers[j] + ", pivot :" + pivot);
        	//System.out.println("but... " + "i :" + numbers[i]);
        	System.out.println("placed: " + low);
        	
        }
        if (high <= i) {
        	//System.out.println("i :" + numbers[i] + ", pivot :" + pivot);
        	//System.out.println("but... " + "j :" + numbers[j]);
        	System.out.println("placed: " + high);
        	
        }
        
        if (low < j) {
				//        	System.out.println("PT1: Recursed (" + low + ", " + j + ")");
				//        	if(j+1 != i){
				//            	System.out.println("FLAG1 WTF WTF WTF" + j + ", " + i);
				//            }
//        	System.out.println(low);
//        	System.out.println(j);
            quicksort(low, j);
        }
        	
        if (i < high) {
				//        	System.out.println("PT2: Recursed (" + i + ", " + high + ")");
				//        	if(j+1 != i){
				//            	System.out.println("FLAG2 WTF WTF WTF" + j + ", " + i);
				//            }
        	//System.out.println(i);
        	//System.out.println(high);
            quicksort(i, high);
            				//quicksort(j++, high); //experiment
        }
        
			//        if(j+1 != i){
			//        	System.out.println("END END END" + j + ", " + i);
			//        }
        	
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}