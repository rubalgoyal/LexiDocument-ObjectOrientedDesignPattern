package command;

import window.Window;

public class DecrementFontSize extends Command {

    public DecrementFontSize(String shortcut){
        super(shortcut);
        undoable = true;
    }

    public void execute (Window window){
        window.setFontSize(window.getFontSize()-1);
        System.out.printf("font size = " + window.getFontSize());

    }
    public void unexecute(Window window){
        window.setFontSize(window.getFontSize()+1);
        System.out.println("font size = " + window.getFontSize());
    }
    public Command cloneCommand(){
        return new DecrementFontSize(shortcut);
    }

}
