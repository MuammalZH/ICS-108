package Labs.Lab03;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        int size, elements,i;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size=input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(i = 0; i < size; i++){
            elements=input.nextInt();
            array[i]= elements;
        }
        if (isValid(array)){
            System.out.println("The array is valid");
        }
        else System.out.println("The array is not valid");
    }
    public static boolean isValid(int[] array){
        int i,j;
        for(i = 0; i < array.length; i++){
            if(array[i]< 1 || array[i] > array.length) return false;
            for(j=0;j<array.length;j++){
                if (array[i] == array[j] && i != j) return false;
            }  
        }
         return true;
    }
}
