package test;

import java.util.ArrayList;

public class Percentage 
{
	private ArrayList<String> words;
	private ArrayList<String> words1;
	private ArrayList<String> Commonwords;
	
	
	Percentage(ArrayList<String> words,ArrayList<String> words1, ArrayList<String> Commonwords)
	{
		this.words = words;
		this.words1 = words1;
		this.Commonwords = Commonwords;
	}

	float percentage()
	{
		float percent;
		
		if(words.size() > words1.size())//if the first file is larger compare it to the size of the common words list
		{
			percent = ((float)Commonwords.size() / (float)words.size())*100;//muilple by100 to get percent
		}
		else//otherwise compare the second file to the size of the common words list
		{
			percent = ((float)Commonwords.size() / (float)words1.size()*100);//muilple by100 to get percent
		}
	return percent;//return percentage
	}
}
