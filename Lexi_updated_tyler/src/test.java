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
//
//
////        Label label1 = GUIFactory.getInstance().createLabel(new SimpleCompositor(window));
//
//        Glyph rect1 = new Rectangle(20,10);
//        row2.insert(a,0);
//        row2.insert(rect1,1);
//        column1.insert(c,0);
//        row1.insert(f,0);
//        row1.insert(g,1);
////        label1.insert(row1);
////        column1.insert(label1,1);
//        column1.insert(h,2);
//        row2.insert(column1,2);
//        row2.insert(d,3);
//        Scroller scroller = new Scroller(row2, new SimpleCompositor(window));
//        Border border1 = new Border(scroller, new SimpleCompositor(window),2);
//
//        window.setContents(border1);
//    }

//    public static void test5() throws OperationNotSupportedException {
//        Window window = new ApplicationWindow("Lexi");
//        Column column = new Column(new SimpleCompositor(window));
//        Column column2 = new Column(new SimpleCompositor(window));
//        // Root Row
//        Row row = new Row(new SimpleCompositor(window));
//
//        Character x = new Character('X');
//        Character y = new Character('Y');
//        Character z = new Character('Z');
//        Character a = new Character('A');
//        Character b = new Character('B');
//
//        Character one = new Character('1');
//        Character two = new Character('2');
//
//        Character space = new Character(' ');
//
//        Glyph rect1 = new Rectangle(20,10);
//        Glyph rect2 = new Rectangle(5,5);
//        Glyph rect3 = new Rectangle(5,25);
//
//        try{
//            column.insert(x, 0);
//            column.insert(y, 1);
//            column.insert(space, 2);
//            column.insert(rect2, 3);
//
//            column2.insert(a, 0);
//            column2.insert(b, 1);
//            column2.insert(rect2, 2);
//
//
//            row.insert(column, 0);
//            row.insert(rect1, 1);
//            row.insert(column2, 2);
//
//            Row buttonRowComp = new Row(new SimpleCompositor(window));
//
//
//            Row buttonPlusRow = new Row(new SimpleCompositor(window));
//            Character Plus = new Character('+');
//            buttonPlusRow.insert(Plus, 0);
//
//            Command buttonPlusComm = new IncrementFontSize("Bigger Font Size");
//            Button buttonPlus = GUIFactory.getInstance().createButton(new SimpleCompositor(window), buttonPlusRow, buttonPlusComm);
//            buttonRowComp.insert(buttonPlus, 0);
//
//            buttonRowComp.insert(space, 0);
//            buttonRowComp.insert(space, 1);
//            buttonRowComp.insert(space, 2);
//            buttonRowComp.insert(space, 3);
//            buttonRowComp.insert(one,4);
//            buttonRowComp.insert(two,5);
//            buttonRowComp.insert(rect3, 6);
//            buttonRowComp.insert(x, 7);
//            buttonRowComp.insert(y, 8);
//            buttonRowComp.insert(z, 9);
//
//
//            Command command = new SetFontSize("Font size 80", 80);
//
//
//            Button button1 = GUIFactory.getInstance().createButton(new SimpleCompositor(window),buttonRowComp,command);
//
//            row.insert(button1, 3);
//
//            window.setContents(row);
//        }
//        catch (OperationNotSupportedException e){
//            System.out.println(e);
//        }
//    }
//
//
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
//            root.insert(buttonRow, 0);
//
//            SimpleCompositor button20RowComp = new SimpleCompositor(window);
//            Row button20Row = new Row(button20RowComp);
//            Character twenty2 = new Character('2');
//            Character twenty0 = new Character('0');
//            button20Row.insert(twenty2, 0);
//            button20Row.insert(twenty0, 1);
//
//            Command button20Comm = new SetFontSize("Font size 20", 20);
//            SimpleCompositor button20Comp = new SimpleCompositor(window);
//            Button button20 = GUIFactory.getInstance().createButton(button20Comp, button20Row, button20Comm);
//            buttonRow.insert(button20, 0);
//
//
//            SimpleCompositor button14RowComp = new SimpleCompositor(window);
//            Row button14Row = new Row(button14RowComp);
//            Character fourteen1 = new Character('1');
//            Character fourteen4 = new Character('4');
//            button14Row.insert(fourteen1, 0);
//            button14Row.insert(fourteen4, 1);
//
//            Command button14Comm = new SetFontSize("Font size 14", 14);
//            SimpleCompositor button14Comp = new SimpleCompositor(window);
//            Button button14 = GUIFactory.getInstance().createButton(button14Comp, button14Row, button14Comm);
//            buttonRow.insert(button14, 0);
//
//            SimpleCompositor buttonPlusRowComp = new SimpleCompositor(window);
//            Row buttonPlusRow = new Row(buttonPlusRowComp);
//            Character Plus = new Character('+');
//            buttonPlusRow.insert(Plus, 0);
//
//            Command buttonPlusComm = new IncrementFontSize("Bigger Font Size");
//            SimpleCompositor buttonPlusComp = new SimpleCompositor(window);
//            Button buttonPlus = GUIFactory.getInstance().createButton(buttonPlusComp, buttonPlusRow, buttonPlusComm);
//            buttonRow.insert(buttonPlus, 0);
//
//            SimpleCompositor buttonMinusRowComp = new SimpleCompositor(window);
//            Row buttonMinusRow = new Row(buttonMinusRowComp);
//            Character Minus = new Character('-');
//            buttonMinusRow.insert(Minus, 0);
//
//            Command buttonMinusComm = new DecrementFontSize("Smaller Font Size");
//            SimpleCompositor buttonMinusComp = new SimpleCompositor(window);
//            Button buttonMinus = GUIFactory.getInstance().createButton(buttonMinusComp, buttonMinusRow, buttonMinusComm);
//            buttonRow.insert(buttonMinus, 0);


//            ////Random Stuff
//            SimpleCompositor x = new SimpleCompositor(window);
//            SimpleCompositor x1 = new SimpleCompositor(window);
//            SimpleCompositor x3 = new SimpleCompositor(window);
//            SimpleCompositor labComp = new SimpleCompositor(window);
//            SimpleCompositor butComp = new SimpleCompositor(window);
//            SimpleCompositor bordComp = new SimpleCompositor(window);
//            SimpleCompositor scbarcomp = new SimpleCompositor(window);
//            Character a = new Character('a');
//            Character b = new Character('b');
//            Character c = new Character('c');
//            Character d = new Character('d');
//            Character e = new Character('e');
//            Rectangle rect = new Rectangle(10,10);
//            Character on = new Character('1');
//            Rectangle rect2 = new Rectangle(10,15);
//            Character two = new Character('2');
//
//            Row subRoot2 = new Row(x1);
//            Row subRoot = new Row(x);
//            Column subRoot2_1 = new Column(x3);
//            Command x32 = new SetFontSize("ba", 10);
//            Label label = GUIFactory.getInstance().createLabel(labComp, subRoot2);
//            Button buttonba = GUIFactory.getInstance().createButton(butComp, subRoot, x32);
//            Scroller scbar = new Scroller(scbarcomp, subRoot2_1);
//            Border bord = new Border(bordComp, scbar, 5);
//
//            root.insert(buttonba, 0);
//            root.insert(c, 0);
//            subRoot.insert(a, 0);
//            subRoot.insert(b, 0);
//            subRoot2.insert(bord, 0);
//            subRoot2_1.insert(on, 0);
//            subRoot2_1.insert(rect2,0);
//            subRoot2_1.insert(two, 0);
//            subRoot2.insert(d, 0);
//            subRoot2.insert(rect, 0);
//            subRoot2.insert(e, 0);
//            root.insert(label, 0);

//
//        }
//        catch(OperationNotSupportedException e) {
//            System.out.println("bad.");
//        }
//        window.setContents(root);
//    }

    public static void testTemp() throws OperationNotSupportedException {
        Window window = new ApplicationWindow("Lexi");

        Compositor compositor = new SimpleCompositor(window);
        compositor.setWindow(window);

        Column root = new Column(compositor);

        Row row0 = new Row(compositor);


        window.setContents(root);

    }

}
