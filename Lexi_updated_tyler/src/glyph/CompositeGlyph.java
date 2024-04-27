package glyph;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import window.Window;

public abstract class CompositeGlyph extends Glyph{
//    private ArrayList<Glyph> children;
//    public CompositeGlyph(){
//        this.children = new ArrayList<>();
//    }
//    protected ArrayList<Glyph> getChildren() {
//        return children;
//    }
//    public void setChildren(ArrayList<Glyph> children) {
//        this.children = children;
//    }
//
//    @Override
//    public void draw(Window window){
//        for(int i = 0; i < children.size(); i++){
//            if(children.get(i) != null){
//                children.get(i).draw(window);
//            }
//        }
//    }
//
//    @Override
//    public void insert(Glyph glyph, int position) throws IndexOutOfBoundsException, OperationNotSupportedException {
//        while(position > children.size()){
//            children.add(children.size(), null);
//
//        }
//        children.add(position, glyph);
//        if (getParent() != null) {
//            getParent().compose();
//        }
//
//    }
//
//    @Override
//    public void remove(Glyph glyph) throws OperationNotSupportedException {
//        if(children.contains(glyph)){
//            children.remove(glyph);
//            if (getParent() != null) {
//                getParent().compose();
//            }
//        }
//    }
//
//
//    public Glyph getChild(int position) {
//        if(position >= children.size() || position < 0)
//            throw new IndexOutOfBoundsException("No child at position: out of bounds");
//
//        return children.get(position);
//
//    }

}

