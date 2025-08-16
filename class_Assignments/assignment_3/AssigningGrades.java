import java.util.Scanner;
public class AssigningGrades {
    public static String isGrade(int marks,int highestMarks){ //this function is used for grading
        if (marks>=highestMarks-10){
            return "A";
        }
        else if (marks>=highestMarks-20){
            return "B";
        }
        else if (marks>=highestMarks-30){
            return "C";
        }
        else if (marks>=highestMarks-40){
            return "D";
        }
        else if (marks<highestMarks-40){
            return "F";
        }
        return "";    
    }
    public static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of sutdents: ");
        int sizeOfArray= in.nextInt();
        int [] ArrOfStudent = new int[sizeOfArray];
        // populating array
        System.out.print("Enter "+sizeOfArray+" scores: ");
        for (int i =0; i<sizeOfArray;i++){
            ArrOfStudent[i]=in.nextInt();
        }
        int bestScore = ArrOfStudent[0];
        for (int num : ArrOfStudent){  //sorting heighest score in the given list
            if (num>bestScore){
                bestScore=num; 
            }
        }
        for (int i =0; i<(ArrOfStudent.length); i++ ){
            System.out.println("Student "+i+" score is "+ArrOfStudent[i]+" and Grade is "+ isGrade(ArrOfStudent[i], bestScore));
        }
        in.close();
    }   
}
    