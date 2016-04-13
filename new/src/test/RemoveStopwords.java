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
		Similarwords.addAll(Commonwords);
		
		for(String word:Commonwords)
		{
			for (String word1:Stopwords)
			{
				if(word.equals(word1))
				{
					Similarwords.remove(word);
					break;
				}
				
			}
		}
		return Similarwords;
	}
}