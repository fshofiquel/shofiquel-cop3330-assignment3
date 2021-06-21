package ex45;

import java.io.*;
import java.util.Scanner;

public class App
{
	public static replacer replacer = new replacer();
	public static void main(String[] args) throws IOException
	{
		Scanner inputFile = new Scanner(new File("src/main/java/ex45/exercise45_input.txt"));
		BufferedWriter outputFile = new BufferedWriter
				(new FileWriter("src/main/java/ex45/exercise45_output.txt"));

		replacer.storeAndReplaceString(inputFile, outputFile);
		inputFile.close();
		outputFile.close();
	}
}
