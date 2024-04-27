package glyph;

import java.awt.Point;

public class Bounds {
    private Point startPoint;
    private  int width;
    private int height;

    public Bounds(Point startPoint, int width, int height) {
        this.startPoint = startPoint;
        this.width = width;
        this.height = height;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setPointDimensions(int width, int height){
//        this.startPoint.x = this.startPoint.x + width;
        this.width = width;
//        this.startPoint.y = this.startPoint.y + height;
        this.height = height;
    }

    public int getBoundStartX(){
        return this.startPoint.x;
    }

    public int getBoundStartY(){
        return this.startPoint.y;
    }

    public int getBoudnEndX(){
        return this.startPoint.x + this.width;
    }

    public int getBoudnEndY(){
        return this.startPoint.y + this.height;
    }
}
