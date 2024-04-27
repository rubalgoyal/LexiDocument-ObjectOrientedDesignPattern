// Uses Composite Design Pattern

package glyph;
import window.Window;
import java.awt.Point;

public class Character extends Glyph {

    private char character;

    public Character(char character) {
        this.bounds =  new Bounds(new Point(0,0), 0, 0);
        getBounds().setPointDimensions(0, 0);
        getBounds().getStartPoint().setLocation(new Point(0, 0));
        this.character = character;

    }

    @Override
    public void draw(Window window) {
        window.drawCharacter(this.character, getBounds().getStartPoint().x,getBounds().getStartPoint().y);
    }

    @Override
    public void setSize(Window window) {
        getBounds().setPointDimensions(window.charWidth(this.character), window.charHeight(this.character) );
    }

    @Override
    public void onClick(Point point) {
        //Do Nothing
    }


}