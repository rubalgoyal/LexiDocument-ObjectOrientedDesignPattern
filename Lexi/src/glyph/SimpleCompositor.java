package glyph;

import java.awt.Point;
import window.Window;

public class SimpleCompositor implements Compositor {
    private Composition composition; //Matched
    final private Window window; //Matched

    public SimpleCompositor(Window window) {
        this.window = window; //Matched
    }

    @Override
    public void compose() {
        Point cursor = composition.getBounds().getStartPoint();
        int cursorX = cursor.x;
        int cursorY = cursor.y;

//        Glyph child;
//        try{
//            for(int i = 0; i < composition.getChildren().size(); i++){
//                child = composition.getChild(i);
//                child.setSize(window);
//                child.getBounds().getStartPoint().setLocation(cursorX, cursorY);
//                child.compose();
////                cursorX += composition.
//            }
//            composition.setSize(window);
//        } catch (Exception e){
//            System.out.println(e);
//        }
        int position = 0;
        Glyph child = null;
        Glyph origin = null;
        // Just loop until reaches the end
        try {
            while (true) {
                if (composition.getChild(position) != null) {
                    child = composition.getChild(position);
                    if (origin == null)
                        origin = child;
                // ask child to set size, based on window
                    child.setSize(window);
                    // ask child to set position, based on cursor
                    child.getBounds().getStartPoint().setLocation(cursor.x, cursor.y);
                    // ask child to compose itself , recursivily
                    composition.getChild(position).compose();
                    // ask parent to adjust cursor, based on child
                    cursor = composition.moveCursor(cursor, child);
                }
                // ask parent to adjust itself, based on child
                composition.adjustBounds(cursor);
                // check if width or height has changd
                composition.setSize(window);
                position++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        if (origin != null)
            composition.getBounds().getStartPoint().setLocation(origin.getBounds().getStartPoint());
    }

    @Override
    public void setComposition(Composition composition) {
        this.composition = composition;
    }


}