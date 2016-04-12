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
	
	
	ArrayList<String> Scanfile() throws FileNotFoundException
	{
		ArrayList<String> words = new ArrayList<String>();
		Scanner sc = new Scanner (new File(this.file));
		
		while (sc.hasNext()) 
		{
		  words.add(sc.next());
		}
		
		sc.close();
		return words;
	}
}
