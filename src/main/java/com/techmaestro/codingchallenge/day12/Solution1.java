package com.techmaestro.codingchallenge.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 solution1=new Solution1();
		solution1.partitionLabels("ababcbacadefegdehijhklij");
	}
	
	
	    public List<Integer> partitionLabels(String s) {
	        
	        HashMap<Character,Integer> storeLastIndex= new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            
	            storeLastIndex.put(s.charAt(i),i);
	        }
	        
	        System.out.println(storeLastIndex);
	        
	        List<Integer> ans=new ArrayList<Integer>();
	        
	        int j=0, angor=0;
	        for(int i=0;i<s.length();++i) {
	        	
	        	j=Math.max(j, storeLastIndex.get(s.charAt(i)));
	        	
	        	if(i==j) {
	        		ans.add(i-angor+1);
	        		angor=i+1;
	        	}
	        }
	        System.out.println(ans);
			return ans;
	        
	        
	        
	    }
	

}
