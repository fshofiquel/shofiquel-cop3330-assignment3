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

		/*String[] employee;
		ArrayList<String> lastName = new ArrayList<>();
		ArrayList<String> firstName = new ArrayList<>();
		ArrayList<String> salary = new ArrayList<>();
		String tabFormat = "%-20s %-15s %-15s%n";

		while (inputFile.hasNext())
		{
			employee = inputFile.nextLine().split(",");

			lastName.add(employee[0]);
			firstName.add(employee[1]);
			salary.add(employee[2]);
		}

		String[] lastNameArr = new String[lastName.size()];
		String[] firstNameArr = new String[firstName.size()];
		String[] salaryArr = new String[salary.size()];

		lastNameArr = lastName.toArray(lastNameArr);
        firstNameArr = firstName.toArray(firstNameArr);
        salaryArr = salary.toArray(salaryArr);

        for (int i = 0; i < lastNameArr.length; i++)
        {
            outputFile.write(String.format(tabFormat, lastNameArr[i], firstNameArr[i], salaryArr[i]));
        }*/

		newData.parseData(inputFile, outputFile);

		inputFile.close();
		outputFile.close();
	}
}
