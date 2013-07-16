import java.awt.Graphics;
public class EntityCollisionBox extends Sprite {
  private double Radius;
	public EntityCollisionBox(double radius) {
		Radius = radius;
	}
	
	public void draw(int X, int Y, Graphics g) {
		g.drawOval(X, Y, 2 * (int)Radius, 2 * (int)Radius);
	}
}
