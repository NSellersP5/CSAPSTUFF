package sortalgorithm2;

import java.util.Random;
import java.util.Scanner;
import static sortalgorithm2.Sorts.bubbleSort;
import static sortalgorithm2.Sorts.insertionSort;
import static sortalgorithm2.Sorts.selectionSort;

public class SortAlgorithm2 {

    public static void main(String[] args) {
        System.out.println("1");
        Scanner input = new Scanner(System.in);
        Random randNum = new Random();
        final int arrLength = 20;
        boolean looping = true;
        int inputNum;
        String answer;
        int[] array = new int[arrLength];
        boolean found;
        int foundNum = 2000000000;

        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = randNum.nextInt(100) + 1;
            }

            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.println(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
            
            //* Menu For Sort */
            
            System.out.println("What kind of sort do you want to run?");
            System.out.println("1.Bubble | 2.Selection | 3.Insertion");
            String a = input.next();
            if ("1".equals(a)) {
                bubbleSort(array);
            }
            if ("2".equals(a)) {
                selectionSort();
            }
            if ("3".equals(a)) {
                insertionSort();
            }
            
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.println(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            }

            System.out.print("Please enter the number you wish to look for: ");
            System.out.println("");

            found = false;
            inputNum = input.nextInt();

            System.out.println("Linear Search algorithm:");
            System.out.println("");
            
            /* Linear Search */
            
            for (int i = 0; i < arrLength; i++) {
                if (inputNum == array[i]) {
                    found = true;
                    foundNum = i;
                }
            }

            if (found) {
                System.out.println("The number " + inputNum
                        + " can be found at " + foundNum);
            } else {
                System.out.println("Sorry, " + " could not be found.");
            }

            System.out.println("Binary Search algorithm:");
            System.out.println("");

            found = false;

            /* Your binary search goes here */
            if (found) {
                System.out.println("The number " + inputNum
                        + " can be found at " + foundNum);
            } else {
                System.out.println("Sorry, " + " could not be found.");
            }

            System.out.println("Would you like to continue?");
            Scanner replay = new Scanner(System.in);
            answer = replay.next();

            System.out.println("");

            if (answer.equals("no")) {
                looping = false;
            }
        } while (looping);
    }    
    }
    

