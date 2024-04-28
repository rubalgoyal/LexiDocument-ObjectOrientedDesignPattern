// Prototype(117): Prototype
// Command(223): Command
// Concrete Implementation

package command;
import window.Window;

public class SetFontSize extends Command{
    Window window;
    private int previousSize;
    private int size;

    public SetFontSize(int size, Window window){
//        super(shortcut);
        this.window = window;
        this.size = size;
//        undoable = true;
        previousSize = 8;
    }
    @Override
    public void execute() {
        previousSize = this.window.getFontSize();
        this.window.setFontSize(this.size);
        this.window.repaint();
    }

    @Override
    public void unexecute() {
       this.window.setFontSize(previousSize);
       this.previousSize = 8;
       this.window.repaint();
    }

    @Override
    public Command cloneCommand() {
        Command command =  new SetFontSize(size, window);
        return command;
    }

    @Override
    public boolean isUndoable(){
        return true;
    }
}
