package glyph;
import window.Window;
import java.awt.Point;
import java.util.ArrayList;

public class Row extends GlyphComposition {

    public Row(Compositor compositor) {
        super(compositor);
    }

//    public void draw(Window window){
//        super.draw(window);
//    }

//    @Override
//    public void adjustBounds(Point cursor) {
//        getBounds().setPointDimensions(cursor.x - getBounds().getUpperLeft().x,getBounds().getHeight());
//    }

//    public Glyph getChild(int position) {
//        return super.getChild(position);
//    }
    @Override
    public void setSize(Window window) {
        int width = getXposition();
        int height = 0;
        Glyph child ;

            for (int i = 1; i < getNumChild(); i++) {
                child = this.child(i);
                width += child.getWidth();
                if(child.getHeight() > height)
                    height = child.getHeight();

            }
            this.setBounds(this.getXposition(), width, this.getYposition(), this.getYposition() + height);
    }
    @Override
    public int getXshift(){
        return 1;
    }
    @Override
    public int getYshift(){
        return 0;
    }
    @Override
    public int getXstart(){
        return this.getXposition();
    }
    @Override
    public int getYstart(){
        return this.getYposition();
    }

//    public Point moveCursor(Point cursor, Glyph child) {
//        cursor.x = child.getBounds().getUpperLeft().x + child.getBounds().getWidth();
//        return cursor;
//    }
//
//    public void setPosition(int x, int y){
//        getBounds().getUpperLeft().setLocation(x,y);
//    }
}