import javax.swing.JFrame;

public class Pong extends JFrame {
//This is the main class for the game

	static final int WIDTH = 800;
	static final int HEIGHT = 1000;
	static final String WINDOW_TITLE = "Pong Game V1";
	
	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(HEIGHT, WIDTH);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new PongPanel());
	}

	public static void main(String[] args) {

		new Pong();
	}

}
