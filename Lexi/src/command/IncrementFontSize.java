package command;

import window.Window;

public class IncrementFontSize extends Command {
    public IncrementFontSize(String shortcut){
        super(shortcut);
        undoable = true;

    }
    public void execute(Window window){
        window.setFontSize(window.getFontSize()+1);
        CommandHistory commandHistory = CommandHistory.getInstance();
        if(commandHistory == null)
            System.out.println("history empty");
        System.out.println("font size = " +window.getFontSize());
    }

    public void unexecute(Window window){
        window.setFontSize(window.getFontSize()-1);
        System.out.println("font size = " +window.getFontSize());
    }
    public Command cloneCommand(){
        return new IncrementFontSize(shortcut);
    }
}
