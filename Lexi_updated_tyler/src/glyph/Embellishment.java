package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import java.util.ArrayList;

import window.Window;
public abstract class Embellishment extends GlyphComposition{
    public Glyph child;

    public Embellishment(Glyph content, Compositor compositor)  {
        super(compositor);
        this.child = content;
    }
    public void compose() throws OperationNotSupportedException {
        super.compose();
        this.child.compose();
    }
    public void draw(Window window){
        this.child.draw(window);
    }
    @Override
    public int getNumChild(){
        return 1;
    }
    @Override
    public int getXshift(){
        return 0;
    }
    @Override
    public int getYshift(){
        return 1;
    }
    @Override
    public void onClick(int x, int y){
        child.onClick(x,y);
    }
    @Override
    public void remove(Glyph glyph) throws OperationNotSupportedException {
        this.child.remove(glyph);
    }


//    @Override
//    public Point moveCursor(Point cursor, Glyph child) {
//        return cursor;
//    }
//
//    @Override
//    public void adjustBounds(Point cursor) {
//        getBounds().setPointDimensions(
//                getChildren().get(0).getBounds().getWidth(),
//                getChildren().get(0).getBounds().getHeight()
//        );
//
//        getBounds().getUpperLeft().setLocation(
//                getChild().getBounds().getUpperLeft().getLocation()
//        );
//    }
//
//    @Override
//    public void setSize(Window window) {
//        getChildren().get(0).setSize(window);
//    }
//
//    public Glyph getChild(){
//        return getChildren().get(0);
//    }
//
//    public void insert(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
//
//        if (getChildren().size() == 0) { // no child yet
//            this.setParent(glyph.getParent());
//            getChildren().add(glyph);
//            glyph.setParent(this);
//        }
//
//        // UPDATE INTERNAL STRUCTURE
//        reformat();
//    }
//
//    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
//        getChildren().get(0).insert(glyph, position); // forward to childs's insert
//        glyph.setParent(getChildren().get(0));
//
//        // UPDATE INTERNAL STRUCTURE
//        reformat();
//    }
//
//    public void remove(Glyph glyph) throws IndexOutOfBoundsException, OperationNotSupportedException {
//        getChildren().get(0).remove(glyph);
//
//        // UPDATE INTERNAL STRUCTURE
//        reformat();
//    }

}
