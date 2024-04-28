// Prototype(117): Prototype
// Command(223): Command
// Concrete Implementation

package command;


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
        return new Undo();
    }
    @Override
    public boolean isUndoable(){
        return false;
    }
}
