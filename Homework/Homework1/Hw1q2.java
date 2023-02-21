package Homework.Homework1;
import java.util.Scanner;

public class Hw1q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.println("Enter the nembers: ");
        long numbers = input.nextInt();

        System.out.println("The sum of the digits is: " + sumDigits(numbers));
    }
    public static int sumDigits(long n){
        int sum=0;

        while(n>0){
            sum=(int) (sum+n%10);
            n = n/10;
        }
         return sum;
    }
}
