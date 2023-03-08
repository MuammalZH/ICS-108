package Labs.Lab14;

import java.util.Arrays;

public class Lab14 {
    public static void main(String[] args) {
        Point [] points = new Point[4];
        points [0] = new Point(5, 2);
        points [1] = new Point(4, 0);
        points [2] = new Point(2, 7);
        points [3] = new Point(4, 3);

        System.out.println(points[0].equals( points [1]));

        System.out.println("the array before we sort it: ");
        System.out.print("[ ");
        
        for (Point point : points){
            System.out.print(point.toString() + " ");
        }
        System.out.print("]");

        Arrays.sort(points);
        System.out.println("\n the array after we sorted it: ");
        System.out.print("[ ");

        for (Point point : points){
            System.out.print(point.toString() + " ");
        }
        System.out.print("]");
    }
}
