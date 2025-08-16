// Write a program that will count the number of characters, words, and lines in a file. Words are
// separated by whitespace characters. The file name should be passed as a command-line argument.
import java.util.*;
import java.io.*;
public class ques2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        System.out.println("Enter filename: ");
        String filename = sc.nextLine();
        File file = new File(filename);
        String content = "";
        int charCount = 0 ;
        int wordsCount =0;
        int lineCount = 0;
        try{ Scanner reader = new Scanner (file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                lineCount++;
                wordsCount++;
                content=content+"\n"+data;
            }
            reader.close();
        }catch(IOException e){
            System.out.println("cannot open file to read");
            System.out.println(e.getMessage());
        }
        System.out.println(content);
        System.out.println();
        System.out.println("--->Stats<---");
        int lenOfcontent = content.length();
        // String []arrDataFile =new String[lenOfcontent];
        for (int i = 0  ; i<lenOfcontent; i++){
            if (content.charAt(i)==' '){
                wordsCount++;
            }
            charCount++;
        }
        System.out.println("No of lines in "+filename+" are: "+lineCount);
        System.out.println("No of words in "+filename+" are: "+wordsCount);
        System.out.println("No of characters in "+filename+" are: "+charCount);
    }
}
