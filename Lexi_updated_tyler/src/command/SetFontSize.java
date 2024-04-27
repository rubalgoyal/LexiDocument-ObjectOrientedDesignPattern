package command;
import window.Window;

public class SetFontSize extends Command{
    @Override
    public void execute() {

    }

    @Override
    public void prevExecute() {

    }

    @Override
    public Command unExecute() {
        return null;
    }
//    private int previousSize;
//    private int size;
//
//    public SetFontSize(String shortcut, int size){
//        super(shortcut);
//        this.size = size;
//        undoable = true;
//        previousSize = 8;
//    }
//    @Override
//    public void execute(Window window) {
//        this.size = size++;
//    }
//
//    @Override
//    public void unexecute(Window window) {
//        size = previousSize;
//    }
//
//    @Override
//    public Command cloneCommand() {
//        SetFontSize setFontSize =  new SetFontSize(shortcut,size);
//        return setFontSize;
//    }
}
