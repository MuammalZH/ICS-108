import java.util.Scanner;

public class laaaav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the contents of the array:");
        for(int i = 0; i < size; i++) array[i] = input.nextInt();

        if (isValid(array)) System.out.println("The array is valid");
        else System.out.println("The array is not valid");
    }

    public static boolean isValid(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] <= 0 || array[i] > array.length) return false;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j] && i != j) return false;
            }
        }
        return true;
    }
}
        
    

