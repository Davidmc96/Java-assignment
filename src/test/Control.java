package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Control 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scan file1 = new Scan("src/test/file.txt");
		Scan file2 = new Scan("src/test/file2.txt");
		Scan file3 = new Scan("src/test/Stopwords");
		List<String> words =file1.Scanfile();
		System.out.println(words);
		List<String> words1 = file2.Scanfile();
		System.out.println(words1);
		Compare comparison = new Compare(file1.Scanfile(),file2.Scanfile());
		RemoveStopwords stopcompare = new RemoveStopwords(comparison.compareFiles(),file3.Scanfile());
		
		System.out.println((stopcompare.compareFilesnostop()));
		System.out.println(comparison.percentage());
	}

}

