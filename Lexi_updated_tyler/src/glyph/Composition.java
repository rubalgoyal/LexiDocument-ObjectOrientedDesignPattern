package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import window.Window;

public abstract class Composition extends CompositeGlyph{
    private Compositor compositor;

    public abstract int getXstart();
    public abstract int getYstart();

    public Composition(Compositor compositor){
        this.compositor = compositor;
    }
    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }

    @Override
    public void compose() throws OperationNotSupportedException {
        this.compositor.setComposition(this);
        this.compositor.compose();
    }


//    private Compositor compositor;
//    public abstract Point moveCursor(Point cursor, Glyph child);
//

//
//    public Compositor getCompositor(){
//        return compositor;
//    }
//
//    public void draw(Window window){
//        super.draw(window);
//    }
//
//    public void reformat(){
//        boolean parentFound = false;
//        Glyph current = this;
//        while (!parentFound){
//            if(current.getParent() == null){
//                parentFound = true;
//                current.compose();
//            }
//            else {
//                current = current.getParent();
//            }
//        }
//    }
//
//    public void insert(Glyph glyph, int position) throws OperationNotSupportedException {
//        super.insert(glyph, position);
//        glyph.setParent(this);
//        reformat();
//    }
//
//    public void remove(Glyph glyph) throws OperationNotSupportedException {
//        super.remove(glyph);
//        reformat();
//    }
//
//    public void compose(){
//        compositor.compose();
//    }
//
//    public abstract void adjustBounds(Point cursor);

}
