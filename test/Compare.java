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
		
		for (String word:words)//as long as there are words in the first file
		{
			for (String word1:words1)//as long as there are words in the first file
			{
				if(word.equals(word1))//equates the current word in the first file to every word in teh second file
				{
					CommonWords.add(word);//if words are the same add to arraylist of similar words
					break;//break to stop words being added twice
				}
			}
		}
		return CommonWords;//return the arraylist of common words
	}
}
