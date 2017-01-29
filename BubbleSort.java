import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {84, 69, 76, 86, 94, 91};
		System.out.println("Before: " + Arrays.toString(array));
		bubbleSort(array);
		System.out.println("After: " + Arrays.toString(array));
	}
	
	public static void bubbleSort(int[] array) {
		boolean flag = true;   
		int temp;
		while ( flag ) {
            flag = false;
            for( int i = 0;  i < array.length-1;  i++ ) {
				if ( array[i] > array[i+1] )   {
					temp = array[i];                //swap elements
					array[ i] = array[i+1];
					array[i+1] = temp;
					flag = true;              //shows a swap occurred  
                  } 
            } 
		}
	}
} 