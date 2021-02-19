package src.com.java8.examples;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main (String args []) {

        // Using anonymous class

        /*FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };*/

        // Using labmdba expression in place of anonymous class
        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("C:\\tmp"); //create this local dir
        //File [] files = dir.listFiles(fileFilter);
        File [] files = dir.listFiles(filterLambda);
        for (File f : files ) {
            System.out.println(f);
        }
    }
}
