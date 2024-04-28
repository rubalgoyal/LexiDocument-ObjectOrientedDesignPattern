//ConcreteElement

package glyph;

import window.*;
import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Vector;

public class Column extends Composition{

    public Column(Compositor compositor) throws OperationNotSupportedException {
        setParent(null);
        getBounds().setPointDimensions(0, 0);
        Point point = new Point(0, 0);
        getBounds().getStartPoint().setLocation(point);
        setChildren(new Vector<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window){
        super.draw(window);
    }

//    public Glyph getChild(int position) {
//
//        return super.getChild(position);
//    }

    public void setSize(Window window){
        int width = 0;
        int height = 0;
        Glyph child = getChildren().get(0);

        try{
            for(int i = 1; i> -1; i++){
                width = Math.max(width, child.getBounds().getWidth());
                height += child.getBounds().getHeight();
                child = this.getChild(i);
            }
        }
        catch (Exception e){
            getBounds().setPointDimensions(width, height);
        }
    }


    public Point moveCursor(Point cursor, Glyph child){
        cursor.y = child.getBounds().getStartPoint().y + child.getBounds().getHeight();
        return cursor;
    }

    public void adjustBounds(Point cursor){
        getBounds().setPointDimensions(getBounds().getWidth(), cursor.y - getBounds().getStartPoint().y);
    }
}
