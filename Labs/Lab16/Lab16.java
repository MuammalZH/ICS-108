package Labs.Lab16;


import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lab16 {
   
 class SortStudents {
    public static void main(String[] args) {
        ArrayList<Integer> studentId = new ArrayList<>();

        try {
            File file = new File("unsortedStudents.txt");
            Scanner scanner = new Scanner (file);
            while (scanner.hasNextInt()) {
                studentId.add(scanner.nextInt());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        Collections.sort(studentId);
        
        try {
            File sortedFile = new File("sortedStudents.txt");
            PrintWriter writer = new PrintWriter(sortedFile);

            for (int id : studentId) {
                writer.println(id);
            }
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        System.out.println("Sorted students written to sortedStudents.txt");
    }
}
}
