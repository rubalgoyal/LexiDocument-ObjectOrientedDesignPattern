package glyph;
import window.Window;
import java.awt.Point;

public class Rectangle extends Glyph {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        setParent(null);
        getBounds().getUpperLeft().setLocation(new Point(0,0));
        getBounds().setPointDimensions(width, height);

    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(getBounds().getUpperLeft().x,
                getBounds().getUpperLeft().y,
                getBounds().getWidth(),
                getBounds().getHeight()
        );

    }

    @Override
    public void setSize(Window window) {
        getBounds().setPointDimensions(this.width,this.height);

    }
}
