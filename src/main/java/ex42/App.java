package ex42;

import java.io.*;
import java.util.*;

public class App
{
	public static csvParser newData = new csvParser();
	public static void main(String[] args) throws IOException
	{
		File outFile = new File("src/main/java/ex42/exercise42_output.txt");
		Scanner inputFile = new Scanner(new File("src/main/java/ex42/exercise42_input.txt"));
		BufferedWriter outputFile = new BufferedWriter(new FileWriter(outFile));

		newData.parseData(inputFile, outputFile);

		inputFile.close();
		outputFile.close();
	}
}
