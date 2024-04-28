package command;

import glyph.Glyph;
import iterator.Iterator;
import visitor.WordVisitor;
import window.Window;

public class PrintWordsCommand extends Command{
    Window window;

    public PrintWordsCommand(Window window){
        this.window = window;
    }
    @Override
    public void execute() {
        Iterator<Glyph> iterator = this.window.getRoot().createIterator();
        WordVisitor wordVisitor = new WordVisitor();
        while (!iterator.isDone()) {
            Glyph currentGlyph = iterator.currentItem();
            if (currentGlyph instanceof glyph.Character) {
                ((glyph.Character) currentGlyph).accept(wordVisitor);
            }
            iterator.next();
        }
        System.out.println(wordVisitor.getString());

    }

    @Override
    public void unexecute() {

    }

    @Override
    public Command cloneCommand() {
        return null;
    }

    @Override
    public boolean isUndoable() {
        return false;
    }
}
