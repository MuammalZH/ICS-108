package Labs.Lab01;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        int numberOfcourses , creditHourse, i, sumOfcredits = 0;
        String letterGrade;
        double gpa=0.0, points, totalGpa;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of courses: ");
        numberOfcourses  = input.nextInt();
        System.out.println("Enter the letter grade and the credit hours for " + numberOfcourses + " the courses: ");
        
        for (i=0; i<numberOfcourses;i++) {
        letterGrade = input.next();
        creditHourse = input.nextInt();

        if(letterGrade.equals("A+")) {
        points= 4.0;
        gpa += (creditHourse*points);
        sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("A")) {
        points= 3.75;
        gpa += (creditHourse*points);
        sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("B+")) {
        points=3.5;
        gpa += (creditHourse*points);
        sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("B")) {
            points=3.0;
            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("C+")) {
            points=2.5;
            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("C")) {
            points=2.0;
            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("D+")) {
            points=1.5;
            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("D")) {
            points=1.0;
            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        else if (letterGrade.equals("F")) {
            points=0.0;

            gpa += (creditHourse*points);
            sumOfcredits+= creditHourse;
        }
        
    }
    
    totalGpa= gpa/sumOfcredits;
    System.out.println("The total GPA is: " + totalGpa);


        


        



        






    

        



        





        


    }
    
}
