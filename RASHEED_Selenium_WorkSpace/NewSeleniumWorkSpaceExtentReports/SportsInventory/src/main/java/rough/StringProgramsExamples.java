package rough;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StringProgramsExamples {
	public static void duplicatedWords()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input the staring");
		
		String inputString=sc.nextLine().trim();
	String[] words=inputString.split(" ");
	HashMap<String,Integer> wordsCount=new HashMap<String, Integer>();
	
	for(String word:words)
	{
		if(wordsCount.containsKey(word))
		{
			wordsCount.put(word.toLowerCase(),wordsCount.get(word)+1);
			
		}
		else{
			
			wordsCount.put(word.toLowerCase(),1);
		}
		
		Set<String> keyNames=wordsCount.keySet();
		for(String KeyName:keyNames)
		{
		if(wordsCount.get(KeyName)>1)
		{
			
			System.out.println(KeyName+":" +wordsCount.get(KeyName) );
		}
			
		}
		
		
	}
		
	}
	
	

	public static void main(String[] args) {

		StringProgramsExamples.duplicatedWords();
	}

}
