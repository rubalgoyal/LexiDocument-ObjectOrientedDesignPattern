package command;

import window.Window;

public class IncrementFontSize extends Command {
    protected Window window;

    public IncrementFontSize(Window window){
        this.window = window;
    }

    @Override
    public void execute(){
        window.pushCommand(this);
        prevExecute();
    }

    @Override
    public void prevExecute(){

    }

    @Override
    public Command unExecute() {
        return null;
    }

}
