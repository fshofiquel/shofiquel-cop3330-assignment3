package ex42;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class csvParser
{
	private final ArrayList<String> lastName = new ArrayList<>();
	private final ArrayList<String> firstName = new ArrayList<>();
	private final ArrayList<String> salary = new ArrayList<>();

	public void parseData(Scanner inputFile, BufferedWriter outputFile) throws IOException
	{
		String[] employee;

		while (inputFile.hasNext())
		{
			employee = inputFile.nextLine().split(",");

			lastName.add(employee[0]);
			firstName.add(employee[1]);
			salary.add(employee[2]);
		}
		storeToArrays(lastName, firstName, salary, outputFile);
	}

	public void storeToArrays(ArrayList<String> lastName, ArrayList<String> firstName,
							  ArrayList<String> salary, BufferedWriter outputFile) throws IOException
	{
		String[] lastNameArr = new String[lastName.size()];
		String[] firstNameArr = new String[firstName.size()];
		String[] salaryArr = new String[salary.size()];

		lastNameArr = lastName.toArray(lastNameArr);
		firstNameArr = firstName.toArray(firstNameArr);
		salaryArr = salary.toArray(salaryArr);

		outputToFile(lastNameArr, firstNameArr, salaryArr, outputFile);
	}

	public void outputToFile(String[] lastNameArr, String[] firstNameArr,
							 String[] salaryArr, BufferedWriter outputFile) throws IOException
	{
		int length = lastNameArr.length;
		String tabFormat = "%-10s %-8s %s%n";

		outputFile.write(String.format(tabFormat, "Last", "First", "Salary"));
		outputFile.write("--------------------------\n");
		for (int i = 0; i < length; i++)
		{
			outputFile.write(String.format(tabFormat, lastNameArr[i], firstNameArr[i], salaryArr[i]));
		}
	}
}
