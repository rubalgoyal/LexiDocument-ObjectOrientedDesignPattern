package command;
import window.Window;

public class Undo extends Command {

    public Undo(String shortcut){
        super(shortcut);
        undoable = false;
    }
    @Override
    public void execute(Window window) {
        Command undone = CommandHistory.getInstance().undo();
        if(undone != null)
            undone.unexecute(window);
    }

    @Override
    public void unexecute(Window window) {
        //Do nothing
    }

    @Override
    public Command cloneCommand() {
        return new Undo(shortcut);
    }
}
