package ex45;

import java.io.*;
import java.util.Scanner;

public class App
{
	public static replacer replacer = new replacer();
	public static void main(String[] args) throws IOException
	{
		String file = "src/main/java/ex45/";
		String prompt;
		Scanner prompter = new Scanner(System.in);
		Scanner inputFile = new Scanner(new File("src/main/java/ex45/exercise45_input.txt"));


		System.out.print("Provide file name: ");
		prompt = prompter.nextLine();
		File fileOut = new File(file+prompt+"/");
		BufferedWriter outputFile = new BufferedWriter(new FileWriter(fileOut));

		replacer.storeAndReplaceString(inputFile, outputFile);
		inputFile.close();
		outputFile.close();
	}
}
