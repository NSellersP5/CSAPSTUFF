package sortalgorithm2;

public class Sorts {


/*******************************************************************************
* Method: bubblesort(); 
* Description:  
* Parameters:  
* Pre-Conditions:  
* Post-Conditions: 
*******************************************************************************/
    
    public static int[] bubbleSort(int[] array) {
        boolean swapped = true;
        int l = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            l++;
            for (int i = 0; i < array.length - l; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }

            }

        }
        System.out.println("Number of times loop ran before sorted:" + l);
        return null;
    }
    
/*******************************************************************************
* Method: selectionsort(); 
* Description:  
* Parameters:  
* Pre-Conditions:  
* Post-Conditions: 
*******************************************************************************/
    
    public static void selectionSort() {
        System.out.println("Hello");
    }

/*******************************************************************************
* Method: insertionsort(); 
* Description:  
* Parameters:  
* Pre-Conditions:  
* Post-Conditions: 
*******************************************************************************/
    
    public static void insertionSort() {
        System.out.println("Bye");
    }

}    

