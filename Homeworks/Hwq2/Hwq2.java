package Homeworks.Hwq2;
import java.util.ArrayList;
import java.util.Arrays;

public class Hwq2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); 
        int Sum = 0;
        while(Sum != 45){
            int randomNumber =(int) (1 + Math.random() * 45);
            if( Sum + randomNumber <= 45 && randomNumber > 0){ //  checking if the list exceed 45 or not.
                Sum +=randomNumber; 
                list.add(randomNumber);
            }    
        }
        ArrayList<Integer> listToCompare = new ArrayList<>(Arrays.asList(1, 2,3 ,4 ,5 ,6 ,7,8,9)); // we use it to compare our list with it.
        while(!list.containsAll(listToCompare)){ // checking if our list has the same elements of the Arraylist elements.
            Sum = 0;
            int summation = 0; // to use it as index
            int listSize = list.size();
    
            while(summation != listSize){ 
                list.set(summation, list.get(summation)-1); // subtract each number by 1.
                Sum += list.get(summation); // getting the sum of the subtracted numbers 
    
                if(list.get(summation) <= 0) // checking if the number becomes zero or less.
                    list.remove(summation);  // if the number becomes zero or less, remove it from the list.
                else
                    summation++;
    
                listSize = list.size(); // update the list size.
            }
            if(Sum < 45)
                list.add( 45 - Sum); // adding the sum of the subtracted numbers.
            
            System.out.println(list);
        }
    }
}
