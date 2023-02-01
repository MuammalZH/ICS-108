import java.util.Scanner;
import java.util.ArrayList;
public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the objects: ");
        int numberOfobjects = input.nextInt();

        ArrayList<Integer> weights= new ArrayList<Integer>();

        System.out.println("Enter the weights of each object: ");
        for(int i=0; i<numberOfobjects; i++){
            int w = input.nextInt();
            if (w <=10){
                weights.add(w);
            }
        }
        
        int total = 0;
        ArrayList<Integer> cont = new ArrayList<>(); 
        for(int i=0; i<numberOfobjects; i++){
            if (total <= 10){
                if(weights.get(i) <= (10-total)){
                    cont.add(weights.get(i));
                    total += weights.get(i); 
                    weights.remove(i); 
                }
                ArrayList<Integer> Container = new ArrayList<>(); 
                Container.add(total); 
                total = 0;
            }
        }
        int size = Container.size(); 
        System.out.println("Number of containers used is " + size);
    }
}
