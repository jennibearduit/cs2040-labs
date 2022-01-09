import java.util.Scanner;

public class SimonSays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String instruction = sc.nextLine();
			if (instruction.length() > 10) {
				if (instruction.substring(0,10).equals("Simon says")) {
					System.out.println(instruction.substring(10));
				}
			}
		}
	}
}
