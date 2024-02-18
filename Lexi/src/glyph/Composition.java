package glyph;

import window.Window;

import javax.naming.OperationNotSupportedException;
import java.awt.*;

public abstract class Composition extends CompositeGlyph{
    private Compositor compositor;
    public abstract Point moveCursor(Point cursor, Glyph child);

    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }

    public Compositor getCompositor(){
        return compositor;
    }

    public void draw(Window window){
        super.draw(window);
    }

    public void refactor(){
        boolean isfound = false;
        Glyph current = this;
        while (!isfound){
            if(current.getParent() == null){
                isfound = true;
                current.compose();
            }
            else {
                current = current.getParent();
            }
        }
    }

    public void insert(Glyph glyph, int position) throws OperationNotSupportedException {
        super.insert(glyph, position);
        glyph.setParent(this);
        refactor();
    }

    public void remove(Glyph glyph){
        super.remove(glyph);
        refactor();
    }

    public void compose(){
        compositor.compose();
    }

    public abstract void adjustBounds(Point cursor);

}
