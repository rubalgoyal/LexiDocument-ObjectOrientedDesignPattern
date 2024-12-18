package lexiwidget;
import glyph.Compositor;
import java.awt.Point;
import java.util.Vector;
import glyph.Glyph;
import window.Window;

public class RedLabel extends Label {

    protected RedLabel(Compositor compositor, Glyph content){
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
        "red");
    }

    @Override
    public void setSize(Window window) {

    }
}
