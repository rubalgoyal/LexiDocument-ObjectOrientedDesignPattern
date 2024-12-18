package lexiwidget;
import java.awt.Point;
import glyph.Compositor;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;

public class GreenLabel extends Label{

    protected GreenLabel(Compositor compositor){
        setParent(null);
        getBounds().setPointDimensions(0,0);
        getBounds().getUpperLeft().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }
    @Override
    public void draw(Window window) {
        getChild().draw(window);
        window.drawLabel(
                getChild().getBounds().getUpperLeft().x,
                getChild().getBounds().getUpperLeft().y,
                getChild().getBounds().getWidth(),
                getChild().getBounds().getHeight(),
        "green");

    }

    @Override
    public void setSize(Window window) {

    }
}
