/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex41;

import java.io.*;

public class App
{
    public static sortedList newList = new sortedList();
    public static String names;

    public static void main(String[] args) throws IOException
    {
        BufferedReader iF = new BufferedReader(new FileReader("src/main/java/ex41/exercise41_input.txt"));
        BufferedWriter oF = new BufferedWriter(new FileWriter("src/main/java/ex41/exercise41_output.txt"));

        newList.storeNames(iF, oF, names);
        System.out.print("Operation completed");
        iF.close();
        oF.close();

    }
}

class sortedList
{
    public void storeNames(BufferedReader iF, BufferedWriter oF, String names) throws IOException
    {
        while ((names = iF.readLine()) != null)
        {
            oF.write(names);
        }

    }

    public void sortNames()
    {
    }

    public void outputToFile()
    {
    }
}

