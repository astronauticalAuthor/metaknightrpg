import java.awt.*;
import javax.swing.*;

public abstract class MapObject {
  private double X, Y;
	
	public void draw(Graphics g) {
		getSprite().draw(X, Y, g);
	}
	
	protected abstract EntitySprite getSprite();
}
