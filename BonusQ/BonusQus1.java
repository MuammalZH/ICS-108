package BonusQ;
import java.util.ArrayList;
import java.util.Arrays;

public class BonusQus1 {
        public static void reverseArrayList(ArrayList<Integer> list, ArrayList<Integer> newList) {
            if (list.size() == 0) {
                return;
            }
            
            Integer lastNum = list.remove(list.size() - 1);
            newList.add(lastNum);
            reverseArrayList(list, newList);}
            
        public static void main(String[] args) {
            Integer[] x = {1, 2, 3, 4, 5};
        
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(x));
            ArrayList<Integer> b = new ArrayList<>();
            reverseArrayList(a,b);
            System.out.println(b);
        }
 }
