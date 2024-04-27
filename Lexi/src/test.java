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

        Compositor compositor = new SimpleCompositor(window);

        Column column = new Column(compositor);
        Column column2 = new Column(compositor);
        // Root Row
        Row row = new Row(new SimpleCompositor(window));

        Character x = new Character('X');
        Character y = new Character('Y');
        Character z = new Character('Z');
        Character a = new Character('A');
        Character b = new Character('B');

        Character one = new Character('1');
        Character two = new Character('2');

        Character space = new Character(' ');

        Glyph rect1 = new Rectangle(20,10);
        Glyph rect2 = new Rectangle(5,5);
        Glyph rect3 = new Rectangle(5,25);

        try{
            column.insertAtPosition(x, 0);
            column.insertAtPosition(y, 1);
            column.insertAtPosition(space, 2);
            column.insertAtPosition(rect2, 3);

            column2.insertAtPosition(a, 0);
            column2.insertAtPosition(b, 1);
            column2.insertAtPosition(rect2, 2);


            row.insertAtPosition(column, 0);
            row.insertAtPosition(rect1, 1);
            row.insertAtPosition(column2, 2);

            Row buttonRowComp = new Row(new SimpleCompositor(window));


            Row buttonPlusRow = new Row(new SimpleCompositor(window));
            Character Plus = new Character('+');
            buttonPlusRow.insertAtPosition(Plus, 0);

            Command buttonPlusComm = new IncrementFontSize(window);
            Button buttonPlus = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonPlusRow, buttonPlusComm);
            buttonRowComp.insertAtPosition(buttonPlus, 0);

            buttonRowComp.insertAtPosition(space, 0);
            buttonRowComp.insertAtPosition(space, 1);
            buttonRowComp.insertAtPosition(space, 2);
            buttonRowComp.insertAtPosition(space, 3);
            buttonRowComp.insertAtPosition(one,4);
            buttonRowComp.insertAtPosition(two,5);
            buttonRowComp.insertAtPosition(rect3, 6);
            buttonRowComp.insertAtPosition(x, 7);
            buttonRowComp.insertAtPosition(y, 8);
            buttonRowComp.insertAtPosition(z, 9);


            Command command = new SetFontSize(80, window);


            Button button1 = GUIFactory.getInstance().createButton(new SimpleCompositor(window),buttonRowComp,command);

            row.insertAtPosition(button1, 3);

            window.setContents(row);
        }
        catch (OperationNotSupportedException e){
            System.out.println(e);
        }
    }


//    public static void test5Alternate() throws OperationNotSupportedException {
//
//        Window window = new ApplicationWindow("my Window");
//
//        //Root Column
//        SimpleCompositor rootComp = new SimpleCompositor(window);
//        Column root = new Column(rootComp);
//
//        try {
//            //Button Row Creation
//            SimpleCompositor buttonRowComp = new SimpleCompositor(window);
//            Row buttonRow = new Row(buttonRowComp);
//            root.insertAtPosition(buttonRow, 0);
//
//            SimpleCompositor button20RowComp = new SimpleCompositor(window);
//            Row button20Row = new Row(button20RowComp);
//            Character twenty2 = new Character('2');
//            Character twenty0 = new Character('0');
//            button20Row.insertAtPosition(twenty2, 0);
//            button20Row.insertAtPosition(twenty0, 1);
//
//            Command button20Comm = new SetFontSize("Font size 20", 20, window);
//            SimpleCompositor button20Comp = new SimpleCompositor(window);
//            Button button20 = GUIFactory.getInstance().createButton(button20Comp, button20Row, button20Comm);
//            buttonRow.insertAtPosition(button20, 0);
//
//
//            SimpleCompositor button14RowComp = new SimpleCompositor(window);
//            Row button14Row = new Row(button14RowComp);
//            Character fourteen1 = new Character('1');
//            Character fourteen4 = new Character('4');
//            button14Row.insertAtPosition(fourteen1, 0);
//            button14Row.insertAtPosition(fourteen4, 1);
//
//            Command button14Comm = new SetFontSize("Font size 14", 14, window);
//            SimpleCompositor button14Comp = new SimpleCompositor(window);
//            Button button14 = GUIFactory.getInstance().createButton(button14Comp, button14Row, button14Comm);
//            buttonRow.insertAtPosition(button14, 0);
//
//            SimpleCompositor buttonPlusRowComp = new SimpleCompositor(window);
//            Row buttonPlusRow = new Row(buttonPlusRowComp);
//            Character Plus = new Character('+');
//            buttonPlusRow.insertAtPosition(Plus, 0);
//
//            Command buttonPlusComm = new IncrementFontSize("Bigger Font Size",window);
//            SimpleCompositor buttonPlusComp = new SimpleCompositor(window);
//            Button buttonPlus = GUIFactory.getInstance().createButton(buttonPlusComp, buttonPlusRow, buttonPlusComm);
//            buttonRow.insertAtPosition(buttonPlus, 0);
//
//            SimpleCompositor buttonMinusRowComp = new SimpleCompositor(window);
//            Row buttonMinusRow = new Row(buttonMinusRowComp);
//            Character Minus = new Character('-');
//            buttonMinusRow.insertAtPosition(Minus, 0);
//
//            Command buttonMinusComm = new DecrementFontSize("Smaller Font Size",window);
//            SimpleCompositor buttonMinusComp = new SimpleCompositor(window);
//            Button buttonMinus = GUIFactory.getInstance().createButton(buttonMinusComp, buttonMinusRow, buttonMinusComm);
//            buttonRow.insertAtPosition(buttonMinus, 0);
//
//
////            ////Random Stuff
////            SimpleCompositor x = new SimpleCompositor(window);
////            SimpleCompositor x1 = new SimpleCompositor(window);
////            SimpleCompositor x3 = new SimpleCompositor(window);
////            SimpleCompositor labComp = new SimpleCompositor(window);
////            SimpleCompositor butComp = new SimpleCompositor(window);
////            SimpleCompositor bordComp = new SimpleCompositor(window);
////            SimpleCompositor scbarcomp = new SimpleCompositor(window);
////            Character a = new Character('a');
////            Character b = new Character('b');
////            Character c = new Character('c');
////            Character d = new Character('d');
////            Character e = new Character('e');
////            Rectangle rect = new Rectangle(10,10);
////            Character on = new Character('1');
////            Rectangle rect2 = new Rectangle(10,15);
////            Character two = new Character('2');
////
////            Row subRoot2 = new Row(x1);
////            Row subRoot = new Row(x);
////            Column subRoot2_1 = new Column(x3);
////            Command x32 = new SetFontSize("ba", 10);
////            Label label = GUIFactory.getInstance().createLabel(labComp, subRoot2);
////            Button buttonba = GUIFactory.getInstance().createButton(butComp, subRoot, x32);
////            Scroller scbar = new Scroller(scbarcomp, subRoot2_1);
////            Border bord = new Border(bordComp, scbar, 5);
////
////            root.insertAtPosition(buttonba, 0);
////            root.insertAtPosition(c, 0);
////            subRoot.insertAtPosition(a, 0);
////            subRoot.insertAtPosition(b, 0);
////            subRoot2.insertAtPosition(bord, 0);
////            subRoot2_1.insertAtPosition(on, 0);
////            subRoot2_1.insertAtPosition(rect2,0);
////            subRoot2_1.insertAtPosition(two, 0);
////            subRoot2.insertAtPosition(d, 0);
////            subRoot2.insertAtPosition(rect, 0);
////            subRoot2.insertAtPosition(e, 0);
////            root.insertAtPosition(label, 0);
//
//
//        }
//        catch(OperationNotSupportedException e) {
//            System.out.println("bad.");
//        }
//        window.setContents();
//    }

}
