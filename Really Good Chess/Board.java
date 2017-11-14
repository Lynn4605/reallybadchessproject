
//----------------------------------------------------
import javax.swing.JFrame;

public class Board extends JFrame {
	private AnimationPanel panel;

	public Board() {
		
		
		setSize(810, 840);
		panel = new AnimationPanel();
		add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		panel.requestFocus(true);
	}

	public static void main(String[] args) {
		new Board();
	}
}
// -----------------------------------------------
