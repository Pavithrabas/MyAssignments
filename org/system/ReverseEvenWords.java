package org.system;

public class ReverseEvenWords {
	public static void main(String[] args) {
			

	String text = "I am a software tester";
	String[] ReverseEvenWords = text.split(" ");
   for (int i = 0; i < ReverseEvenWords.length; i++) {
	    if (i % 2 != 0) {
	        char[] chars = ReverseEvenWords[i].toCharArray();
	        for (int j = chars.length - 1; j >= 0; j--) {
	            System.out.print(chars[j]);
	        }
	        System.out.print(" ");
	    } else {
	        System.out.print(ReverseEvenWords[i] + " ");
	    }
	}
}
}
		  
		 