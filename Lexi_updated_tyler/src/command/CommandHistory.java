package command;

import window.Window;

import java.util.ArrayList;
import java.util.Stack;

public class CommandHistory {

    private static Window window;

    private static CommandHistory commandHistory;
    private Stack<Command> pastCommands = new Stack<>();
    private Stack<Command> futureCommands = new Stack<>();

    private CommandHistory(Window w){
        window = w;
    }

    public static CommandHistory getCommandHistory(Window w){
        if(commandHistory == null)
            return new CommandHistory(w);
        if(window != w)
            return new CommandHistory(w);
        return  commandHistory;
    }

    public void undo(){
        if(!pastCommands.empty()){
            Command undoable = pastCommands.pop();
            futureCommands.push(undoable);
            undoable.unExecute().prevExecute();
        }
    }
    public void redo() {
        if (!futureCommands.empty()) {
            Command command = futureCommands.pop();
            pastCommands.push(command);
            command.prevExecute();
        }
    }

    public void pushCommand(Command command){
        if(command.isUndoable()){
            pastCommands.push(command);
            futureCommands.clear();
        }
    }
}
