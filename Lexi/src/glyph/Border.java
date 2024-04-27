package glyph;
import window.Window;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Border extends Embellishment{
    private int thickness;

    public Border (Compositor compositor,Glyph content, int thickness) {
        super(content);
        this.thickness = thickness;
        super.setParent(null);
        super.getBounds().setPointDimensions(0,0);
        Point point = new Point(0,0);
        super.getBounds().getStartPoint().setLocation(point);
        super.setChildren(new Vector<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
        window.addBorder(
                getChild().getBounds().getStartPoint().x,
                getChild().getBounds().getStartPoint().y ,
                getChild().getBounds().getStartPoint().x + getChild().getBounds().getWidth()+3 ,
                getChild().getBounds().getStartPoint().y + getChild().getBounds().getHeight()+3,
                thickness);
    }
}
