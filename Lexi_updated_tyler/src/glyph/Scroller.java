package glyph;
import window.Window;

import javax.naming.OperationNotSupportedException;

public class Scroller extends Embellishment{
    private int swidth = 10;

    public Scroller(Glyph content, Compositor compositor ){
        super(content,compositor);
        this.swidth = 10;
//        super.setParent(null);
//        super.getBounds().setPointDimensions(0,0);
//        Point point = new Point(0,0);
//        super.getBounds().getUpperLeft().setLocation(point);
//        super.setChildren(new ArrayList<Glyph>());
//        super.setCompositor(compositor);
//        super.getCompositor().setComposition(this);
    }

    public Scroller(Glyph content, Compositor compositor, int scrollerWidth ){
        super(content,compositor);
        this.swidth = scrollerWidth;
    }

    private int getScrollerX(){
        return this.child(0).getWidth() + this.getXposition();
    }

    public String toString(){
        String output = "Scroller (" + this.getXposition() + "," + this.getYposition() + ") :[";
        output = output + this.child(0).toString();
        output = output + "]";
        return output;
    }

    public void setSize(Window window){
        int height = this.child(0).getHeight();
        int width = this.child(0).getWidth();
        this.setBounds(width + this.swidth,height);
    }

    public void draw(Window window) {
        super.draw(window);
        window.addScrollBar(this.getScrollerX(), this.getYposition(),this.swidth,this.getHeight()
        );
    }
    @Override
    public int getXstart(){
        return this.getXposition();
    }
    @Override
    public int getYstart(){
        return this.getYposition();
    }

}
