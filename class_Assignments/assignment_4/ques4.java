

// Write a program to read integers from a file, calculate their sum, and log any errors (e.g., non-
// integer values) to a separate error log file. Your program must:
//  Skip invalid entries and continue processing the file.
//  Log errors with specific details (e.g., line number, invalid value).
// Display the total sum of valid integers.
import java.io.*;
import java.util.*;

public class ques4{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter filname: ");
        int sumOfInt= 0;
        int lineNum = 1;
        String filename = sc.nextLine();
        try {
            Scanner fileReader = new Scanner (new File(filename));
            PrintWriter logError = new PrintWriter(new FileWriter("logErrors.txt",true));
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                try{
                    int num =Integer.parseInt(line);
                    sumOfInt+=num;
                }catch(Exception e){
                    logError.println("line num of "+filename+"("+lineNum+") has invalid value \""+line+"\" cannot add in a digit.");

                }
                lineNum++;
            }
            fileReader.close();
            logError.close();
        }catch(FileNotFoundException e){
            System.out.println("Cannot open file to extract data.");
        }
        catch(IOException w){
            System.out.println("logErrors.txt cannot opened and unable to log errors.");
        }
        System.out.println("Sum of all the intigers in a file "+filename+": "+sumOfInt);
        sc.close();
    }
}