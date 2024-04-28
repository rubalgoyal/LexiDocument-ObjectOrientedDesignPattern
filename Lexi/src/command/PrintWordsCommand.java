// Prototype(117): Prototype
// Command(223): Command
// Concrete Implementation

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
            } else if (currentGlyph instanceof glyph.Row || currentGlyph instanceof glyph.Column) {
                visitAllChildren(currentGlyph,wordVisitor);

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
        return new PrintWordsCommand(this.window);
    }

    @Override
    public boolean isUndoable() {
        return false;
    }

    private void visitAllChildren(Glyph glyph, WordVisitor wordVisitor) {
        if (glyph instanceof glyph.Character) {
            ((glyph.Character) glyph).accept(wordVisitor);
            return;
        }
        // Recursively visit children
        else if(glyph instanceof glyph.Row || glyph instanceof glyph.Column){
            Iterator<Glyph> iterator = glyph.createIterator();
            while (!iterator.isDone()) {
                visitAllChildren(iterator.next(), wordVisitor);
            }
        }


    }
}
