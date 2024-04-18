    package lexiwidget;
    import java.awt.Point;
    import glyph.Glyph;
    import glyph.Compositor;
    import java.util.ArrayList;
    import window.Window;

    public class RedButton extends Button {

        protected RedButton(Compositor compositor){
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
            "red");
            getChild().draw(window);
        }

        @Override
        public void setSize(Window window) {
        }
    }
