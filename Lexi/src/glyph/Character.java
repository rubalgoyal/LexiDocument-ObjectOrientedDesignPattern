package glyph;


import java.awt.Point;
import window.Window;

public class Character extends Glyph {

    private char character;
    private Bounds bounds = new Bounds(new Point(0, 0), 0, 0);

    public Character(char character) {
        getBounds().setPointDimensions(0, 0);
        getBounds().getUpperLeft().setLocation(new Point(0, 0));
        this.character = character;

    }


    public void draw(Window window) {
        window.drawCharacter(this.character, getBounds().getUpperLeft().x,getBounds().getUpperLeft().y);
    }


    public void setSize(Window window) {
        getBounds().setPointDimensions(window.charWidth(this.character), window.charHeight(this.character) );

    }


}