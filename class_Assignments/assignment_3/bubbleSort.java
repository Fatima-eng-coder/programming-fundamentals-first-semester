import java.util.*;
public class bubbleSort {
    public static Random rand = new Random();
    public static void DisplayArray(double[] array){
        for (int i = 0 ; i <array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static double [] bubbleSorting(double [] array){
        for (int i=0 ; i <array.length;i++){
            for (int j = 0 ; j<array.length - i -1; j++){
                if (array[j]>array[j+1]){
                    double temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static double [] giveArray(double[] array){
        for (int i = 0; i<array.length; i++){
            array[i]=Math.round(rand.nextInt(10)+rand.nextDouble()*1000.0)/10.0;
        }
        return array;
    }
    public static void main(String [] args){
        double [] newArr= new double[10];
        newArr = giveArray(newArr);
        System.out.println("Displaying unsorted array: ");
        DisplayArray(newArr);
        newArr = bubbleSorting(newArr);
        System.out.println("Displaying sorted array: ");
        DisplayArray(newArr);
    }   
}
