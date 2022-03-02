import java.awt.*;

public abstract class Shape extends Rectangle {

    private Color color;
    private String nature;
    private static int count;

    public Shape(Rectangle r, Color color, String nature) {
        super(r);
        this.color = color;
        this.nature = nature;
        count++;
    }

    public void setColor(Graphics g) {
        color = g.getColor();
    }

    public String getSolid() {
        return nature;
    }

    public static int getNoOfShapes() {
        return count;
    }

    public abstract void draw(Graphics g);
}
