package lexiwidget;

import glyph.Embellishment;
import window.Window;

public abstract class Label extends Embellishment {

    public abstract void draw(Window window);
    public abstract void setSize(Window window);
}
