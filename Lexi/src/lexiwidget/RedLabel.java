package lexiwidget;
import glyph.Compositor;
import java.awt.Point;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;

public class RedLabel extends Label {

    protected RedLabel(Compositor compositor, Glyph content){
        super(content);
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
        "red");

    }

    @Override
    public void setSize(Window window) {

    }
}
