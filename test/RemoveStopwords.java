package test;

import java.util.ArrayList;

public class RemoveStopwords 
{
	private ArrayList<String> Commonwords;
	private ArrayList<String> Stopwords;
	
	
	RemoveStopwords(ArrayList<String> Commonwords,ArrayList<String> Stopwords)
	{
		this.Commonwords = Commonwords;
		this.Stopwords = Stopwords;
	}
	
	
	ArrayList<String> compareFilesNoStop()
	{
		ArrayList<String> Similarwords = new ArrayList<String>();
		Similarwords.addAll(Commonwords);//put all words from the arraylist of similar words into another arraylist to avoid errors
		
		for(String word:Commonwords)//as long as there are words in the list of common
		{
			for (String word1:Stopwords)//as long as there are words in the stopwords file
			{
				if(word.equals(word1))//if one of the common words is a stop word remove it 
				{
					Similarwords.remove(word);
					break;//break to stop it form trying to remove it twice
				}
				
			}
		}
		return Similarwords;//return new list of similar words
	}
}