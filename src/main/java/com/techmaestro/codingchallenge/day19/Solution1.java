package com.techmaestro.codingchallenge.day19;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 solution1=new Solution1();
		String[] words= {"hello","leetcode"};
		String order="hlabcdefgijkmnopqrstuvwxyz";
		
		
		
		boolean chekDictionary= solution1.isAlienSorted(words,order);
		System.out.println(chekDictionary);
		
		String[] words1= {"word","world","row"};
		String order1="worldabcefghijkmnpqstuvxyz";
		
		
		
		boolean chekDictionary1= solution1.isAlienSorted(words1,order1);
		System.out.println(chekDictionary1);
		
		String[] words2= {"apple","app"};
		String order2="abcdefghijklmnopqrstuvwxyz";
		
		
		
		boolean chekDictionary2= solution1.isAlienSorted(words2,order2);
		System.out.println(chekDictionary2);
	}
	
 public boolean isAlienSorted(String[] words, String order) {
	
	Map<Character,Integer> orderMap= new  HashMap<>();
	for(int i=0;i<order.length();i++) {
		orderMap.put( order.charAt(i),i);
	}
	
	for(int i=1;i<words.length;i++) {
		boolean isNotInOder= isNotDictionaryOrder(words[i-1], words[i], orderMap);
		if(isNotInOder) {
			return false;
		}
	
	}
	
	return true;
       
    }

	boolean isNotDictionaryOrder(String prevWord, String currentWord, Map<Character, Integer> orderMap) {

		for (int i = 0; i < prevWord.length() && i < currentWord.length(); i++) {
			// check previous word is grater than current word
			if (orderMap.get(prevWord.charAt(i)) > orderMap.get(currentWord.charAt(i))) {
				return true;
			}
			else if (orderMap.get(prevWord.charAt(i)) < orderMap.get(currentWord.charAt(i))) {
				return false;
			} 
		}
		if(prevWord.length()>currentWord.length()) {
			return true;
		}

		return false;

	}
}
