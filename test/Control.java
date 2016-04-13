package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Control 
{
	public static void main(String args[]) throws FileNotFoundException
	{	
		ArrayList<String> Filenames = new ArrayList<String>();//arraylist to store file names
        Scanner userin = new Scanner(System.in);//scanner for user input
        while (Filenames.size() < 2) //two file names to be stored
        {
            System.out.println("Please enter file name: ");
            Filenames.add(userin.next());
        }
		userin.close();//close scanner
        
        //scan files user has chosen and stop word list
		Scan file1 = new Scan(Filenames.get(0));
		Scan file2 = new Scan(Filenames.get(1));
		Scan file3 = new Scan("src/test/Stopwords");
		
		
		Compare comparison = new Compare(file1.scanFile(),file2.scanFile());//compare files to eachother
		
		RemoveStopwords stopcompare = new RemoveStopwords(comparison.compareFiles(),file3.scanFile());//remove the stop words from the list of similar words
		
		Percentage percentsimilar = new Percentage(file1.scanFile(),file2.scanFile(),stopcompare.compareFilesNoStop());//get the percentage of words that are similar
		
		//write results to a file
		Filewriter results = new Filewriter(comparison.compareFiles(),stopcompare.compareFilesNoStop(),percentsimilar.percentage());
		results.writeResults();
		//display results to user in a GUI
		DisplayGUI gui = new DisplayGUI(comparison.compareFiles(),stopcompare.compareFilesNoStop(),percentsimilar.percentage());
		gui.setVisible(true);
	}

}

