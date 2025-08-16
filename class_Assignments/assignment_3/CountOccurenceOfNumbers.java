import java.util.*;

public class CountOccurenceOfNumbers {
    public static Scanner in = new Scanner(System.in);

    // this function check if particular element belong to a array .
    // return true if element belongs and false if element does not belong
    public static boolean checkedElementInArr(int number, int[] array) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
    //if user enter element greater than 100 or less than 0 this function will remove all element and reset the every element 0 
    public static boolean ResetElementsInArray(int[] array) {
        for (int i =0; i<array.length; i++){
            array[i]=0;
        }

        return true;

    }
    //take element from the user and update array by adding them in array and then return i(last index of array where last element placed).
    public static int populateArray(int[] arr1) {
        boolean reset = false;
        int number = 0 ;
        int i = 0 ;
        while (i<arr1.length){
            number = in.nextInt();
            if (number==0){
                return i;
                
            }
            else if (number>=1 && number<=100){
                arr1[i]=number;
                i++;
            }
            else{
                System.out.println("Please enter a number between 1 and 100. Resetting array...");
                reset= ResetElementsInArray(arr1);
            }
            if (reset){
                i=0;
                reset= false;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        // arr1 is created with 100 indexes
        int validSizeOfArr1;
        int[] arr1 = new int[100];
        validSizeOfArr1= populateArray(arr1);  //populate array by taking intigers from the user and return the size of actual size of array
        
        int [] checkedElements= new int [validSizeOfArr1]; //this array will contain those elements whose frequency has been checked to avoid redundantly checking the same element
        
        
        
        boolean check=false;
        int x =0;
        int countMatched= 0 ;
        for (int i = 0; i < validSizeOfArr1; i++) {
            check = checkedElementInArr(arr1[i], checkedElements);//if arr[i]  is present in checked elements and already checked for occurences than function (checkedElementInArr) return true 

            if (check == false){
                checkedElements[x]=arr1[i]; //current element that is checking for occurences is added to the array of checkedElements
                x++;
                for (int j =0; j<validSizeOfArr1; j++){
                    if (arr1[i]==arr1[j]){
                        countMatched++;
                    }
                }
                System.out.println(arr1[i]+" Occured: "+countMatched+" times.");
                countMatched=0;
            }

        }
        in.close();

    }
    
}



//TODO Understand their logic as wellll

// import java.util.Scanner;

// public class CountOccurrenceOfNumbers {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);

// // Array to store occurrences of numbers 1–100
// int[] counts = new int[101]; // indenumber 0 to 100

// System.out.print("Enter the integers between 1 and 100: ");

// while (true) {
// int number = in.nenumbertInt();
// if (number == 0) {
// break;
// }

// if (number >= 1 && number <= 100) {
// counts[number]++;
// }
// }

// // Display results
// for (int i = 1; i <= 100; i++) {
// if (counts[i] > 0) {
// System.out.println(i + " occurs " + counts[i] + (counts[i] == 1 ? " time" : "
// times"));
// }
// }

// in.close();
// }
// }
