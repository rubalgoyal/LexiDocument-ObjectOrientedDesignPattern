package glyph;

import window.Window;

import java.awt.*;

public class ArrayCompositor implements Compositor{
    private Composition composition;
    private Window window;

    public ArrayCompositor(Window window){
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
                if(composition.child(position) != null){
                    child = composition.child(position);
                    if (origin == null)
                        origin = child;

                    child.setSize(window);
                    child.getBounds().getUpperLeft().setLocation(cursor.x, cursor.y);
                    composition.child(position).compose();
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
