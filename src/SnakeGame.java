import java.util.Scanner;
public class SnakeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        scanner.close();
        
		
		new GameFrame();

	}

}

