/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class generateHTML
{
	public void writeHTML(String basePath, String siteName, String author) throws IOException
	{
		File file = new File(basePath);
		BufferedWriter htmlOutput = new BufferedWriter(new FileWriter(basePath+"index.html"));

		htmlOutput.write("<title>"+siteName+"</title>");
		htmlOutput.newLine();
		htmlOutput.write("<meta name = \""+author+"\"/>");

		htmlOutput.close();
	}
}
