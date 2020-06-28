package ua.lviv.lgs;

import java.lang.reflect.Array;

public class WorkWithText 
{
	//Checks whether word is palindrome.
	public static boolean isPalindrome(String word) throws WrongAmountOfLetters
	{
		if(word.length() != 5)
		{
			throw new WrongAmountOfLetters();
		}
		
		word = word.toUpperCase();
		
		StringBuffer wordBuffer = new StringBuffer();
		
		wordBuffer.append(word);
		
		if(word.equals(wordBuffer.reverse().toString()))
		{
			return true;
		}
		
		return false;
	}
	
	
	//Checks whether the sentence has vowels and replaces them with "-".
	//Changes the input StringBuffer.
	public static void replaceVowels(StringBuffer sentence)
	{
		//Move StringBuffer to upper case.
		String placeHolder = sentence.toString();
		placeHolder = placeHolder.toUpperCase();
		sentence.delete(0, sentence.length());
		sentence.append(placeHolder);
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'A' ||
					sentence.charAt(i) == 'I' ||
					sentence.charAt(i) == 'O' ||
					sentence.charAt(i) == 'U' ||
					sentence.charAt(i) == 'E'
					)
			{
				sentence.replace(i, i+1, "-");
			}
		}
	}
	
	//Counts number of words in a sentence.
	public static int countWords(String sentence)
	{
		return Array.getLength(sentence.split(" "));
	}
	
	//Clears word from special characters [ :\"+^*()-.<>!&?/|,[] ].
	public static void clearWord(StringBuffer word)
	{
		//Remove special symbols with function "replaceAll".
		String placeHolder = word.toString().replaceAll("[:\"+^*()-.<>!&?/|,0123456789]", "");
		
		word.delete(0, word.length());
		word.append(placeHolder);
		
		//Remove "[", "]" symbols because the previous method doesn't work with them. 
		if(placeHolder.contains("[") || placeHolder.contains("]")) 
		{
			for (int i = 0; i < word.length(); i++) 
			{
				if(word.charAt(i) == '[')
				{
					word.replace(i, i+1, "");
				}
				if(word.charAt(i) == ']')
				{
					word.replace(i, i+1, "");
				}
			}
		}
	}
	
	//Finds the most popular word in a sentence.
	public static StringBuffer theMostPopularWord(StringBuffer sentence)
	{
		//Find number of words in the text.
		int numberOfWords = Array.getLength(sentence.toString().split(" "));
		//Initialize array for those words.
		StringBuffer[] words = new StringBuffer[numberOfWords];
		//Give values for the array and use function "toUpperCase()".
		for(int i = 0; i < numberOfWords; i++)
		{
			words[i] = new StringBuffer().append(sentence.toString().toUpperCase().split(" ")[i]);
		}
		//Clear the words.
		for(int i = 0; i < numberOfWords; i++) 
		{
			clearWord(words[i]);
		}
		//Index of the most popular word.
		int popularWordIndex = 0;
		//Find the index.
		for(int i = 0; i < numberOfWords; i++)
		{
			int maxCount = 0;
			int count = 0;
			
			if(words[i].toString().trim().equals(""))
			{
				continue;
			}
			
			for (int j = 0; j < numberOfWords; j++) 
			{		
				if(words[i].equals(words[j]))
				{
					count++;
				}
			}
			
			if(count >= maxCount)
			{
				maxCount = count;
				popularWordIndex = i;
			}
			
		}
		//Return the word.
		return words[popularWordIndex];
	}
	
}
