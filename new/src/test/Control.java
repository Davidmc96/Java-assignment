package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterWriter;

public class Control 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scan file1 = new Scan("src/test/file.txt");
		Scan file2 = new Scan("src/test/file2.txt");
		Scan file3 = new Scan("src/test/Stopwords");
		
		System.out.println(file1.scanFile());
		System.out.println(file2.scanFile());
		
		Compare comparison = new Compare(file1.scanFile(),file2.scanFile());
		System.out.printf("The documents have these " + comparison.compareFiles() + " words in common\n");
		
		RemoveStopwords stopcompare = new RemoveStopwords(comparison.compareFiles(),file3.scanFile());
		
		Percentage percentsimilar = new Percentage(file1.scanFile(),file2.scanFile(),stopcompare.compareFilesNoStop());
		
		System.out.printf("The documents have these " + stopcompare.compareFilesNoStop()+" words in common excluding stopwords\n");
		System.out.printf("The documents are " + percentsimilar.percentage()+" percent similar");
		Filewriter results = new Filewriter(comparison.compareFiles(),stopcompare.compareFilesNoStop(),percentsimilar.percentage());
	}

}

