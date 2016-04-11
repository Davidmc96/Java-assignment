package test;

import java.util.ArrayList;

public class Percentage 
{
	private ArrayList<String> words;
	private ArrayList<String> words1;
	
	
	Percentage(ArrayList<String> words,ArrayList<String> words1)
	{
		this.words = words;
		this.words1 = words1;
	}

	float percentage()
	{
		float percent;
		ArrayList<String> CommonWords = new ArrayList<String>();
		
		
		if(words.size() > words1.size())
		{
			percent = words.size() / CommonWords.size();
		}
		else
		{
			percent = words1.size() / CommonWords.size();
		}
	return percent;
	}
}
