// Write a program to create a file named Text_IO.txt if it does not exist. Append new data to it if it
// already exists. Write 100 integers created randomly into the file using text I/O. Integers are
// separated by a space.

import java.util.*;
import java.io.*;
public class ques1{
    public static void main(String [] args){
        Random rand = new Random();
        
        
        try{
            FileWriter writer = new FileWriter("Text_IO.txt",true);
            PrintWriter pw = new PrintWriter(writer);
            for (int i = 0 ; i<100; i++){
                pw.print(rand.nextInt(100)+" ");

            }
            pw.println();
            writer.close();
        }catch(IOException e){
            System.out.println("Can't write in Text_IO.txt file");
            System.out.println(e.getMessage());
        }
    }
}