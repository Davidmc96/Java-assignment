package test;

import java.util.ArrayList;

public class Compare 
{
	private ArrayList<String> words;
	private ArrayList<String> words1;
	
	
	Compare(ArrayList<String> words,ArrayList<String> words1)
	{
		this.words = words;
		this.words1 = words1;
	}
	
	
	ArrayList<String> compareFiles()
	{
		ArrayList<String> CommonWords = new ArrayList<String>();
		
		for (String word:words)
		{
			for (String word1:words1)
			{
				if(word.equals(word1))
				{
					CommonWords.add(word);
					break;
				}
			}
		}
		return CommonWords;
	}
}
