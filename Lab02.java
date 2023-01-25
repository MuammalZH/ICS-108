import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        int numberOfletters;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the courses: ");
        numberOfletters = input.nextInt();
        printNRandomLetterGrades(numberOfletters);

    


        }
        public static void printNRandomLetterGrades(int n){
        int randnumber;

        for(int i=0; i<n;i++){
            randnumber= (int)(Math.random()*9);

        
        switch(randnumber){
            case 0->System.out.println("A+");
            case 1->System.out.println("A");
            case 2->System.out.println("B+");
            case 3->System.out.println("B");
            case 4->System.out.println("C+");
            case 5->System.out.println("C");
            case 6->System.out.println("D+");
            case 7->System.out.println("D");
            case 8->System.out.println("F");
        }


        }
        
            
        


        }








    }

