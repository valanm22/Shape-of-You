import java.awt.Rectangle;
import java.awt.Graphics;

public abstract class Shape extends Rectangle {

    private String colorOfShape;
    private boolean isHollow;
    private static int countOfShapes;

    public void setColorOfShape(String colorOfShape) {
        this.colorOfShape = colorOfShape;
    }

    public abstract void draw(Graphics graphics);
}
