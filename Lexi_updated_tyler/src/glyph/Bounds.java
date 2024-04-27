package glyph;

import java.awt.Point;

//public class Bounds {
//    private Point upperLeft;
//    private  int width;
//    private int height;
//
//    public Bounds(Point upperLeft, int width, int height) {
//        this.upperLeft = upperLeft;
//        this.width = width;
//        this.height = height;
//    }
//    public Bounds(){
//
//    }
//
//    public Point getUpperLeft() {
//        return upperLeft;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setPointDimensions(int width, int height){
//        this.width = width;
//        this.height = height;
//    }
//}

public class Bounds {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Bounds(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void setBounds(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void adjustBounds(int width, int height){
        this.endX = this.startX + width;
        this.endY = this.startY + height;
    }

    public int getStartX(){
        return this.startX;
    }

    public int getStartY(){
        return this.startY;
    }

    public void setPosition(int x, int y){
        this.setBounds(x, endX - startX + x, y,endY - startY + y);
    }

    public boolean intersects(int x, int y){
        return startX < x && x < endX && startY < y && y < endY;
    }

    public int[] getBounds(){
        int[] bounds = {startX, startY, endX, endY};

        return bounds;
    }

    public int getHeight(){
        return endY - startY;
    }

    public int getWidth(){
        return endX - startX;
    }

}
