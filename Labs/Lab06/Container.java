package Labs.Lab06;

import java.util.ArrayList;

public class Container{

    ArrayList<Integer> weights = new ArrayList<>();
    int maximumWeight;
    
    public Container(int n){
        this.maximumWeight=n;
    }

    public boolean addItem(Integer itemWeight){
        if (itemWeight <= maximumWeight){
            maximumWeight= maximumWeight-itemWeight;
            weights.add(itemWeight);
            return true;
        }

        return false;
    }

    public ArrayList<Integer> get(){
        return weights;
    }
}


