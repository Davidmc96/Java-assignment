package test;

import java.util.ArrayList;

public class RemoveStopwords 
{
	private ArrayList<String> words;
	private ArrayList<String> words1;
	
	RemoveStopwords(ArrayList<String> words,ArrayList<String> words1)
	{
		this.words = words;
		this.words1 = words1;
	}
	
	
	ArrayList<String>  compareFilesnostop()
	{
		ArrayList<String> CommonWords = new ArrayList<String>();
		
		for(String word:words)
		{
			for (String word1:words1)
			{
				if(word.equals(word1))
				{
					CommonWords .remove(word);
				}
				
			}
		}
		return CommonWords;
	}
}