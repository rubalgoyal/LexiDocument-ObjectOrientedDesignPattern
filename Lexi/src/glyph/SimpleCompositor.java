package glyph;

import window.Window;
import java.awt.Point;

public class SimpleCompositor implements Compositor{
    private Composition composition;
    private Window window;

    public SimpleCompositor(Window window){
        this.window = window;
    }

    @Override
    public void compose(){
        Point cursor = composition.getBounds().getUpperLeft();
        boolean flag = false;
        int position = 0;
        Glyph child = null;
        Glyph origin = null;

        while (!flag){
            try{
                if(composition.getChild(position) != null){
                    child = composition.getChild(position);
                    if (origin == null)
                        origin = child;

                    child.setSize(window);
                    child.getBounds().getUpperLeft().setLocation(cursor.x, cursor.y);
                    composition.getChild(position).compose();
                    cursor = composition.moveCursor(cursor, child);
                }
                composition.adjustBounds(cursor);

            } catch (IndexOutOfBoundsException e){
                flag = true;
            }
            position++;
        }

        if(origin != null)
            composition.getBounds().getUpperLeft().setLocation(origin.getBounds().getUpperLeft());
    }

    @Override
    public void setComposition(Composition composition){
        this.composition = composition;
    }
}
