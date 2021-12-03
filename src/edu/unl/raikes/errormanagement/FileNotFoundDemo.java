package edu.unl.raikes.errormanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundDemo {

   public static void main(String args[]) throws NullPointerException, FileNotFoundException{		
      File file = new File("turtle");
      //file.createNewFile();
      Scanner sc = new Scanner(file); 
   }
}

