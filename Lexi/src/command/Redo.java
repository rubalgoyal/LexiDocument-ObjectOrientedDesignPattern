package command;
import window.Window;

public class Redo extends Command {


    @Override
    public void execute() {
        CommandHistory.redo();
    }

    @Override
    public void unexecute() {
        //Do nothing
    }

    @Override
    public Command cloneCommand() {
        return new Redo();
    }

    @Override
    public boolean isUndoable(){
        return false;
    }
}
