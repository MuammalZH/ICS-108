package Labs.Lab24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class Lab24 {
    public static void main(String[] args) {
        TreeMap<String, TreeSet<Integer>> majors = new TreeMap<>();

        try (Scanner input = new Scanner(new File("ListOfStudents.txt"))) {
            while (input.hasNext()) {
                int id = input.nextInt();
                String major = input.next();
                TreeSet<Integer> ids = majors.computeIfAbsent(major, k -> new TreeSet<>());
                ids.add(id);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        List<String> majorList = new ArrayList<>(majors.keySet());
        List<TreeSet<Integer>> idList = new ArrayList<>(majors.values());

        for (int i = 0; i < majorList.size(); i++) {
            String major = majorList.get(i);
            TreeSet<Integer> ids = idList.get(i);
            System.out.println(major + ": " + ids);
        }
    }
}
