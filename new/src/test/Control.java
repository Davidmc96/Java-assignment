package test;

import java.io.FileNotFoundException;

public class Control 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		Scan file1 = new Scan("src/test/file.txt");
		Scan file2 = new Scan("src/test/file2.txt");
		Scan file3 = new Scan("src/test/Stopwords");
		
		System.out.println(file1.Scanfile());
		System.out.println(file2.Scanfile());
		
		Compare comparison = new Compare(file1.Scanfile(),file2.Scanfile());
		System.out.printf("The documents have these " + comparison.compareFiles() + " words in common\n");
		
		RemoveStopwords stopcompare = new RemoveStopwords(comparison.compareFiles(),file3.Scanfile());
		
		Percentage percentsimilar = new Percentage(file1.Scanfile(),file2.Scanfile(),stopcompare.compareFilesnostop());
		
		System.out.printf("The documents have these " + stopcompare.compareFilesnostop()+" words in common excluding stopwords\n");
		System.out.printf("The documents are " + percentsimilar.percentage()+" percent similar");
	}

}

