package command;
import window.Window;

public class Redo extends Command {

    public Redo(String shortcut){
        super(shortcut);
        undoable = false;
    }

    @Override
    public void execute(Window window) {
        Command redone = CommandHistory.getInstance().redo();
        if(redone != null)
            redone.execute(window);
    }

    @Override
    public void unexecute(Window window) {
        //Do nothing
    }

    @Override
    public Command cloneCommand() {
        return new Redo(shortcut);
    }
}
