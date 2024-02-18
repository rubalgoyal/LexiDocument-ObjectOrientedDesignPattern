package glyph;
import window.*;

import javax.naming.OperationNotSupportedException;
import java.awt.Point;


public interface Glyph {
    void draw(Window window);
    Bounds getBounds();
    boolean intersects(Point point);
    void insert(Glyph glyph, int position) throws OperationNotSupportedException;
    void remove(Glyph glyph);
    Glyph child(int position);
    Glyph getParent();
    void compose();
    void setSize(Window window);
    void setParent(Glyph glyph) throws OperationNotSupportedException;
}
