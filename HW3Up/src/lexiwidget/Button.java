package lexiwidget;

import glyph.Embellishment;
import window.Window;
import glyph.*;

public abstract class Button extends Embellishment {
    public abstract void draw(Window window);
    public abstract void setSize(Window window);
}
