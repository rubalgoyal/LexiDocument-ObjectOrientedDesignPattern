package glyph;

import java.awt.Point;
import window.Window;
import java.util.ArrayList;

public class Border extends Embellishment{
    private int thickness;

    public Border (Compositor compositor, int thickness) {
        this.thickness = thickness;
        super.setParent(null);
        super.getBounds().setPointDimensions(0,0);
        Point point = new Point(0,0);
        super.getBounds().getUpperLeft().setLocation(point);
        super.setChildren(new ArrayList<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
        window.addBorder(
                getChild().getBounds().getUpperLeft().x,
                getChild().getBounds().getUpperLeft().y ,
                getChild().getBounds().getUpperLeft().x + getChild().getBounds().getWidth()+3 ,
                getChild().getBounds().getUpperLeft().y + getChild().getBounds().getHeight()+3,
                thickness);
    }
}
