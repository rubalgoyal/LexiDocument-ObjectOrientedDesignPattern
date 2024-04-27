// Uses Composite Design Pattern

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
        getBounds().getStartPoint().setLocation(new Point(0,0));
        getBounds().setPointDimensions(width, height);

    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(getBounds().getStartPoint().x,
                getBounds().getStartPoint().y,
                getBounds().getWidth(),
                getBounds().getHeight()
        );

    }

    @Override
    public void setSize(Window window) {
        getBounds().setPointDimensions(this.width,this.height);

    }

    @Override
    public void onClick(Point point) {
        //Do nothing
    }
}
