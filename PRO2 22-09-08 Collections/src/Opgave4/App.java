package Opgave4;

public class App {
    public static void main(String[] args) {

        String path = "C:\\Users\\juliu\\IdeaProjects\\PRO2 22-09-08 Collections\\src\\Opgave4\\MovieGrades.txt";

        MovieGradeReader test1 = new MovieGradeReader();

        System.out.println(test1.printMovieGrades(path));

    }
}
