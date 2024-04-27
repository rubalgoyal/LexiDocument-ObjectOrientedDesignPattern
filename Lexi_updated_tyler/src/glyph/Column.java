package glyph;

import window.*;
import javax.naming.OperationNotSupportedException;
import java.awt.Point;
import java.util.ArrayList;

public class Column extends GlyphComposition{

    public Column(Compositor compositor) throws OperationNotSupportedException {
        super(compositor);
    }

    public void setSize(Window window){
        int width = 0;
        int height = this.getYposition();

        Glyph child;

        try{
            for(int i = 0; i < this.getNumChild(); i++){
                child = this.child(i);
                height += child.getHeight();
                if (child.getWidth() > width)
                    width = child.getWidth();
            }
            this.setBounds(this.getXposition(), this.getXposition() + width, this.getYposition(), width);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }



    @Override
    public int getXshift(){
        return 0;
    }
    @Override
    public int getYshift(){
        return 1;
    }

    @Override
    public int getXstart(){
        return this.getXposition();
    }

    public int getYstart(){
        return this.getYposition();
    }
}
