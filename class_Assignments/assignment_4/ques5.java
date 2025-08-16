import java.util.*;
import java.io.*;

public class ques5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a filename: ");
        String filename = in.nextLine();
        System.out.print("Enter a word to find in " + filename + " file: ");
        String targetWord = in.nextLine();

        File file = new File(filename);
        int findCount = 0;
        ArrayList <Integer> lineNumbers = new ArrayList<>();
        int lineNum = 1;

        try {
            Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                String data = readFile.nextLine();
                if (data.contains(targetWord)) {
                    findCount++;
                    lineNumbers.add(lineNum);
                }
                lineNum++;
            }
            readFile.close();
            
            if (findCount == 0) {
                System.out.println("File " + filename + " does not contain \"" + targetWord + "\"");
            } else {
                System.out.println(filename + " has \"" + targetWord + "\" count: " + findCount);
                System.out.print("This word appeared in these lines of file: ");
                for (int line : lineNumbers){
                    System.out.print(line+" ");
                }
                
                System.out.println(); 
            }
        } catch (IOException e) {
            System.out.println("File does not exist or could not be read.");
        }
    }
}
