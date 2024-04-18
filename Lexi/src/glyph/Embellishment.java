package glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.*;
import window.Window;
public class Embellishment extends Composition{

    public Embellishment(Glyph contents){
        super();
    }
    public void compose(){
        super.compose();
    }
    public void draw(Window window){
        super.draw(window);
    }


    @Override
    public Point moveCursor(Point cursor, Glyph child) {
        return cursor;
    }

    @Override
    public void adjustBounds(Point cursor) {
        getBounds().setPointDimensions(
                getChildren().get(0).getBounds().getWidth(),
                getChildren().get(0).getBounds().getHeight()
        );

        getBounds().getUpperLeft().setLocation(
                getChild().getBounds().getUpperLeft().getLocation()
        );
    }

    @Override
    public void setSize(Window window) {
        getChildren().get(0).setSize(window);
    }

    public Glyph getChild(){
        return getChildren().get(0);
    }

    public void insert(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {

        if (getChildren().size() == 0) { // no child yet
            this.setParent(glyph.getParent());
            getChildren().add(glyph);
            glyph.setParent(this);
        }

        // UPDATE INTERNAL STRUCTURE
        reformat();
    }

    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        getChildren().get(0).insertAtPosition(glyph, position); // forward to childs's insert
        glyph.setParent(getChildren().get(0));

        // UPDATE INTERNAL STRUCTURE
        reformat();
    }

    public void remove(Glyph glyph) throws IndexOutOfBoundsException, OperationNotSupportedException {
        getChildren().get(0).remove(glyph);

        // UPDATE INTERNAL STRUCTURE
        reformat();
    }

}
