// Composite Design Pattern, Component Role


package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.Point;

import command.Command;
import window.Window;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(new Point(0,0), 0, 0);

    protected Command command = null;
    public abstract void draw(Window window);
    public abstract void setSize(Window window);
    public abstract void onClick(Point point);

    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    public Glyph getParent() {
        return parent;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void insertAtPosition(Glyph glyph, int position) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Not supported");
    }

    public void remove(Glyph glyph) throws OperationNotSupportedException{
        throw new OperationNotSupportedException("Does not support children");
    }

    public boolean intersect(Point point){
        boolean intersectHorizontal = this.bounds.getBoundStartX() <= point.x && point.x <= this.bounds.getBoudnEndX();
        boolean intersectVeritical = this.bounds.getBoundStartY() <= point.y && point.y <= this.bounds.getBoudnEndY();
        return intersectHorizontal || intersectVeritical;
    }

    public void compose(){}

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException{
        throw new OperationNotSupportedException("This Glyph can not have children");
    }
    public Command getCommand(){
        return getCommand();
    }

}
