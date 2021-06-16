/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex41;

import java.io.*;
import java.util.Objects;

public class App
{
    public static sortedList newList = new sortedList();
    public static String[] names;

    public static void main(String[] args) throws IOException
    {
        BufferedReader iF = new BufferedReader(new FileReader("src/main/java/ex41/exercise41_input.txt"));
        BufferedWriter oF = new BufferedWriter(new FileWriter("src/main/java/ex41/exercise41_output.txt"));

        names = newList.storeNames(iF, oF, names);

        iF.close();
        oF.close();

    }
}

class sortedList
{
    public String[] storeNames(BufferedReader iF, BufferedWriter oF, String[] names) throws IOException
    {
        int i = 0;
        for (i = 0; iF.readLine() != null; i++)
        {
            names[i] = iF.readLine();
        }
        System.out.print("Stored names in string array...");
        return names;
    }

    public String[] sortNames(String[] names)
    {
        return null;
    }

    public void outputToFile()
    {
    }
}

