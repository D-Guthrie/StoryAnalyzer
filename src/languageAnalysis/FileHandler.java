package languageAnalysis;

import java.io.*;

public class FileHandler {
	
	private static int errorBit;
	private String fileName;
	
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	public FileHandler(String inputFileName) {
		this.fileName = inputFileName;		
	}

	// TODO: Rewrite to only grab a line of text and pass it off, or maybe pass an array?
	// Where would it be better to do the string split?
	private void readFile() throws IOException{
		System.out.println("Reading file.....");
		try {
			String tempLine;
			in = new BufferedReader(new FileReader(fileName));
			
			// TODO: Redo this section to grab a sentence (using regex?) instead of just a line
			while((tempLine = in.readLine()) != null) {
				System.out.println("The current sentance is: " + tempLine);
							
				String[] sentanceWords = tempLine.split(" ");
				// System.out.println(sentanceWords[1]);
			}				
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errorBit = 1001;
		}
		finally {
			if(in != null) {
				in.close();
			}
		}
	}
	
	private void writeToFile() throws IOException {
		System.out.println("Writing to file.....");
		try {
			out = new BufferedWriter(new FileWriter(fileName));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errorBit = 1002;
		}
		finally {
			if(out != null) {
				out.close();
			}
		}
	}
	
	public int getErrorBit() {
		//TODO: Clean up error bit handling and assigning
		if(errorBit != 0) {
			
			return errorBit;
		}
		else {
			return errorBit;
		}
	}
	
	public void getText() throws IOException {
		
		readFile();
		
	}
	
}
