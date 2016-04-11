package test;
import java.io.*;

public class Readfile {

	public static void main(String[] args)  {

		// The name of the file to open.
		String fileName = "C:/Users/David/workspace1/new/src/test/file.txt";

		// This will reference one line at a time
		String line = null;
		
		BufferedReader bufferedReader = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {

			System.out.println("Unable to open file '" + fileName + "'");

		} catch (IOException ex) {

			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		} finally {

			// Always close files.
			try {
				
				if(bufferedReader != null){
					
					bufferedReader.close();
				}
				
				
			} catch (IOException e) 
			{
				
			}
			
		}
	}
}