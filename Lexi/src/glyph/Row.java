package glyph;

import window.Window;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import java.util.ArrayList;

public class Row extends Composition{

    public Row(Compositor compositor) throws OperationNotSupportedException {
        setParent(null);
        getBounds().setPointDimensions(0, 0);
        Point point = new Point(0, 0);
        getBounds().getUpperLeft().setLocation(point);
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window){
        super.draw(window);
    }

    public Glyph child(int position){
        return super.child(position);
    }

    public void setSize(Window window){
        int width = 0;
        int height = 0;
        Glyph child = super.getChildren().get(0);
        try{
            for(int i = 1; i > -1; i++){
                width += child.getBounds().getWidth();
                height = Math.max(height, child.getBounds().getHeight());
                child = this.child(i);
            }
        }
        catch (Exception e){
            getBounds().setPointDimensions(width, height);
        }
    }

    @Override
    public void setParent(Glyph glyph) throws OperationNotSupportedException {

    }

    public void setPosition(int x, int y){
        getBounds().getUpperLeft().setLocation(x, y);
    }

    public Point moveCursor(Point cursor, Glyph child){
        cursor.x = child.getBounds().getUpperLeft().x + child.getBounds().getWidth();
        return cursor;
    }

    public void adjustBounds(Point cursor){
        getBounds().setPointDimensions(cursor.x - getBounds().getUpperLeft().x, getBounds().getHeight());
    }
}