package lexiwidget;
import java.awt.Point;

import command.Command;
import glyph.Glyph;
import glyph.Compositor;
import window.Window;

public class GreenButton extends Button {

    protected GreenButton(Compositor compositor, Glyph content, Command command){
        super(content,command);
        setParent(null);
        getBounds().setPointDimensions(0,0);
        getBounds().getStartPoint().setLocation(new Point(0,0));
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    @Override
    public void draw(Window window) {
        window.drawButton(
                getChild().getBounds().getStartPoint().x,
                getChild().getBounds().getStartPoint().y,
                getChild().getBounds().getWidth(),
                getChild().getBounds().getHeight(),
        "green");
        getChild().draw(window);

    }

    @Override
    public void setSize(Window window) {
        int width = 0;
        int height = 0;
        Glyph child = super.getChildren().get(0);
        try {
            for (int i = 1; i > -1; i++) {
                width += child.getBounds().getWidth();
                height = Math.max(height, child.getBounds().getHeight());
                child = this.getChild(i);
            }
        } catch (Exception e) {
            getBounds().setPointDimensions(width, height);
        }
    }

    @Override
    public void adjustBounds(Point cursor) {
        getBounds().setPointDimensions(
                getChildren().get(0).getBounds().getWidth(),
                getChildren().get(0).getBounds().getHeight()
        );

        getBounds().getStartPoint().setLocation(
                getChild().getBounds().getStartPoint().getLocation()
        );
    }
}
