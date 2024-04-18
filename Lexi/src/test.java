import glyph.*;
import glyph.Character;
import glyph.SimpleCompositor;
import window.ApplicationWindow;
import window.SwingWindow;
import lexiwidget.*;
import window.Window;

import javax.naming.OperationNotSupportedException;

public class test {
    public static void test4() throws OperationNotSupportedException{
        Window window = new ApplicationWindow("Lexi");
        Row row1 = new Row(new SimpleCompositor(window));
        Row row2 = new Row(new SimpleCompositor(window));
        Column column1 = new Column(new SimpleCompositor(window));
        Column column2 = new Column(new SimpleCompositor(window));
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph e = new Character('e');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Glyph h = new Character('h');
        Scroller scrolle1 = new Scroller(new SimpleCompositor(window));
        Border border1 = new Border(new SimpleCompositor(window),2);
        Label label1 = GUIFactory.getInstance().createLabel(new SimpleCompositor(window));

        Glyph rect1 = new Rectangle(20,10);
        try{
            row2.insertAtPosition(a,0);
            row2.insertAtPosition(rect1,1);
            column1.insertAtPosition(c,0);
            row1.insertAtPosition(f,0);
            row1.insertAtPosition(g,1);
            label1.insert(row1);
            column1.insertAtPosition(label1,1);
            column1.insertAtPosition(h,2);
            row2.insertAtPosition(column1,2);
            row2.insertAtPosition(d,3);
            scrolle1.insert(row2);
            border1.insert(scrolle1);


        }
        catch (OperationNotSupportedException exception){
            System.out.println(exception);
        }
        window.setContents(border1);
    }

}
