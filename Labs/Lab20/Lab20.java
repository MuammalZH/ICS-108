package Labs.Lab20;

import java.util.ArrayList;

public class Lab20 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < 36; i++) {
            myArrayList.add(i);
        }
        System.out.println(largestNum(myArrayList));
    }

    public static int largestNum(ArrayList<Integer> myArrayList) {
        if (myArrayList.size() == 1) {
            return myArrayList.get(0);
        }

        else {
            ArrayList<Integer> subsList = new ArrayList<>(myArrayList.subList(1, myArrayList.size()));

            int num = largestNum(subsList);
            return (myArrayList.get(0) > num) ? myArrayList.get(0) : num;

        }
    }
}
