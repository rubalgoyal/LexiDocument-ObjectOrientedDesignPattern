// Design Pattern: Composite
// Role: Leaf
// Chain of Responsibility (223): Handler

package glyph;

import javax.naming.OperationNotSupportedException;
import java.io.InvalidObjectException;

abstract class Leaf extends Glyph{

    @Override
    public Glyph child(int index) {
        return null;
    }

    @Override
    public int getXshift() {
        return 0;
    }

    @Override
    public int getYshift() {
        return 0;
    }

    @Override
    public int getNumChild() {
        return 0;
    }
    @Override
    public void remove(Glyph glyph) throws OperationNotSupportedException {
    }

    @Override
    public void insert(Glyph glyph, int position) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Inserted into a Leaf");
    }

    @Override
    public void insert(Glyph glyph) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Inserted into a Leaf");
    }

    @Override
    public void insert(String s) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Inserted into a Leaf");
    }

    @Override
    public void compose() {
        // Does nothing
    }

    @Override
    public void onClick(int x, int y) {
        // Does nothing
    }

}
