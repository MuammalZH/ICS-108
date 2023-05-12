package Labs.Lab04;
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
        int count = 1;
        while(!weights.isEmpty()){
            ArrayList<Integer> Container = new ArrayList<>(); 
            int total = 0;
        
            for (int i = 0; i < weights.size(); i++) {
                if(total + weights.get(i) <= 10){
                int cont = weights.remove(i);
                i--;
                Container.add(cont);
                total += cont; 
                }
            }
            System.out.println("Container "+ count + " used " + Container.size() + " objects with weights " + Container.toString());
            count ++; 
        }
    }
}
            
