package glyph;

import java.awt.Point;
import window.Window;

import javax.naming.OperationNotSupportedException;

public class SimpleCompositor extends Compositor {

    public SimpleCompositor(Window window){
        this.setWindow(window);
    }

    @Override
    public void compose() throws OperationNotSupportedException {
        Composition composition = this.getComposition();

        int cursorX = composition.getXstart();
        int cursorY = composition.getYstart();

        Glyph child;

        for(int i = 0; i < composition.getNumChild(); i++){
            child = composition.child(i);
            child.setSize(getWindow());
            child.setPosition(cursorX, cursorY);
            child.compose();

            cursorX += composition.getXshift() * child.getWidth();
            cursorY += composition.getYshift() * child.getHeight();

        }

        composition.setSize(getWindow());
    }
//    private Composition composition;
//    final private Window window;
//
//    public SimpleCompositor(Window window) {
//        this.window = window;
//    }
//
//    @Override
//    public void compose() {
//        Point cursor = composition.getBounds().getUpperLeft();
//        int position = 0;
//        Glyph child = null;
//        Glyph origin = null;
//        // Just loop until reaches the end
//        try {
//            while (true) {
//                if (composition.getChild(position) != null) {
//                    child = composition.getChild(position);
//                    if (origin == null)
//                        origin = child;
//
//                    child.setSize(window);
//                    child.getBounds().getUpperLeft().setLocation(cursor.x, cursor.y);
//                    composition.getChild(position).compose();
//                    cursor = composition.moveCursor(cursor, child);
//                }
//                composition.adjustBounds(cursor);
//                composition.setSize(window);
//                position++;
//            }
//        } catch (IndexOutOfBoundsException e) {
//        }
//        if (origin != null)
//            composition.getBounds().getUpperLeft().setLocation(origin.getBounds().getUpperLeft());
//    }
//
//    @Override
//    public void setComposition(Composition composition) {
//        this.composition = composition;
//    }
}