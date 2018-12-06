package home.work.lesons3;

import java.util.Scanner;
//////// Tha't task not complete.
public class Task3 {

	public static void main(String[] args) throws Exception {
		int totalSum = new Scanner(System.in).nextInt();

		int devision300 = (totalSum / 300);
		int devision400 = (totalSum / 400);
		
		int disc = devision300 + devision400;
		
		switch (disc)
		{
		case 0:
			System.out.println("No discount! " + totalSum);
			break;
		case 1:
			System.out.println("300 discount " + (int)(totalSum * 0.97));
			break;
		case 2:
			System.out.println("400 discount " + (int)(totalSum * 0.96));
			break;
		default:
			System.out.println("600 discount " + (int)(totalSum * 0.9));
			break;
		}
	}
	

}
