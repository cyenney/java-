/*
Write a program that asks the user for the names of two files.
 The first file should be opened for reading and the second file
  should be opened for writing. The program should read the
   contents of the first file, change all characters to uppercase,
    and store the results in the second file. The second file will
     be a copy of the first file, except that all the characters
      will be uppercase. Use Notepad or another text editor to
      create a simple file that can be used to test the program.

      Cody Yenney

*/

import java.util.Scanner;
import java.io.*;

public class uppercaseFileConverter
{
  public static void main(String[] args)
  throws IOException
  {
    String file1;

    String file2;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter 2 files. Enter the first file name now.");

    file1 = keyboard.nextLine();

    File readfile = new File("file1");

     Scanner inputFile = new Scanner(readfile);

    System.out.println("Enter second file name");

    file2 = keyboard.nextLine();

    PrintWriter outputFile = new PrintWriter(file2);

       while(inputFile.hasNext ())

       {
         String line = inputFile.nextLine();

         outputFile.println(line.toUpperCase ());
       }

         inputFile.close();

      outputFile.close();

  }
}
