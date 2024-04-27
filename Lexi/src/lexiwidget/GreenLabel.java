package lexiwidget;
import java.awt.Point;
import glyph.Compositor;
import java.util.Vector;
import glyph.Glyph;
import window.Window;

public class GreenLabel extends Label{

    protected GreenLabel(Compositor compositor, Glyph content){
        super(content);
        setParent(null);
        getBounds().setPointDimensions(0,0);
        getBounds().getStartPoint().setLocation(new Point(0,0));
        setChildren(new Vector<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }
    @Override
    public void draw(Window window) {
        getChild().draw(window);
        window.drawLabel(
                getChild().getBounds().getStartPoint().x,
                getChild().getBounds().getStartPoint().y,
                getChild().getBounds().getWidth(),
                getChild().getBounds().getHeight(),
        "green");

    }

    @Override
    public void setSize(Window window) {

    }
}
