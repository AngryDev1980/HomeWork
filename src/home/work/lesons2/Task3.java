package home.work.lesons2;

import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		walkingTheDog();
	}
	
	@SuppressWarnings("resource")
	public static void walkingTheDog() throws IOException, InterruptedException {
		char [] array = new char[10];
		char player = '@';
		int playerStep = 0;
		System.out.println("Task 3: Input button (a, d)");
		do {	
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			for (int j = 0; j < array.length; j++) {
				array[j] = ',';
				array[playerStep] = player;	
				System.out.print(array[j] + " ");
			}			
			String text = new Scanner(System.in).nextLine();	
			switch(text) {
				case "d": playerStep++;
					for (int i = 0; i < array.length; i++) {
						if (playerStep > array.length - 1) {
							playerStep--;
						}		
						array[playerStep] = player;	
					}
					break;
				case "a": playerStep--;
					for (int i = 0; i < array.length; i++) {
						if (playerStep < 0) {
						playerStep++;
						}					
						array[playerStep] = player;
					}
					break;
				case "esc": return;
			}				
		}while(true);
	}
}
