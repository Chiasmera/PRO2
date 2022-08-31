package Opgave6;

import java.io.File;

public class FileSearch {
    public static void ScanDir(String path) {
        System.out.println("[DIR] " + path);

        // skab et File-objekt svarende til mappen path
        File file = new File(path);

        // få listen over alle filer og undermapper
        String[] names = file.list();
        for (String name : names) {
            File file2 = new File(path + "/" + name);
            if (file2.isDirectory())
                ScanDir(path + "/" + name);
        }
    }

    public static int numOfDirectories(String path) {
        int result = 0;

        return searchAndCount(path);

    }


    public static int searchAndCount(String path) {
        int result = 1;

        // skab et File-objekt svarende til mappen path
        File file = new File(path);

        // få listen over alle filer og undermapper
        String[] names = file.list();
        for (String name : names) {
            File file2 = new File(path + "/" + name);
            if (file2.isDirectory()) {
                result = result + numOfDirectories(path + "/" + name);

            }
        }
        return result;
    }
}