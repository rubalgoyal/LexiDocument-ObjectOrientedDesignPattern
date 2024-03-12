package glyph;

import java.awt.Point;
import java.util.ArrayList;
import window.Window;

public class Scroller extends Embellishment{
    private int width = 10;

    public Scroller(Compositor compositor){
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
        window.addScrollBar(
                getChild().getBounds().getUpperLeft().x + getChild().getBounds().getWidth()+3,
                getChild().getBounds().getUpperLeft().y,
                this.width,
                getChild().getBounds().getHeight()+3
        );
    }
}
