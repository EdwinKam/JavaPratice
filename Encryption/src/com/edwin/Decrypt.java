package com.edwin;

public class Decrypt {

	String decryption (String text){
		String result="";
		char [] chars = text.toCharArray();
		for (char c : chars)
		{
			c-=5;
			result+=c;
		}
		return result;
	}

	String encryption (String input){
		String output="";
		char[] chars = input.toCharArray();
		for (char c : chars){
			c+= 5;
			output+=c;
		}
		return output;

	}


}
