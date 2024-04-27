package lexiwidget;
import java.awt.Point;

import command.Command;
import glyph.Glyph;
import glyph.Compositor;
import java.util.ArrayList;
import window.Window;

public class GreenButton extends Button {

    protected GreenButton(Glyph content, Compositor compositor,  Command command){
        super(content,compositor,command);
    }

    @Override
    public void draw(Window window) {
        window.drawButton(
                this.getXposition(),
                this.getYposition(),
                this.getWidth(),
                this.getHeight(),
                "green");
    }

    @Override
    public void setSize(Window window) {
        int width = this.child(0).getWidth();
        int height = this.child(0).getHeight();
        this.setBounds(width + (4 * 3), height +(4 * 3));

    }
    @Override
    public int getXstart() {
        return this.getXposition() + 3;
    }

    @Override
    public int getYstart() {
        return this.getYposition() + 3;
    }



}
