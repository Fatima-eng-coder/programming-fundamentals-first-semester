public class CountSingleDig {
    public static void printArray(int[] array){
        for (int i = 0 ; i <array.length; i ++){
            System.out.println("Digit "+i+": "+array[i]+" times.");
        }
        
    }
    public static void main(String [] args){
        int[] count = new int [10];
        for (int i = 0 ; i < 100; i++){
            int num = (int) ((Math.random()*5));
            System.out.print(" "+num+" ");
            count[num]++;
        }
        System.out.println();
        printArray(count);
    }
}
