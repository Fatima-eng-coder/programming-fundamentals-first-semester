import java.util.Scanner;

public class Assignment {
    static Scanner sc = new Scanner(System.in);

    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        int choice;

        do {
            printMainMenu();

            System.out.print(YELLOW + " Enter your option (0-6): " + RESET);

            while (!sc.hasNextInt()) {
                System.out.print(RED + "Invalid input. Please enter a number: " + RESET);
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    slowPrint(GREEN + "🚀 Executing Question 1...\n\n" + RESET, 20);
                    question1();
                    break;
                case 2:
                    slowPrint(GREEN + "🚀 Executing Question 2...\n" + RESET, 20);
                    question2();
                    break;
                case 3:
                    slowPrint(GREEN + "🚀 Executing Question 3...\n" + RESET, 20);
                    question3();
                    break;
                case 4:
                    slowPrint(GREEN + "🚀 Executing Question 4...\n" + RESET, 20);
                    question4();
                    break;
                case 5:
                    slowPrint(GREEN + "🚀 Executing Question 5...\n" + RESET, 20);
                    question5();
                    break;
                case 6:
                    slowPrint(GREEN + "🚀 Executing Question 6...\n" + RESET, 20);
                    question6();
                    break;
                    case 0:
                    printExitScreen();
                    break;                
                default:
                    System.out.println(RED + "Invalid choice. Try again." + RESET);
            }

        } while (choice != 0);
    }


static void slowPrintLine(String line, int delay) {
    for (char ch : line.toCharArray()) {
        System.out.print(ch);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    System.out.println();
}

    static void slowPrint(String message, int delay) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nError: " + e.getMessage());
            }
        }
    }
    
    static void printMainMenu() {
        System.out.print(GREEN);
        slowPrintLine("╔════════════════════════════════════════════╗", 10);
        slowPrintLine("║        ✨ Main Menu - Assignment 2 ✨      ║", 5);
        slowPrintLine("╠════════════════════════════════════════════╣", 10);
        System.out.print(CYAN);
        slowPrintLine("║  1️⃣  - Question 1                           ║", 5);
        slowPrintLine("║  2️⃣  - Question 2                           ║", 5);
        slowPrintLine("║  3️⃣  - Question 3                           ║", 5);
        slowPrintLine("║  4️⃣  - Question 4                           ║", 5);
        slowPrintLine("║  5️⃣  - Question 5                           ║", 5);
        slowPrintLine("║  6️⃣  - Question 6                           ║", 5);
        System.out.print(YELLOW);
        slowPrintLine("╠════════════════════════════════════════════╣", 10);
        slowPrintLine("║  🔄 Press 1-6 to run a question            ║", 5);
        slowPrintLine("║  🚪 Press 0 to exit                        ║", 5);
        slowPrintLine("╚════════════════════════════════════════════╝", 10);
        System.out.print(RESET);
    }
    

    static void printExitScreen() {
        System.out.print(RED);
        slowPrintLine("\n╔════════════════════════════════════════════╗", 10);
        slowPrintLine("║                                            ║", 3);
        slowPrintLine("║     👋 Thanks for using the program!       ║", 5);
        slowPrintLine("║     🚪 Exiting... Stay awesome! 😎         ║", 5);
        slowPrintLine("║                                            ║", 3);
        slowPrintLine("╚════════════════════════════════════════════╝", 10);
    
        System.out.print(CYAN);
        slowPrintLine("\n Developed by: Fatima Azaz", 40);
        slowPrintLine(" Roll Number: SP25-BCS-027", 40);
        slowPrintLine(" Made with Java \n\n", 50);
        System.out.print(RESET);
    }
    
    static void question1() {
        boolean repeat = true;
    
        while (repeat) {
            System.out.println(CYAN + "Question 1: Social Security Number validation.\n" + RESET);
            System.out.print(YELLOW + "Enter a SSN (format DDD-DD-DDDD): " + RESET);
            String ssn = sc.nextLine();
    
            if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
                System.out.println(GREEN + ssn + " is a valid social security number\n" + RESET);
            } else {
                System.out.println(RED + ssn + " is an invalid social security number\n" + RESET);
            }
    
            System.out.println(YELLOW+"Do you want to check another SSN?"+RESET);
            System.out.println("1."+GREEN+ " Yes"+RESET);
            System.out.println("2."+RED+ " No"+RESET);
            System.out.print(CYAN+"Your Choice: "+RESET);
    
            while (!sc.hasNextInt()) {
                System.out.print(RED + "Invalid input. Please enter 1 or 2: " + RESET);
                sc.next();
            }
    
            int userChoice = sc.nextInt();
            sc.nextLine();
    
            if (userChoice != 1) {
                repeat = false;
            }
            System.out.println();
        }
    }
    static void question2() {
        int choice;
    
        do {
            System.out.println(CYAN + "Question 2: Analyzing the major and status." + RESET);
            System.out.print(YELLOW + "Enter Two Characters: " + RESET);
            
            String input = sc.nextLine().toUpperCase();
    
            if (input.length() != 2) {
                System.out.println(RED + "Invalid input. Please enter exactly two characters.\n" + RESET);
                choice = 1;
                continue;
            }
    
            char majorCode = input.charAt(0);
            char yearCode = input.charAt(1);
    
            String major = "";
            String status = "";
    
            switch (majorCode) {
                case 'M': major = "Mathematics"; break;
                case 'C': major = "Computer Science"; break;
                case 'I': major = "Information Technology"; break;
                default:
                    System.out.println(RED + "Invalid major code. Use M, C, or I.\n" + RESET);
                    choice = 1;
                    continue;
            }
    
            switch (yearCode) {
                case '1': status = "Freshman"; break;
                case '2': status = "Sophomore"; break;
                case '3': status = "Junior"; break;
                case '4': status = "Senior"; break;
                default:
                    System.out.println(RED + "Invalid year code. Use 1, 2, 3, or 4.\n" + RESET);
                    choice = 1;
                    continue;
            }
    
            System.out.println(GREEN + "✅ " + major + " " + status + "\n" + RESET);
    
            System.out.println(YELLOW + "Do you want to check another major & status?" + RESET);
            System.out.println("1." + GREEN + " Yes" + RESET);
            System.out.println("2." + RED + " No" + RESET);
            System.out.print(CYAN + "Your Choice: " + RESET);
            choice = sc.nextInt();
    
        } while (choice != 2);
    
        sc.nextLine();
    }
    
    static void question3() {
        int choice;
    
        do {
            System.out.println(CYAN + "Question 3: String Palindrome Check" + RESET);
            System.out.print(YELLOW + "Enter Your String: " + RESET);
            String str = sc.nextLine();
            String revStr = "";
    
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr = revStr + str.charAt(i);
            }
    
            if (str.equalsIgnoreCase(revStr)) {
                System.out.println(GREEN + "Your Entered String is a palindrome" + RESET);
            } else {
                System.out.println(RED + "Your Entered String is NOT a palindrome" + RESET);
            }
    
            System.out.println(YELLOW + "Do you want to check another string?" + RESET);
            System.out.println("1." + GREEN + " Yes" + RESET);
            System.out.println("2." + RED + " No" + RESET);
            System.out.print(CYAN + "Your Choice: " + RESET);
            
            choice = sc.nextInt();
            sc.nextLine();
            
            System.out.println();
        } while (choice != 2);
    }
    static void question4() {
        int choice;
        do {
            System.out.println(CYAN + "Question 4: Decimal to binary converter." + RESET);
            
            System.out.print(YELLOW + "Please Enter Decimal Number: " + RESET);
            
            int deci = sc.nextInt();
            int original = deci;
            
            int[] bin = new int[32];
            int counter = 0;
            
            if (deci == 0) {
                System.out.println(GREEN + "0 (base 10) to (base 2) is: 0" + RESET);
            } else {
                while (deci > 0) {
                    bin[counter] = deci % 2;
                    deci = deci / 2;
                    counter++;
                }
                
                System.out.print(GREEN + original + " (base 10) to (base 2) is: ");
                for (int i = counter - 1; i >= 0; i--) {
                    System.out.print(bin[i]);
                }
                System.out.println(RESET);
            }
            
            System.out.println(YELLOW + "\nDo you want to convert another number?" + RESET);
            System.out.println("1." + GREEN + " Yes" + RESET);
            System.out.println("2." + RED + " No" + RESET);
            System.out.print(CYAN + "Your Choice: " + RESET);
            
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
        } while (choice != 2);
    }
    
    
    static void question5() {
        System.out.println(CYAN + "Question 5: Java Fundamentals Quiz\n" + RESET);
        int choice;
        
        do {
            int score = 0;
            
            System.out.println(YELLOW + "1. Which of these is a valid Java data type?" + RESET);
            System.out.println("1. number\n2. int\n3. real\n4. digit");
            System.out.print(CYAN + "Your answer: " + RESET);
            int ans1 = sc.nextInt();
            if (ans1 == 2) score++;
            
            System.out.println(YELLOW + "\n2. What does 'OOP' stand for?" + RESET);
            System.out.println("1. Optional Object Programming\n2. Object Oriented Programming\n3. Open Object Program\n4. Object Opening Protocol");
            System.out.print(CYAN + "Your answer: " + RESET);
            int ans2 = sc.nextInt();
            if (ans2 == 2) score++;
            
            System.out.println(YELLOW + "\n3. Which keyword is used to create a class in Java?" + RESET);
            System.out.println("1. object\n2. define\n3. class\n4. structure");
            System.out.print(CYAN + "Your answer: " + RESET);
            int ans3 = sc.nextInt();
            if (ans3 == 3) score++;
            
            System.out.println(YELLOW + "\n4. How do you start a for loop in Java?" + RESET);
            System.out.println("1. for (int i = 0; i < 10; i++)\n2. loop (i in range)\n3. repeat i until 10\n4. for i = 0 to 10");
            System.out.print(CYAN + "Your answer: " + RESET);
            int ans4 = sc.nextInt();
            if (ans4 == 1) score++;
            
            System.out.println(YELLOW + "\n5. What will 'System.out.println()' do?" + RESET);
            System.out.println("1. Take user input\n2. Display output\n3. Compile code\n4. Open a file");
            System.out.print(CYAN + "Your answer: " + RESET);
            int ans5 = sc.nextInt();
            if (ans5 == 2) score++;
            
            
            System.out.println();
            if (score == 5) {
                System.out.println(GREEN + "Excellent! You got all 5 correct!" + RESET);
            } else if (score == 4) {
                System.out.println(GREEN + "Very good! You got 4 correct!" + RESET);
            } else {
                System.out.println(RED + "You got " + score + " out of 5. Keep practicing!" + RESET);
            }
            
            sc.nextLine();
            
            System.out.println(YELLOW+"Do you want to play again?"+RESET);
            System.out.println("1."+GREEN+" YES"+RESET);
            System.out.println("2." + RED + " No" + RESET);
            System.out.print(CYAN + "Your Choice: " + RESET);
            choice = sc.nextInt();
        } while (choice !=2);
    }
    
    public static boolean isPrime(int num) {
          
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    static void question6() {
        System.out.println(CYAN+"Question 6: Checking Prime number"+RESET);
        int choice;
        do {
            System.out.print(YELLOW+"Enter a Number: "+ RESET);
            int num = sc.nextInt();
            
            if (isPrime(num)==true) {
                System.out.println(GREEN+"Your number is Prime"+RESET);
            }
            else {  
                System.out.println(RED+"Your number is NOT Prime"+RESET);
            }
            System.out.println(YELLOW+"Do you want to Check another number?"+RESET);
            System.out.println("1."+GREEN+" YES"+RESET);
            System.out.println("2." + RED + " No" + RESET);
            System.out.print(CYAN + "Your Choice: " + RESET);
            choice = sc.nextInt();
        } while (choice != 2);
    }
}