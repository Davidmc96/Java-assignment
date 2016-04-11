package test;

import java.util.ArrayList;
import java.util.List;
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
	
		String[] arr = words.toArray(new String[0]);
		
		sc.close();
		return words;
	}
}
