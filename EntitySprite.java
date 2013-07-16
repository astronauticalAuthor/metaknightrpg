import java.awt.*;

public class EntitySprite extends Sprite {
  private Image sprite;
	public EntitySprite(Image img) {
		sprite = img;
	}
	
	public void draw(int X, int Y, Graphics g) {
		g.drawImage(sprite, X, Y, null);
	}
}
