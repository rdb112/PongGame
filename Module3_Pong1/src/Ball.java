import java.awt.Color;

public class Ball extends Sprite {

	final static int BALL_HEIGHT = 25;
	final static int BALL_WIDTH = 25;
	final static Color BALL_COLOUR = Color.BLACK;
	
	
	public Ball(int panelWidth, int panelHeight) {
		
		setHeight(BALL_HEIGHT);
		setWidth(BALL_WIDTH);
		setColour(BALL_COLOUR);
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		resetToInitialPosition();

	}

}
