import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Hw1q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the string then the character: ");
        String word =input.next();
        char letter =input.next().charAt(0);

        System.out.println("The number of occurrences is :" + count(word,letter));
    }
    public static int count(String str, char a){
        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)-a==0){
                count++;
            }
        }
        return count; 
    }
}
