package glyph;

import window.Window;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public abstract class GlyphComposition extends Composition{

    private ArrayList<Glyph> children = new ArrayList<>();

    public GlyphComposition(Compositor compositor){
        super(compositor);
    }

    public int getNumChild(){
        return this.children.size();
    }

    @Override
    public void insert(Glyph glyph, int position){
        glyph.setParent(glyph);
        this.children.add(position, glyph);
    }

    @Override
    public void insert(Glyph glyph){
        glyph.setParent(this);
        children.add(glyph);
    }

    @Override
    public void insert(String string){
        for(int i = 0; i < string.length(); i++){
            this.insert(new Character(string.charAt(i)));
        }
    }

    @Override
    public Glyph child(int position){
        if (position < this.children.size()){
            return this.children.get(position);
        }

        return null;
    }

    @Override
    public void draw(Window window){
        for(int i = 0; i < this.children.size(); i++){
            this.children.get(i).draw(window);
        }
    }

    @Override
    public void onClick(int x, int y){
        for(Glyph child : children){
            if (child.intersect(x, y)){
                child.onClick(x, y);
            }
        }
    }

    @Override
    public void remove(Glyph glyph) throws OperationNotSupportedException {
        this.children.remove(glyph);
    }
}
