
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameFrame extends JFrame{
	GameFrame(){
		String playerName = JOptionPane.showInputDialog(null, "Enter your name:");
        if (playerName == null || playerName.trim().isEmpty()) {
            playerName = "Player";
        }
		
		this.add(new GamePanel(playerName));
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	
	

}
