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
		
		while (scanfile.hasNext()) 
		{
		  words.add(scanfile.next().toLowerCase());
		}
		
		scanfile.close();
		return words;
	}
}
