package glyph;

import window.*;
import window.Window;
import java.awt.*;
import javax.naming.OperationNotSupportedException;

public class Character implements Glyph {

    private char character;

    public Character(char character) {
        getBounds().setPointDimensions(0,0);
        getBounds().getUpperLeft().setLocation(new Point(0,0));
        this.character = character;

    }

    @Override
    public void draw(Window window){
        window.drawCharacter(this.character, getBounds().getUpperLeft().x, getBounds().getUpperLeft().y);
    }

    @Override
    public Bounds getBounds() {
        return new Bounds(new Point(0,0), 0,0);
    }

    @Override
    public boolean intersects(Point point) {
        return false;
    }

    @Override
    public void insert(Glyph glyph, int position) {

    }

    @Override
    public void remove(Glyph glyph) {

    }

    @Override
    public Glyph child(int position) {
        return null;
    }

    @Override
    public Glyph getParent() {
        return null;
    }

    @Override
    public void compose() {
    }

    @Override
    public void setSize(Window window) {
        getBounds().setPointDimensions(window.charWidth(this.character), window.charHeight(this.character));
    }

    @Override
    public void setParent(Glyph glyph) throws OperationNotSupportedException {
    }
}
