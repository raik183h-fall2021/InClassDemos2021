package edu.unl.raikes.fileioi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/edu/unl/raikes/fileioi/weather.txt");
        
        Scanner fileScanner = new Scanner(file);
        
        
        // 16.2 to 23.5, change = 7.3
        double previous = fileScanner.nextDouble();
        
        while(fileScanner.hasNext()) {
            if(fileScanner.hasNextDouble()) {
            double current = fileScanner.nextDouble();
            double change = current - previous;

            System.out.println(change);
            
            previous = current;
            }
            else {
                fileScanner.next();
            }
        }

    }
}
