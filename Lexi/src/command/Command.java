package command;
import window.Window;

public abstract class Command {
//    String shortcut = null;
//    protected  boolean undoable;

    public abstract void execute();// window was passed
    public abstract void unexecute(); // window was passed
    public abstract Command cloneCommand();
    public abstract boolean isUndoable();

//    public Command(String shortcut){
//        this.shortcut  = shortcut;
//        undoable = true;
//    }

//    public boolean isUndoable(){
//        return undoable;
//    }
//    public void setUndoable(boolean undoable){
//        this.undoable = undoable;
//    }

//    public String getShortcut(){
//        return shortcut;
//    }
}
