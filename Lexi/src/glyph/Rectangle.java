package glyph;

import window.Window;

import java.awt.Point;

public class Rectangle extends Glyph {

    public Rectangle(int width, int height){
        setParent(null);
        getBounds().setPointDimensions(width, height);
        getBounds().getUpperLeft().setLocation(new Point(0,0));
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

    }
}
