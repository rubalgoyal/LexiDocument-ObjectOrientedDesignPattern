package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import window.Window;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(new Point(0,0), 0, 0);

    public abstract void draw(Window window);
    public abstract void setSize(Window window);

    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    public Glyph getParent() {
        return parent;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public boolean intersects(Point point){
        return bounds.getUpperLeft().equals(point);
    }

    public void insert(Glyph glyph, int position) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Not supported");
    }

    public void remove(Glyph glyph) throws OperationNotSupportedException{
        throw new OperationNotSupportedException("Does not support children");
    }

    public Glyph child(int position) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Does not support children");
    }

    public void compose(){

    }

}
