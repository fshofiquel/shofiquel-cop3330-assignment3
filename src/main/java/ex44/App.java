package ex44;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class App
{
	public static Product newProduct = new Product();

	public static void main(String[] args) throws IOException
	{
		File file =  new File("src/main/java/ex44/exercise44_input.json");
		Gson gson = new Gson();
		JsonReader jsonReader = new JsonReader(new FileReader(file));
	}
}
