package test;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan
{
	private String file;
	
	
	Scan(String file)
	{
		this.file = file;
	}
	
	
	ArrayList<String> scanFile() throws FileNotFoundException
	{
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanfile = new Scanner (new File(this.file));
		
		while (scanfile.hasNext()) //while there are more words in the file continue scanning
		{
		  words.add(scanfile.next().toLowerCase());//add the lowercase version of each word in file into arraylist
		}
		
		scanfile.close();//close scanner
		return words;//return the arraylist of all words contained in file 
	}
}
