package glyph;
import window.Window;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import java.util.ArrayList;

public class Border extends Embellishment{
    private int thickness;

    public Border (Glyph content,Compositor compositor) {
        super(content, compositor);
        this.thickness = 3;
    }

    public Border (Glyph content,Compositor compositor, int thickness) {
            super(content,compositor);
            this.thickness = thickness;
//        super.setParent(null);
//        super.getBounds().setPointDimensions(0,0);
//        Point point = new Point(0,0);
//        super.getBounds().getUpperLeft().setLocation(point);
//        super.setChildren(new ArrayList<Glyph>());
//        super.setCompositor(compositor);
//        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        window.addBorder(
                this.getXposition(), this.getYposition(),
                this.getXposition() + this.getWidth(),
                this.getYposition() + this.getHeight(),thickness);
                super.draw(window);
    }

    public void setSize(Window window){
        int height = this.child(0).getHeight();
        int width = this.child(0).getWidth();
        this.setBounds(width + (2 * this.thickness),height + (2* this.getWidth()));
    }



    @Override
    public int getXstart(){
        return this.getXposition() + this.getWidth();
    }
    public int getYstart(){
        return this.getYposition() + this.getWidth();
    }

}
