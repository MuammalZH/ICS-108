import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the maximum weight of the container: ");
        Container c1= new Container(input.nextInt());

        System.out.println("Enter the weight of each items: ");
        
        while(true){
            if(!(c1.addItem(input.nextInt()))){
                break;
            }
        }    
        System.out.println(c1.get());
    }
}

 class Container{

    ArrayList<Integer> weights = new ArrayList<>();
    int maximumWeight;
    
    Container(int n){
        this.maximumWeight=n;
    }

    public boolean addItem(int itemWeigt){
        if (itemWeigt <= maximumWeight){
            maximumWeight= maximumWeight-itemWeigt;
            weights.add(itemWeigt);
            return true;
        }

        return false;
    }

    public ArrayList<Integer> get(){
        return weights;
    }
}


