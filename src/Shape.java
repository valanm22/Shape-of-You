import java.awt.Rectangle;
import java.awt.Graphics;

public abstract class Shape extends Rectangle {

    private String colorOfShape;
    private boolean isHollow;
    private static int countOfShapes;

    abstract void draw(Graphics graphics);
}
