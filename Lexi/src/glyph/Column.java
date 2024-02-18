package glyph;

import window.*;
import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import java.util.ArrayList;

public class Column extends Composition{

    public Column(Compositor compositor) throws OperationNotSupportedException {
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
        Glyph child = getChildren().get(0);

        try{
            for(int i = 1; i> -1; i++){
                width = Math.max(width, child.getBounds().getWidth());
                height += child.getBounds().getHeight();
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
        cursor.y = child.getBounds().getUpperLeft().y + child.getBounds().getHeight();
        return cursor;
    }

    public void adjustBounds(Point cursor){
        getBounds().setPointDimensions(getBounds().getWidth(), cursor.y - getBounds().getUpperLeft().y);
    }
}
