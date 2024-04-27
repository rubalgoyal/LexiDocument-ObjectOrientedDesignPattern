package lexiwidget;
import glyph.Compositor;
import java.awt.Point;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;

public class RedLabel extends Label {

    protected RedLabel( Glyph content, Compositor compositor){
        super(content, compositor);
    }


    @Override
    public void draw(Window window) {
        super.draw(window);
        window.drawLabel(this.getXposition(),this.getYposition(),this.getWidth(),this.getHeight(),"red");
    }

    @Override
    public void setSize(Window window) {
        int height = this.child(0).getHeight();
        int width = this.child(0).getHeight();
        this.setBounds(width + (2 * 4),height +(2 * 4));

    }
    public int getXstart(){
        return this.getXposition() + 4;
    }

    @Override
    public int getYstart(){
        return this.getYposition() + 4;
    }
}
