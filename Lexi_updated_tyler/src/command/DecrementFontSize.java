package command;

import window.Window;

public class DecrementFontSize extends Command {

    protected Window window;

    public DecrementFontSize(Window window){
        this.window = window;
    }

    @Override
    public void execute() {

    }

    public void prevExecute (){
    }

    @Override
    public Command unExecute() {
        return null;
    }

//    public void unexecute(Window window){
//        window.setFontSize(window.getFontSize()+1);
//        System.out.println("font size = " + window.getFontSize());
//    }
//    public Command cloneCommand(){
//        return new DecrementFontSize(shortcut);
//    }

}
