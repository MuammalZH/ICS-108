import java.util.LinkedList;
import java.util.ListIterator;

public class Lab23 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            numbers.add(i);
        }

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int prime = iterator.next();
            // Remove all multiples of the current prime number
            for (int i = prime * 2; i <= 100; i += prime) {
                numbers.remove(Integer.valueOf(i));
            }
        }

        System.out.println("The prime numbers between 2 and 100 are:");
        for (int prime : numbers) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}