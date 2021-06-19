/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex41;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

/*
    An ArrayList that all the functions can access.

    Three functions will be made:

    storeName() <-- Serves to store the names from the list and then store them into the array list then return or
    call the next function.
    Return type: void

    sortName() <--  This serves to sort the names in the ArrayList into ABC order.
    Return type: void

    outputToFile() <-- Formates and then outputs the file into the form requested in the assignment.
 */


public class nameSorter
{
    private static final List<String> temps = new ArrayList<>();

    public void storeName(Scanner inScanner, BufferedWriter outputFile) throws IOException
    {
        while (inScanner.hasNextLine())
        {
            temps.add(inScanner.nextLine());
        }
        sortName(outputFile);
    }

    public void sortName(BufferedWriter outputFile) throws IOException
    {
        Collections.sort(temps);
        outputToFile(outputFile);
    }

    public void outputToFile(BufferedWriter outputFile) throws IOException
    {
        String[] names = temps.toArray(new String[0]);
        outputFile.write("Total of "+ names.length+" names\n");
        outputFile.write("-----------------\n");

        for (String name : names)
        {
            outputFile.write(name);
            outputFile.newLine();
            System.out.println(name);
        }
    }
}
