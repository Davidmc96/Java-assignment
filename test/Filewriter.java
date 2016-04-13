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
	 		
	 		try 
	 		{
	 			
	 			FileWriter fileWriter = new FileWriter(fileName);

	 			// Always wrap FileWriter in BufferedWriter.
	 			bufferedWriter = new BufferedWriter(fileWriter);

	 			bufferedWriter.write("The documents have these " + words + " words in common");
	 			bufferedWriter.newLine();
	 			bufferedWriter.write("The documents have these " + words1 +" words in common excluding stopwords");
	 			bufferedWriter.newLine();
	 			bufferedWriter.write("The documents are " + percent +" percent similar");

	 		} //end try
	 		catch (IOException ex) //error handing 
	 		{
	 			
	 			System.out.println("Error writing to file '" + fileName + "'");
	 			
	 		}//end catch
	 		
	 		finally 
	 		{

	 			// Always close files.
	 			try 
	 			{

	 				if (bufferedWriter != null) 
	 				{

	 					bufferedWriter.close();
	 				}//end fi

	 			} //end try
	 			
	 			catch (IOException e) 
	 			{

	 			}//end catch

	 		}//end finally
	 	}//end method

}//end class
	
	 

	 

	 		
	 		
	 		
	



