package command;
import window.Window;

public abstract class Command {

    protected Window window;

    protected Command(){}
    public boolean isUndoable(){
        return true;
    }

    public abstract void execute();
    public abstract void prevExecute();

    public abstract Command unExecute();





}
