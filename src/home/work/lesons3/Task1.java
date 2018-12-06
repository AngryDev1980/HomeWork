package home.work.lesons3;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		walkingTheDog();
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void walkingTheDog() throws InterruptedException, IOException {				
		char player = '@';
		char smallBomb = 'b', bigBomb = 'B';
		char smallHealth = 'a', bigHealth = 'A';
		int stepRight = 0, stepDown = 0;
		int playerHealth = 100;
		int smallBombDamage = 20, bigBombDamage = 40;
		int smallAidKit = 20, bigAidKit = 40;
		int stepDamege = 5;
		
		char [] [] array = new char[10] [10];
		
		for (int index = 0; index < array.length; index++)
			for (int innerIndex = 0; innerIndex < array[index].length; innerIndex++)
				array[index][innerIndex] = '.';

		for (int i = 0; i < array.length; i++) {
			array[i][(int)(Math.random() * (array.length - 1))] = Math.random() > 0.5f ? smallBomb : bigBomb;
			array[i][(int)(Math.random() * (array.length - 1))] = Math.random() > 0.5f ? smallHealth : bigHealth;
		}

		array[stepDown][stepRight] = player;
		consolePrint(array, player, stepRight, stepDown, playerHealth);	
		do {

			
			array[stepDown][stepRight] = ',';
			String text = new Scanner(System.in).nextLine();			
			switch(text) {
				case "w": 
					stepDown--;
					if (stepDown < 0) {
						stepDown++;	
					}
					break;
				case "s": 
					stepDown++;
					if (stepDown > array.length - 1) {
						stepDown--;	
					}
					break;
				case "d": 
					stepRight++;
					if (stepRight > array.length - 1) {
						stepRight--;
					}
					break;
				case "a": 
					stepRight--;
					if (stepRight < 0) {
						stepRight++;	
					}
					break;
				case "esc": return;
			}		

			playerHealth = recalculateHeath(array, stepDown, stepRight, playerHealth);
			array[stepDown][stepRight] = player;
			consolePrint(array, player, stepRight, stepDown, playerHealth);	
			
			if (playerHealth == 0) {
				System.out.println("Game Over");
				return;
			}
			
		}while(true);		
	}	
	
	public static int recalculateHeath(char[][] array, int newPositionX, int newPositionY, int currentHealth)
	{
		char currentChar = array[newPositionX][newPositionY];
		currentHealth -= 5;
		switch (currentChar)
		{
		case 'a': currentHealth += 20;
			break;
		case 'A': currentHealth += 40;
			break;
		case 'b': currentHealth -= 20;
			break;
		case 'B': currentHealth -= 40;
			break;
		}
		
		if (currentHealth > 100) {
			currentHealth = 100;
		}
		else if (currentHealth < 0) {
			currentHealth = 0;
		}
		
		return currentHealth;
	}
	
	public static void consolePrint(char[][] array, char player, int playerStepX, int playerStepY, int playerHealth) throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("Task 4 : Input button for stap (w, s, a, d.) \nPlayer Health : " + playerHealth);
		for (int j = 0; j < array.length; j++) {
			for (int s = 0; s < array[j].length; s++) {
				array[playerStepY][playerStepX] = player;
				System.out.print(array[j][s] + " ");
			}
			System.out.println();
		}
	}

}