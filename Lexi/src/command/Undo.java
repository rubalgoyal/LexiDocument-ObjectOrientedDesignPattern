package command;
import window.Window;

public class Undo extends Command {

    @Override
    public void execute() {
           CommandHistory.undo();
    }

    @Override
    public void unexecute() {
        //Do nothing
    }

    @Override
    public Command cloneCommand() {
        return null;
    }
    @Override
    public boolean isUndoable(){
        return false;
    }
}
