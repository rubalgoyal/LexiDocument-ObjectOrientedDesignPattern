package glyph;
import window.Window;

import java.awt.*;

public class Scroller extends Embellishment{
    private int width = 10;

    public Scroller(Compositor compositor, Glyph content){
        super(content);
        super.setParent(null);
        super.getBounds().setPointDimensions(0,0);
        Point point = new Point(0,0);
        super.getBounds().getStartPoint().setLocation(point);
//        super.setChildren(new ArrayList<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
        window.addScrollBar(
                getChild().getBounds().getStartPoint().x + getChild().getBounds().getWidth()+3,
                getChild().getBounds().getStartPoint().y,
                this.width,
                getChild().getBounds().getHeight()+3
        );
    }
}
