package window;

import command.*;
import glyph.Glyph;

import javax.naming.OperationNotSupportedException;
import java.awt.*;

// Bridge(151): Abstraction

public abstract class Window {

    protected WindowImp windowImp;
    protected Glyph root = null;

    protected KeyMap keyMap = new KeyMap();

    public void drawCharacter(char c, int x, int y) {
        windowImp.drawCharacter(c, x, y);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        windowImp.drawRectangle(x, y, width, height);
    }

    public int charWidth(char c) {
        return windowImp.charWidth(c);
    }

    public int charHeight(char c) {
        return windowImp.charHeight(c);
    }


    public void setContents(Glyph root) {
        this.root = root;
        windowImp.setContents(root);
    }

    public void addBorder(int x1, int y1, int x2, int y2, int width) {
        windowImp.addBorder(x1, y1, x2, y2, width);
    }
    public void addScrollBar(int x, int y, int width, int height) {
        windowImp.addScrollBar(x, y, width, height);
    }

    public void drawButton(int x, int y, int width, int height, String color) {
        windowImp.drawButton(x, y, width, height, color);
    }
    public void drawLabel(int x, int y, int width, int height, String color) {
        windowImp.drawLabel(x, y, width, height, color);
    }

    public void draw() {
        if (root != null) {
            root.draw(this);
        }
    }

    public void click(int x, int y){
        Point point = new Point(x,y);
        root.onClick(point);

    }

    public void key(char c){
        System.out.println("you pressed " +c);
        Command command = keyMap.get(c);
        if(command != null){
//            System.out.println(command.getShortcut());
            Command copy = command.cloneCommand();
            copy.execute();
            //if executed command is undoable only then put it into command history
            if(copy.isUndoable()){
                CommandHistory.getInstance().add(copy);
            }
            root.compose();
            windowImp.repaint();
        }
    }


    public void setFontSize(int size) {
        windowImp.setFontSize(size);
    }

    public int getFontSize() {
        return windowImp.getFontSize();
    }

    public void repaint(){
        root.compose();
        windowImp.repaint();
    }

    public Glyph getRoot(){
        return this.root;
    }

}