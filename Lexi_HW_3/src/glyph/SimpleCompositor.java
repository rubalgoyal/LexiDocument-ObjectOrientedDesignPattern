package glyph;

import window.Window;
import java.awt.Point;

public class SimpleCompositor implements Compositor {
    private Composition composition;
    private Window window;

    public SimpleCompositor(Window window) {
        this.window = window;
    }

    @Override
    public void compose() {
        Point cursor = composition.getBounds().getUpperLeft();
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
                    child.getBounds().getUpperLeft().setLocation(cursor.x, cursor.y);
                    composition.getChild(position).compose();
                    cursor = composition.moveCursor(cursor, child);
                }
                composition.adjustBounds(cursor);
                position++;
            }
        } catch (IndexOutOfBoundsException e) {

        }

        if (origin != null)
            composition.getBounds().getUpperLeft().setLocation(origin.getBounds().getUpperLeft());
    }

    @Override
    public void setComposition(Composition composition) {
        this.composition = composition;
    }
}