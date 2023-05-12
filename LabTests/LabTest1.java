package LabTests;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabTest1 {
    public static void main(String[] args) {
        String filePath = "MissingLuctures.txt";

        try {
            Map<String, String> missedLectures = new HashMap<>();

            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(" ");
                if (data.length >= 2) {
                    String studentId = data[0];
                    String missedLecture = data[1];

                    if (missedLectures.containsKey(studentId)) {
                        String previousMissedLectures = missedLectures.get(studentId);
                        missedLectures.put(studentId, previousMissedLectures + ", " + missedLecture);
                    } else {
                        missedLectures.put(studentId, missedLecture);
                    }
                }
            }

            scanner.close();

            for (Map.Entry<String, String> entry : missedLectures.entrySet()) {
                String studentId = entry.getKey();
                String missedLecture = entry.getValue();
                System.out.println("Student " + studentId + " missed lectures: " + missedLecture);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }}}