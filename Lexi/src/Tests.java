import glyph.*;
import glyph.Character;
import glyph.SimpleCompositor;
import window.SwingWindow;

import javax.naming.OperationNotSupportedException;

public class Tests {

    public static void hw1Tests() throws OperationNotSupportedException {
        SwingWindow swingWindow = new SwingWindow("Lexi");

        Row row1 = new Row(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row row2 = new Row(new ArrayCompositor(swingWindow));
        Row row3 = new Row(new SimpleCompositor(swingWindow));

        try{
            row1.insert(new Rectangle(20,15),0);
            row1.insert(new Character('a'),1);
            column1.insert(new Rectangle(10,50),0);
            column1.insert(new Character('X'),1);
            row2.insert(new Character('1'),0);
            row2.insert(new Character('2'),1);
            row2.insert(new Character('3'),2);
            column1.insert(row2,2);
            row1.insert(column1,2);
            row1.insert(new Character('b'),3);
            row3.insert(new Character('R'),0);
            row3.insert(new Character('U'),1);
            row3.insert(new Character('B'),2);
            row3.insert(new Character('A'),3);
            row3.insert(new Character('L'),4);
            column1.insert(row3,3);

        }catch (Exception e){
            System.out.println(e);
        }
        swingWindow.setContents(row1);
    }
}
