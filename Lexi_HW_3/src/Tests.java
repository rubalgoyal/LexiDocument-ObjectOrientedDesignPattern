import glyph.*;
import glyph.Character;
import glyph.SimpleCompositor;
import window.SwingWindow;
import window.Window;
import lexiwidget.*;


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


    public static void hw2tests() throws OperationNotSupportedException {
        Window swingWindow = new SwingWindow("Lexi");
        Row row1 = new Row(new SimpleCompositor(swingWindow));
        Row row2 = new Row(new SimpleCompositor(swingWindow));
        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Column column2 = new Column(new SimpleCompositor(swingWindow));
        Scroller scroll1 = new Scroller(new SimpleCompositor(swingWindow));
        Border border1 = new Border(new SimpleCompositor(swingWindow), 2);

        char[] characters = {' ', 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'A', 'l', 'i', 'c', 'e', ' ', 'w', 'i', 't', 'h', 'i', 'n', ' ', 'a', ' ', 'b', 'o','r','d','e','r'
        };

        try {
            for(int i = 0; i < characters.length; i++){
                row1.insertAtPosition(new Character(characters[i]), i);
            }


            scroll1.insert(row1);
            border1.insert(scroll1);

        }
        catch (OperationNotSupportedException e) {
            System.out.println("OperationNotSupportedException caught");
        }
        swingWindow.setContents(border1);
    }

    public static void hw3tests() throws OperationNotSupportedException{
        Window window = new SwingWindow("Lexi");
        Row row1 = new Row(new SimpleCompositor(window));
        Column column1 = new Column(new SimpleCompositor(window));
        Column column2 = new Column(new SimpleCompositor(window));
        Row row2 = new Row(new SimpleCompositor(window));
        Row row3 = new Row(new SimpleCompositor(window));
        Glyph a = new Character('a');
        Glyph b = new Character('b');
        Glyph c = new Character('c');
        Glyph d = new Character('d');
        Glyph e = new Character('e');
        Glyph f = new Character('f');
        Glyph g = new Character('g');
        Glyph h = new Character('h');
        Glyph P = new Character('P');
        Glyph Q = new Character('Q');
        Scroller scroller = new Scroller(new SimpleCompositor(window));
        Border border = new Border(new SimpleCompositor(window),2);
        Glyph rect1 = new Rectangle(20,10);
        Label label = GUIFactory.getInstance().createLabel(new SimpleCompositor(window));
        Button button = GUIFactory.getInstance().createButton(new SimpleCompositor(window));
        try{
            row2.insertAtPosition(a,0);
            row2.insertAtPosition(rect1,1);
            column1.insertAtPosition(c,0);
            row1.insertAtPosition(f,0);
            row1.insertAtPosition(g,1);
            label.insert(row1);
            column1.insertAtPosition(label,1);
            column1.insertAtPosition(h,2);
            row2.insertAtPosition(column1,2);
            row2.insertAtPosition(d,3);
            scroller.insert(row2);
            border.insert(scroller);
            row3.insertAtPosition(P,0);
            row3.insertAtPosition(Q,1);
            button.insert(row3);
            column1.insertAtPosition(button,5);

        }catch (OperationNotSupportedException exception){
            System.out.println(exception);
        }
        window.setContents(border);
    }

}
