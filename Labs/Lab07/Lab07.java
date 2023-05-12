package Labs.Lab07;

import java.util.ArrayList;
import java.util.Scanner;

import Labs.Lab06.Container;

public class Lab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Container: ");
        int contSize = input.nextInt();

        System.out.println("Enter the number of the objects: ");
        int numOfObjects = input.nextInt();

        ArrayList<Integer> weights = new ArrayList<>();

        System.out.println("Enter the weights of each object:");
        for (int i = 0; i < numOfObjects ; i++){
           int weight= input.nextInt();
           weights.add(weight);
        }

        ArrayList<ArrayList<Integer>> usedCont =binPacking(weights, numOfObjects, contSize);
        System.out.println("the Number of containers needed is " + usedCont.size());

        for(int i = 0; i < usedCont.size(); i++){
            String value = String.valueOf(i);
            System.out.println("Container " + value + " contains objects with weights " + usedCont.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> binPacking(ArrayList<Integer> weights, int numOfObjects ,int size) {

        Container[] Container = new Container[numOfObjects];
        for (int i = 0; i < numOfObjects; i++) {
            Container[i] = new Container(size);
        }

        while(!weights.isEmpty()){

            for(int i = 0; i < numOfObjects; i++) {
                for(int j = 0; j < weights.size(); j++) {
                    if(Container[i].addItem(weights.get(j))){
                        weights.remove(j);
                        j--;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numOfObjects; i++) {
            if(!Container[i].get().isEmpty()){
                result.add(Container[i].get());
            }
        }
        return result;
    }
}

