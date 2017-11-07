import javax.swing.JFrame;

	import javax.swing.JPanel;
	 
	//Your extension may require you to modify this class.
	//Otherwise, nothing in here needs to change.
	public class BoardPrinter extends JFrame
	{
	                private AnimationPanel panel;
	                
	                public BoardPrinter()
	                {
	                                setSize(810, 840);
	                                panel = new AnimationPanel();
	                                add(panel);
	                                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	                                setVisible(true);
	                                setResizable(false);
	                                panel.requestFocus(true);
	                }
	                
	                public static void main(String[]args)
	                {
	                                new BoardPrinter();
	                }
	}
