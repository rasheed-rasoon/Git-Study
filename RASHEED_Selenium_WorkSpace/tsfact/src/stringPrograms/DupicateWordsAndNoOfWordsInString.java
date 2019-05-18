package stringPrograms;

import java.util.HashMap;
import java.util.Set;

public class DupicateWordsAndNoOfWordsInString {
	
	public static void main(String []args)		
	{
		String str="I am Legend I am Legend sheik";
		String[] words=str.split(" ");
		for(String word:words)
		{
	System.out.println(word);
			
		}
		HashMap<String,Integer> wordsCount=new HashMap<String,Integer>();
		for(String word:words)
		{
		if(wordsCount.containsKey(word.toLowerCase()))
		{
			wordsCount.put(word.toLowerCase(),wordsCount.get(word.toLowerCase())+1);
			
		}
		else
		{
			
			wordsCount.put(word.toLowerCase(),1);
		}
		}
		Set<String> wordsInString=wordsCount.keySet();
		
		for(String word:wordsInString)
		{
		System.out.println("words are "+word);
		} 
		
		for(String word:wordsInString)
		{
		if(wordsCount.get(word)>1)
		{
		System.out.println(word +" count is "+wordsCount.get(word));	
		}
		}
		
		
		
		
	}

	}


