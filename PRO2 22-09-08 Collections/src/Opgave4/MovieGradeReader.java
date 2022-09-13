package Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieGradeReader {

    public String printMovieGrades(String filePath)  {
        File txtFil = new File(filePath);

        Map<String, Double> addedGrades = new HashMap<>();
        Map<String, Integer> gradeCount = new HashMap<>();

        String outputText = "";

        try (Scanner scan = new Scanner(txtFil)) {
            int numberOfGrades = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < numberOfGrades; i++) {
                String title = scan.nextLine();
                int grade = Integer.parseInt(scan.nextLine());

                if (addedGrades.containsKey(title)) {
                    addedGrades.replace(title, addedGrades.get(title)+grade);
                    gradeCount.replace(title, gradeCount.get(title)+1);
                } else {
                    addedGrades.put(title, (double) grade);
                    gradeCount.put(title,1);
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found at the specified locaiton");
        }

        for (String m : addedGrades.keySet()) {
            String title = m;
            double average = addedGrades.get(m) / gradeCount.get(m);
            outputText = outputText + title + ": " + gradeCount.get(m) + " Karakterer, gennemsnit: " + average + "\n";
        }


        return outputText;

    }
}
