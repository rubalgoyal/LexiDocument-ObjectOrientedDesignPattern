// Prototype(117): Prototype
// Command(223): Command
// Concrete Implementation

package command;

import window.Window;

public class IncrementFontSize extends Command {
    Window window;

    public IncrementFontSize(Window window){
//        super(shortcut);
        this.window = window;
//        undoable = true;

    }
    @Override
    public void execute(){
        this.window.setFontSize(this.window.getFontSize() +1);
        this.window.repaint();
//        window.setFontSize(window.getFontSize()+1);
//        CommandHistory commandHistory = CommandHistory.getInstance();
//        if(commandHistory == null)
//            System.out.println("history empty");
//        System.out.println("font size = " +window.getFontSize());
    }
    @Override
    public void unexecute(){
        int currentSize = this.window.getFontSize();
        if(currentSize < 1){
            System.out.println("Minimum size limit reached");
        }
        else{
            this.window.setFontSize(currentSize - 1);
            this.window.repaint();

        }
//        window.setFontSize(window.getFontSize()-1);
//        System.out.println("font size = " +window.getFontSize());
    }
    public Command cloneCommand(){
        return new IncrementFontSize(this.window);
    }

    @Override
    public boolean isUndoable(){
        return true;
    }
}
