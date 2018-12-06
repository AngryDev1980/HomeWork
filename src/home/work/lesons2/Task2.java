package home.work.lesons2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args){
		palindrom();
	}
	
	@SuppressWarnings("resource")
	public static void palindrom(){
		System.out.println("Write text");
		do {
		String text = new Scanner(System.in).nextLine();;
		if (text.equals("esc")) {
			return;
		}
		char[] someText = text.toCharArray();
		System.out.println(isPalindrom(someText) ? "It's palindrom" : "It's not palindrom");
		} while(true);
	}	
	
	public static boolean isPalindrom(char[] text) {
		if (text.length == 0) {
			return false;
		}
		for (int i = 0; i < text.length / 2; i++) {
			if (text[i] != text[text.length - 1 -i])
				return false;	
		}
		return true;	
	}

}
