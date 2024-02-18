import glyph.*;
import glyph.Character;
import window.SwingWindow;
import window.Window;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        SwingWindow window = new SwingWindow("Lexi");
//        Glyph glyph = new Composition();
//        window.setContents(glyph);
        SimpleCompositor simpleCompositor1 = new SimpleCompositor(window);
        SimpleCompositor simpleCompositor2 = new SimpleCompositor(window);
        SimpleCompositor simpleCompositor3 = new SimpleCompositor(window);
        SimpleCompositor simpleCompositor4 = new SimpleCompositor(window);
        SimpleCompositor simpleCompositor5 = new SimpleCompositor(window);

        Row row1 = new Row(simpleCompositor1);
        Column column1 = new Column(simpleCompositor2);
        Column column2 = new Column(simpleCompositor3);

        Glyph x = new Character('x');
        Glyph y = new Character('y');
        Glyph z = new Character('z');
        Glyph A = new Character('A');
        Glyph B = new Character('B');
        Glyph C = new Character('C');
//        Glyph rectangle = new Rectangle(20, 10);
        try{
            column1.insert(x, 0);
            column1.insert(row1, 1);
            column1.insert(y, 2);
//            row1.insert(z, 1);
//            row1.insert(column2, 2);
//            row1.insert(A, 3);
//            column2.insert(B, 0);
//            column2.insert(C, 1);
        }
        catch (OperationNotSupportedException e){
            System.out.println(e);
        }

        window.setContents(column1);
    }
}