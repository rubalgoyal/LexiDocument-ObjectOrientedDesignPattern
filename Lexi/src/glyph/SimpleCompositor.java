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

                    child.setSize(window);
                    child.getBounds().getStartPoint().setLocation(cursor.x, cursor.y);
                    composition.getChild(position).compose();
                    cursor = composition.moveCursor(cursor, child);
                }
                composition.adjustBounds(cursor);
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