package home.work.lesons3;

import java.util.Scanner;

public class Task2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	String text = new Scanner(System.in).nextLine();
	System.out.println(name(text));
	}
	
	public static String userName (String fullName) {		
		String firstText = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, fullName.indexOf(" "));	
		String middleText = fullName.substring(fullName.indexOf(" "), fullName.indexOf(" ") + 2).toUpperCase() + ".";
		String lastText = fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.lastIndexOf(" ") + 2).toUpperCase() + ".";		
		return firstText + middleText + lastText;    
	}
	
	public static String name(String fullName)
	{
		String[] splited = fullName.split("\\s", 0);		
		return splited[0] + " " + Character.toUpperCase(splited[1].charAt(0)) + "." + Character.toUpperCase(splited[2].charAt(0)) + ".";
	}

}
