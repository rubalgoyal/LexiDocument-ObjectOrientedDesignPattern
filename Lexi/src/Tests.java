import glyph.*;
import glyph.Character;
import glyph.SimpleCompositor;
import window.SwingWindow;
import window.Window;


import javax.naming.OperationNotSupportedException;

public class Tests {

    public static void hw1Tests() throws OperationNotSupportedException {
        SwingWindow swingWindow = new SwingWindow("Lexi");

        Row row1 = new Row(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row row2 = new Row(new SimpleCompositor(swingWindow));
        Row row3 = new Row(new SimpleCompositor(swingWindow));

        try{
            row1.insertAtPosition(new Rectangle(20,15),0);
            row1.insertAtPosition(new Character('a'),1);
            column1.insertAtPosition(new Rectangle(10,50),0);
            column1.insertAtPosition(new Character('X'),1);
            row2.insertAtPosition(new Character('1'),0);
            row2.insertAtPosition(new Character('2'),1);
            row2.insertAtPosition(new Character('3'),2);
            column1.insertAtPosition(row2,2);
            row1.insertAtPosition(column1,2);
            row1.insertAtPosition(new Character('b'),3);
            row3.insertAtPosition(new Character('A'),0);
            row3.insertAtPosition(new Character('l'),1);
            row3.insertAtPosition(new Character('i'),2);
            row3.insertAtPosition(new Character('c'),3);
            row3.insertAtPosition(new Character('e'),4);
            column1.insertAtPosition(row3,3);

        }catch (Exception e){
            System.out.println(e);
        }
        swingWindow.setContents(row1);
    }


    public static void hw2test() throws OperationNotSupportedException {
        // create objects
        Window sw = new SwingWindow("Lexi");
        SimpleCompositor sc1 = new SimpleCompositor(sw);
        SimpleCompositor sc2 = new SimpleCompositor(sw);
        SimpleCompositor sc3 = new SimpleCompositor(sw);
        SimpleCompositor sc4 = new SimpleCompositor(sw);
        Row row1 = new Row(sc1);
        Column col1 = new Column(sc2);
        Scroller scroll1 = new Scroller(sc3);
        Border border1 = new Border(sc4, 2);

        char[] characters = {'T', 'h', 'i', 's', ' ', 'i', 'n', 's', 'i', 'd', 'e', ' ', 't', 'h', 'e', ' ', 'B', 'o', 'r', 'd', 'e', 'r'};
        Glyph[] glyphs = new Glyph[characters.length];

        for (int i = 0; i < characters.length; i++) {
            glyphs[i] = new Character(characters[i]);
        }

        try {
            for(int i = 0; i < characters.length; i++){
                row1.insertAtPosition(glyphs[i], i);
            }
            scroll1.insert(row1);
            border1.insert(scroll1);
            row1.insertAtPosition(col1, 3);
        }
        catch (OperationNotSupportedException e) {
            System.out.println("OperationNotSupportedException caught");
        }
        sw.setContents(border1);
    }
}
