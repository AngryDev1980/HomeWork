package home.work.lesons2;

public class Task1 {

	public static void main(String[] args) {
		daysInMonth();
	}
	
	public static void daysInMonth() {
		int [] arrayMonth = new int[12];		
		for (int j = 1; j < arrayMonth.length + 1; j++) {
			arrayMonth[j - 1] = theMonth(j);
			System.out.print(arrayMonth[j - 1] + ". ");
		}
		System.out.println();
	}
	
	public static int theMonth(int x) {
		return (int)(28 + (x + Math.floor(x/8)) % 2 + 2 % x + 2 * Math.floor(1/x));
	}

}
