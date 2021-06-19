/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex41;

import java.io.*;
import java.util.Scanner;

/*
    Fairly straight forward. Just create the input and output File IO variables needed for nameSorter class to handle
    and then close the file.
 */

public class App
{
    public static nameSorter newName = new nameSorter();
    public static void main(String[] args) throws IOException
    {
        File inFile = new File("src/main/java/ex41/exercise41_input.txt");
        File outFile = new File("src/main/java/ex41/exercise41_output.txt");
        Scanner inScanner = new Scanner(inFile);
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(outFile));

        newName.storeName(inScanner, outputFile);
        inScanner.close();
        outputFile.close();
    }
}
