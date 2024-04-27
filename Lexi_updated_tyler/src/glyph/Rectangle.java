package glyph;
import window.Window;
import java.awt.Point;

public class Rectangle extends Leaf {
//    private int width;
//    private int height;

    public Rectangle(int width, int height){
        this.setPosition(0,0);
        this.setBounds(width, height);

    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(this.getXposition(),
                this.getYposition(),
                this.getWidth(),
                this.getHeight()
        );

    }

    @Override
    public void setSize(Window window) {

    }
    @Override
    public String toString() {
        return "Rect: (" + this.getXposition() + "," + this.getYposition() +"), w = " + this.getWidth() + ", l = " + this.getHeight();
    }
}
