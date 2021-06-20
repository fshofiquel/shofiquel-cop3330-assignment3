/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex43;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App
{
	public static App newPrompter = new App();
	public static generateFolders newFolders = new generateFolders();
	public static generateHTML newHTML = new generateHTML();

	public static void main(String[] args) throws IOException
	{
		String siteName = "";
		String author = "";

		newPrompter.prompter(siteName, author);
	}

	public void prompter(String siteName, String author) throws IOException
	{
		String yN;
		Scanner sc = new Scanner(System.in);
		String basePath = "src/main/java/ex43/website/";
		File file = new File(basePath);
		boolean flag1 = false;
		boolean flag2 = false;

		System.out.print("Site name: ");
		siteName = sc.nextLine();
		System.out.print("Author: ");
		author = sc.nextLine();
		basePath = basePath + siteName + "/";

		String test = file.getPath();

		System.out.print("Do you want a folder for JavaScript? ");
		yN = sc.nextLine();
		if (yN.equals("y") || yN.equals("Y"))
		{
			newFolders.generateJSFolder(basePath);
			flag1 = true;
		}

		System.out.print("Do you want a folder for CSS? ");
		yN = sc.nextLine();
		if (yN.equals("y") || yN.equals("Y"))
		{
			newFolders.generateCSSFolder(basePath);
			flag2 = true;
		}

		newHTML.writeHTML(basePath, siteName, author);

		System.out.println("Created ./website/"+siteName);
		System.out.println("Created ./website/"+siteName+"/index.html");
		if (flag1)
			System.out.println("Created ./website/"+siteName+"/js/");
		if (flag2)
			System.out.println("Created ./website/"+siteName+"/css/");
	}
}
