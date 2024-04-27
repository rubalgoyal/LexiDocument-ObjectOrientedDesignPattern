import command.Command;
import command.DecrementFontSize;
import command.IncrementFontSize;
import glyph.*;
import glyph.Character;
import glyph.SimpleCompositor;
import window.ApplicationWindow;
//import window.SwingWindow;
import command.SetFontSize;
import lexiwidget.*;
import window.Window;

import javax.naming.OperationNotSupportedException;
import java.util.Set;

public class test {
//    public static void test4() throws OperationNotSupportedException{
//        Window window = new ApplicationWindow("Lexi");
//        Row row1 = new Row(new SimpleCompositor(window));
//        Row row2 = new Row(new SimpleCompositor(window));
//        Column column1 = new Column(new SimpleCompositor(window));
//        Column column2 = new Column(new SimpleCompositor(window));
//        Glyph a = new Character('a');
//        Glyph b = new Character('b');
//        Glyph c = new Character('c');
//        Glyph d = new Character('d');
//        Glyph e = new Character('e');
//        Glyph f = new Character('f');
//        Glyph g = new Character('g');
//        Glyph h = new Character('h');
//        Scroller scrolle1 = new Scroller(new SimpleCompositor(window));
//        Border border1 = new Border(new SimpleCompositor(window),2);
//        Label label1 = GUIFactory.getInstance().createLabel(new SimpleCompositor(window));
//
//        Glyph rect1 = new Rectangle(20,10);
//        try{
//            row2.insertAtPosition(a,0);
//            row2.insertAtPosition(rect1,1);
//            column1.insertAtPosition(c,0);
//            row1.insertAtPosition(f,0);
//            row1.insertAtPosition(g,1);
//            label1.insert(row1);
//            column1.insertAtPosition(label1,1);
//            column1.insertAtPosition(h,2);
//            row2.insertAtPosition(column1,2);
//            row2.insertAtPosition(d,3);
//            scrolle1.insert(row2);
//            border1.insert(scrolle1);
//
//
//        }
//        catch (OperationNotSupportedException exception){
//            System.out.println(exception);
//        }
//        window.setContents(border1);
//    }

    public static void test5() throws OperationNotSupportedException {
        Window window = new ApplicationWindow("Lexi");

        // Root Row
        Row rootRow = new Row(new SimpleCompositor(window));

        Column column = new Column(new SimpleCompositor(window));
        Row row1 = new Row(new SimpleCompositor(window));
        Row row2 = new Row(new SimpleCompositor(window));
        Row row3 = new Row(new SimpleCompositor(window));


        Character space = new Character(' ');

        Glyph rect1 = new Rectangle(20,10);
        Glyph rect2 = new Rectangle(10,20);

        try{

            insertWordsInGlyph("Hi Smith !! How are you doing?", row1, 0);
            insertWordsInGlyph("I am doing great", row2, 0);
            insertWordsInGlyph("I am enjoying OODP!", row3, 0);

            column.insertAtPosition(row1, 0);
//            column.insertAtPosition(space, 1);
            column.insertAtPosition(row2, 1);
            column.insertAtPosition(row3, 2);

            rootRow.insertAtPosition(column, 0);
            rootRow.insertAtPosition(rect1, 4);
            rootRow.insertAtPosition(space, 5);
            rootRow.insertAtPosition(rect2, 6);


            Row buttonRowComp = new Row(new SimpleCompositor(window));
            Row buttonPlusRow = new Row(new SimpleCompositor(window));
            Character plus = new Character('+');
            buttonPlusRow.insertAtPosition(plus, 0);
            Command buttonPlusComm = new IncrementFontSize(window);
            Button buttonPlus = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonPlusRow, buttonPlusComm);
            buttonRowComp.insertAtPosition(buttonPlus, 0);


            Row buttonMinusRow = new Row(new SimpleCompositor(window));
            Character minus = new Character('-');
            buttonMinusRow.insertAtPosition(minus, 0);
            Command buttonMinusComm = new DecrementFontSize(window);
            Button buttonMinus = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonMinusRow, buttonMinusComm);
            buttonRowComp.insertAtPosition(buttonMinus, 2);

            Row buttonHighRow = new Row(new SimpleCompositor(window));
            insertWordsInGlyph("40", buttonHighRow, 0);
            Command buttonHighComm = new SetFontSize(40, window);
            Button buttonHigh = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonHighRow, buttonHighComm);
            buttonRowComp.insertAtPosition(buttonHigh, 4);

            Row buttonLowRow = new Row(new SimpleCompositor(window));
            insertWordsInGlyph("10", buttonLowRow, 0);
            Command buttonLowComm = new SetFontSize(10, window);
            Button buttonLow = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonLowRow, buttonLowComm);
            buttonRowComp.insertAtPosition(buttonLow, 6);

            column.insertAtPosition(buttonRowComp, 4);

            Border border = new Border(new SimpleCompositor(window),rootRow,8);
            Scroller scroller = new Scroller(new SimpleCompositor(window), rootRow);
            window.setContents(scroller);
        }
        catch (OperationNotSupportedException e){
            System.out.println(e);
        }
    }

    public static int insertWordsInGlyph(String sentence, Glyph glyph, int position) throws OperationNotSupportedException {
        for(int i = 0; i < sentence.length(); i++){
            glyph.insertAtPosition(new Character(sentence.charAt(i)), position);
            position++;
        }
        return position;
    }

}
