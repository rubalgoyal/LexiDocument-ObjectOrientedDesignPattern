// Design Pattern: Strategy
// Role: Abstract Strategy

package glyph;

import window.*;

import javax.naming.OperationNotSupportedException;

public abstract class Compositor {
    public abstract void compose() throws OperationNotSupportedException;
    private Composition composition;
    private Window window;
    void setComposition( Composition composition){
        this.composition = composition;
    }

    public Composition getComposition(){
        return this.composition;
    }

    public void setWindow(Window window){
        this.window = window;
    }

    public Window getWindow(){
        return this.window;
    }
}
