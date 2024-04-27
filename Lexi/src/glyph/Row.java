package glyph;
import window.Window;
import java.awt.Point;
import java.util.Vector;

public class Row extends Composition {

    public Row(Compositor compositor) {
        setParent(null);
        getBounds().setPointDimensions(0, 0);
        Point point = new Point(0, 0);
        getBounds().getStartPoint().setLocation(point);
        setChildren(new Vector<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
//        super(compositor);
    }

    public void draw(Window window){
        super.draw(window);
    }

    @Override
    public void adjustBounds(Point cursor) {
        getBounds().setPointDimensions(cursor.x - getBounds().getStartPoint().x,getBounds().getHeight());
    }

    public Glyph getChild(int position) {
        return super.getChild(position);
    }

    public void setSize(Window window) {
        int width = 0;
        int height = 0;
        Glyph child = super.getChildren().get(0);
        try {
            for (int i = 1; i > -1; i++) {
                width += child.getBounds().getWidth();
                height = Math.max(height, child.getBounds().getHeight());
                child = this.getChild(i);
            }
        } catch (Exception e) {
            getBounds().setPointDimensions(width, height);
        }
    }

    public Point moveCursor(Point cursor, Glyph child) {
        cursor.x = child.getBounds().getStartPoint().x + child.getBounds().getWidth();
        return cursor;
    }

    public void setPosition(int x, int y){
        getBounds().getStartPoint().setLocation(x,y);
    }
}