package test;
import java.io.*;
import java.util.ArrayList;

public class Filewriter 
{	
	private static ArrayList<String> words;
	private static ArrayList<String> words1;
	private static float percent;
	
	
	Filewriter(ArrayList<String> words,ArrayList<String> words1,float percent)
	{
		Filewriter.words = words;
		Filewriter.words1 = words1;
		Filewriter.percent = percent;
	}
	
	
	 void writeResults() throws FileNotFoundException
	 {
		 String fileName = "results.txt";// The name of the file to open.
		 
		 BufferedWriter bufferedWriter = null;
	 		
	 		try {
	 			// Assume default encoding.
	 			FileWriter fileWriter = new FileWriter(fileName);

	 			// Always wrap FileWriter in BufferedWriter.
	 			bufferedWriter = new BufferedWriter(fileWriter);

	 			// Note that write() does not automatically
	 			// append a newline character.
	 			bufferedWriter.write("Hello there,");
	 			bufferedWriter.write(" here is some text.");
	 			bufferedWriter.newLine();
	 			bufferedWriter.write("We are writing");
	 			bufferedWriter.write(" the text to the file.");

	 		} catch (IOException ex) {
	 			
	 			System.out.println("Error writing to file '" + fileName + "'");
	 			// Or we could just do this:
	 			// ex.printStackTrace();
	 		}finally {

	 			// Always close files.
	 			try {

	 				if (bufferedWriter != null) {

	 					bufferedWriter.close();
	 				}

	 			} catch (IOException e) {

	 			}

	 		}
	 	}

}
	
	 

	 

	 		
	 		
	 		
	



