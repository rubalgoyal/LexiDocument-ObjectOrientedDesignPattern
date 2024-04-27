package lexiwidget;
import java.awt.Point;
import glyph.Compositor;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;

public class GreenLabel extends Label{

    protected GreenLabel(Glyph content , Compositor compositor ){
        super(content,compositor);

    }
    @Override
    public void draw(Window window) {
        super.draw(window);
        window.drawLabel(this.getXposition(),this.getYposition(),this.getWidth(),this.getHeight(),"green");

    }

    @Override
    public void setSize(Window window) {
        int height = this.child(0).getHeight();
        int width = this.child(0).getHeight();
        this.setBounds(width + (2 * 4),height +(2 * 4));

    }

    @Override
    public int getXstart(){
        return this.getXposition() + 4;
    }

    @Override
    public int getYstart(){
        return this.getYposition() + 4;
    }
}
