package languageAnalysis;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Starting Language Analysis.....");
		
		// TODO: Get CLI arguments, pass to FileHandler
		
		// TEST STRING TO BE DELETED once CLI args are implemented.
		String TEST_FILE = "readme.txt";
		
		FileHandler fileMan = new FileHandler(TEST_FILE);
		
		fileMan.getText();
	}
}
