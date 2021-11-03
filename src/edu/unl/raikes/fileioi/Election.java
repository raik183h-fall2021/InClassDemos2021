package edu.unl.raikes.fileioi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/edu/unl/raikes/fileioi/results.txt");

        Scanner fileScanner = new Scanner(file);
        int totalBidenVotes = 0;
        int totalTrumpVotes = 0;

        while (fileScanner.hasNext()) {
            // discard state
            fileScanner.next();

            // biden votes
            int bidenVotes = fileScanner.nextInt();

            // trump votes
            int trumpVotes = fileScanner.nextInt();

            // electoral votes
            int electoralVotes = fileScanner.nextInt();

            if (bidenVotes > trumpVotes) {
                totalBidenVotes += electoralVotes;
            } else {
                totalTrumpVotes += electoralVotes;
            }

            // discard pollster
            fileScanner.nextLine();
        }

        System.out.printf("Biden votes:%d\nTrump votes:%d", totalBidenVotes,totalTrumpVotes);
    fileScanner.close();
    }
}
