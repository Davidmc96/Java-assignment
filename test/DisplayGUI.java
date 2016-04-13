package test;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;


public class DisplayGUI extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private static ArrayList<String> words;
	private static ArrayList<String> words1;
	private static float percent;

	public DisplayGUI(ArrayList<String> words,ArrayList<String> words1,float percent)
	{
		super("Results output");
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		DisplayGUI.words = words;
		DisplayGUI.words1 = words1;
		DisplayGUI.percent = percent;
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	 
		final JLabel statusbar = new JLabel("The results of the comparison are:");
		JTextArea text = new JTextArea("The documents have these " + words + " words in common");
		JTextArea text1 = new JTextArea("The documents have these " + words1+" words in common excluding stopwords");
		JTextArea text2 = new JTextArea("The documents are " + percent+" percent similar");
		c.add(statusbar);
		c.add(text);
		c.add(text1);
		c.add(text2);
	}//end of dispaly gui method


	public static void main(String args[]) 
	{
		 DisplayGUI sfc = new DisplayGUI(words, words, percent);
		 sfc.setVisible(true);
	}//end main of gui
}//end of gui class

