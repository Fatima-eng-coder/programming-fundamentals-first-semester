import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNameRanking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter the year (2022-2025): ");
        int year = in.nextInt();
        
        
        System.out.print("Enter the gender (M/F): ");
        String gender = in.next().toUpperCase();
        
        
        System.out.print("Enter the name: ");
        String name = in.next();
        
        
        if (!gender.equals("M") && !gender.equals("F")) {
            System.out.println("Invalid gender. Please enter M or F.");
            return;
        }
        
        // Construct the filename based on year
        String filename = "babynameranking" + year + ".txt";
        
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            
            // Skip header line 
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }
            
            boolean found = false;
            int rank = 0;
            
            // Search through each line of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+"); // Split by whitespace
                
                // Check if the line has enough parts (minimum 3: rank, male, female)
                if (parts.length >= 3) {
                    rank = Integer.parseInt(parts[0]);
                    String maleName = parts[1];
                    String femaleName = parts[2];
                    
                    // Check if the name matches for the given gender
                    if ((gender.equals("M") && name.equalsIgnoreCase(maleName)) || 
                        (gender.equals("F") && name.equalsIgnoreCase(femaleName))) {
                        found = true;
                        break;
                    }
                }
            }
            
            fileScanner.close();
            
            // Display results
            if (found) {
                System.out.println(name + " is ranked #" + rank + " in year " + year);
            } else {
                System.out.println("The name " + name + " is not ranked in year " + year);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Data for year " + year + " is not available.");
        } catch (NumberFormatException e) {
            System.out.println("Error reading data file.");
        }
        
        in.close();
    }
}