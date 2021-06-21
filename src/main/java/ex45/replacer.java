package ex45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class replacer
{
	private final ArrayList<String> replacer = new ArrayList<>();
	public void storeAndReplaceString(Scanner inputFile, BufferedWriter outputFile) throws IOException
	{
		while (inputFile.hasNext())
		{
			replacer.add(inputFile.nextLine().replaceAll("utilize", "use"));
		}

		String[] newString = new String[replacer.size()];
		newString = replacer.toArray(newString);
		outputToFile(outputFile, newString);
	}

	public void outputToFile(BufferedWriter outputFile, String[] newString) throws IOException
	{
		int length = newString.length;

		for (String s : newString)
		{
			outputFile.write(s+" ");
			outputFile.newLine();
		}
	}

}
