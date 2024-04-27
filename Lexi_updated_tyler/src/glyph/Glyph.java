package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import java.io.InvalidObjectException;

import command.Command;
import window.Window;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(0, 0, 0, 0);

    private Command command = null;

    // Abstract methods
    public abstract void draw(Window window);
    public abstract void setSize(Window window);
    public abstract void onClick(int x, int y);
    public abstract void compose() throws OperationNotSupportedException;
    public abstract void remove(Glyph glyph) throws OperationNotSupportedException;
    public abstract int getNumChild();
    public abstract int getYshift();
    public abstract int getXshift();
    public abstract void insert(Glyph glpyh) throws OperationNotSupportedException;;

    public abstract void insert(String string) throws OperationNotSupportedException;;
    public abstract void insert(Glyph glyph, int position) throws OperationNotSupportedException;;

    public void setBounds(int startX, int startY, int endX, int endY){
        this.bounds.setBounds(startX, startY, endX, endY);
    }

    public void setBounds(int width, int height){
        this.bounds.adjustBounds(width, height);
    }

    public void setPosition(int x, int y){
        this.bounds.setPosition(x, y);
    }

    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    public Glyph getParent() {
        return parent;
    }

//    public Bounds getBounds() {
//        return bounds;
//    }



    public boolean intersect(int x, int y){
        return this.bounds.intersects(x, y);
    }

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException{
        throw new OperationNotSupportedException("This Glyph can not have children");
    }

    public Command getCommand(){
        return getCommand();
    }

    public int getXposition(){
        return this.bounds.getStartX();
    }

    public int getYposition(){
        return this.bounds.getStartY();
    }

    public int getHeight(){
        return this.bounds.getHeight();
    }

    public int getWidth(){
        return this.bounds.getWidth();
    }

}
