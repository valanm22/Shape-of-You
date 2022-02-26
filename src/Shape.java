import java.awt.Rectangle;
import java.awt.Graphics;

public abstract class Shape extends Rectangle {

    private String colorOfShape;
    private String natureOfShape;
    private static int countOfShapes;

    abstract void draw(Graphics graphics);
}
