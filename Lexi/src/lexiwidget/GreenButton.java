package lexiwidget;
import java.awt.Point;

import command.Command;
import glyph.Glyph;
import glyph.Compositor;
import java.util.ArrayList;
import window.Window;

public class GreenButton extends Button {

    protected GreenButton(Compositor compositor, Glyph content, Command command){
        super(content,command);
        setParent(null);
        getBounds().setPointDimensions(0,0);
        getBounds().getUpperLeft().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    @Override
    public void draw(Window window) {
        window.drawButton(
                getChild().getBounds().getUpperLeft().x,
                getChild().getBounds().getUpperLeft().y,
                getChild().getBounds().getWidth(),
                getChild().getBounds().getHeight(),
        "green");
        getChild().draw(window);

    }

    @Override
    public void setSize(Window window) {

    }
}
