/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex43;

import java.io.File;

public class generateFolders
{
	public void generateJSFolder(String basePath)
	{
		String newPath;
		newPath = basePath+"js/";
		File file = new File(newPath);

		boolean bool = file.mkdirs();
		if (!bool)
			System.out.println("ERROR IN MAKING DIRECTORY");
	}

	public void generateCSSFolder(String basePath)
	{
		String newPath;
		newPath = basePath+"css/";
		File file = new File(newPath);

		boolean bool = file.mkdirs();
		if (!bool)
			System.out.println("ERROR IN MAKING DIRECTORY");
	}
}
