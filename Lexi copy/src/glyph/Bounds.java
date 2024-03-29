package glyph;

import java.awt.Point;

public class Bounds {
    private Point upperLeft;
    private  int width;
    private int height;

    public Bounds(Point upperLeft, int width, int height) {
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPointDimensions(int width, int height){
        this.width = width;
        this.height = height;
    }
}
