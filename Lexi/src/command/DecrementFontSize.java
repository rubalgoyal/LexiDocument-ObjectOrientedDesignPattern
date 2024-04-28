// Prototype(117): Prototype
// Command(223): Command
// Concrete Implementation

package command;

import window.Window;

public class DecrementFontSize extends Command {
    Window window;

    public DecrementFontSize(Window window){
//        super(shortcut);
        this.window = window;
//        undoable = true;
    }
    @Override
    public void execute (){
        int currentSize = this.window.getFontSize();
        if(currentSize < 1)
            System.out.println("Minimum size limit reached ");
        else{
            this.window.setFontSize(currentSize - 1);
            this.window.repaint();
        }

//        window.setFontSize(window.getFontSize()-1);
//        System.out.printf("font size = " + window.getFontSize());

    }
    @Override
    public void unexecute(){
        int currentSize = this.window.getFontSize();
        this.window.setFontSize(currentSize + 1);
        this.window.repaint();
//        window.setFontSize(window.getFontSize()+1);
//        System.out.println("font size = " + window.getFontSize());
    }
    public Command cloneCommand(){
        return new DecrementFontSize(this.window);
    }
    @Override
    public boolean isUndoable(){
        return true;
    }

}
