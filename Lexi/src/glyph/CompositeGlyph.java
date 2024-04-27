// Uses Composite Design Pattern

package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import java.util.ArrayList;
import window.Window;

public abstract class CompositeGlyph extends Glyph{
    private ArrayList<Glyph> children;

    public CompositeGlyph(){
        this.parent = null;
        this.children = new ArrayList<>();
        this.bounds = new Bounds(new Point(0,0), 0, 0);
    }

    //Not implemented here
    protected ArrayList<Glyph> getChildren() {
        return children;
    }

    //Not implemented here
    public void setChildren(ArrayList<Glyph> children) {
        this.children = children;
    }
    // Not implented here
    @Override
    public void draw(Window window){
        for(int i = 0; i < children.size(); i++){
            if(children.get(i) != null){
                children.get(i).draw(window);
            }
        }
    }
    //OK
    @Override
    public void insertAtPosition(Glyph glyph, int position) throws IndexOutOfBoundsException, OperationNotSupportedException {
        glyph.setParent(this);

        // If the given position is beyond arraysize, just insert NULL
        while(position > children.size()){
            children.add(children.size(), new Character(' '));
        }

        children.add(position, glyph);
        if (getParent() != null) {
            getParent().compose();
        }

    }
    // OK
    @Override
    public void remove(Glyph glyph) throws OperationNotSupportedException {
        if(children.contains(glyph)){
            children.remove(glyph);
            if (getParent() != null) {
                getParent().compose();
            }
        }
    }

    // OK
    public Glyph getChild(int position) {
        if(position >= children.size() || position < 0)
            throw new IndexOutOfBoundsException("No child at position: out of bounds");
        return children.get(position);

    }

    @Override
    public void onClick(Point point){
        for(Glyph child : this.children){
            if(child.intersect(point))
                child.onClick(point);
        }
    }

    //We haven't added setSize method.

}

