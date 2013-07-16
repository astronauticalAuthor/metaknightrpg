import java.awt.Graphics;

public abstract class Sprite {
  public void draw(double X, double Y, Graphics g) {
		draw((int)X, (int)Y, g);
	}
	
	public abstract void draw(int X, int Y, Graphics g);
}
