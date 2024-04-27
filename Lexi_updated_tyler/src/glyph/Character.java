package glyph;
import window.Window;
import java.awt.Point;

public class Character extends Leaf {

    private char character;

    public Character(char character) {
        this.character = character;

    }

    @Override
    public void draw(Window window) {
        window.drawCharacter(this.character, this.getXposition(), this.getYposition());
    }

    @Override
    public void setSize(Window window) {
        int width = window.charWidth(this.character);
        int height = window.charHeight(this.character);
        this.setBounds(width, height);
    }

    @Override
    public String toString() {
        return String.valueOf(this.character) + "(" + this.getXposition() + "," + this.getYposition() + ")";
    }


}