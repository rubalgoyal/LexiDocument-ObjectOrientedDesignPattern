package glyph;

import window.Window;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import java.util.ArrayList;

public abstract class CompositeGlyph implements Glyph{
    private ArrayList<Glyph> children;
    private Bounds bounds = new Bounds(new Point(0,0), 0,0);
    public ArrayList<Glyph> getChildren() {
        return children;
    }
    public void setChildren(ArrayList<Glyph> children) {
        this.children = children;
    }

    @Override
    public void draw(Window window){
        for(int i = 0; i < children.size(); i++){
            if(children.get(i) != null){
                children.get(i).draw(window);
            }
        }
    }

    @Override
    public Bounds getBounds() {
        return this.bounds;
    }

    @Override
    public boolean intersects(Point point) {
        return false;
    }

    @Override
    public void insert(Glyph glyph, int position) throws IndexOutOfBoundsException, OperationNotSupportedException {
        while(position > children.size()){
            children.add(children.size(), null);

        }
        children.add(position, glyph);
    }

    @Override
    public void remove(Glyph glyph){
        if(children.contains(glyph)){
            children.remove(glyph);
        }
    }

    @Override
    public Glyph child(int position){
        if(position >= children.size() || position < 0)
            throw new IndexOutOfBoundsException("No child at position: out of bounds");

        return children.get(position);
    }

    @Override
    public Glyph getParent() {
        return null;
    }

    @Override
    public void compose() {

    }

    @Override
    public void setSize(Window window) {

    }

}

