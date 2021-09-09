package clases.java.basicos;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class asdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="buenas tardes";
		String a="buenas tardes";
		System.out.println(s.equals("buenas tardeS"));
		System.out.println(replaceVowelsBucles(s));
		System.out.println(replaceVowelsCharArray(s));
		System.out.println(replaceVowelsRegEx(s));
		
		
	
		
	}
	
	/*Ejemplo 1 usando expresiones regulares*/
	
	private static String replaceVowelsRegEx(String s) {
		return s.replaceAll("[AaEeIiOoUu]", " ");
	}

	
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	private static String replaceVowelsBucles(String s) {
		String answerString="";
		String vocales="AEIOU";
		for(int i=0;i<s.length();i++) {
			if(vocales.indexOf(Character.toUpperCase(s.charAt(i)))>=0)
				answerString+=" ";
			else
				answerString+=s.charAt(i);
		}
		return answerString;
	}
	
	
	
	/*ejemplo 3 usando array de vocales*/
	
	
	private static String replaceVowelsCharArray(String s) {
		String answerString="";
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i)))
				answerString+=" ";
			else
				answerString+=s.charAt(i);
		}
		return answerString;
	}
	
	
	private static boolean isVowel(char character) {
		char[] vowelsArray = {'A','E','I','O','U'};
		boolean answer =false;
		
		for (char vowel : vowelsArray) {
			
			if(Character.toUpperCase(character)== vowel)
				answer=true;
			
		}
		return answer;
	}
	
	
}
