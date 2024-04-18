package command;

import java.util.ArrayList;

public class CommandHistory {

    private static CommandHistory single = null;
    protected ArrayList<Command> history;
    private int nextIndex = 0;

    private CommandHistory(){
        history = new ArrayList<Command>();
    }

    public static CommandHistory getInstance(){
        if(single == null)
            single = new CommandHistory();
        return single;
    }

    public void add(Command command){
        if(nextIndex < history.size()){
            ArrayList<Command> truncate = new ArrayList<Command>();
            int endPoint = nextIndex -1;
            for (int i = 0;  i < endPoint; i++){
                truncate.add(history.get(i));
            }
            history.clear();
            history = truncate;
        }
        history.add(command);
        nextIndex++;
        System.out.println("added" + command.shortcut + "at index " + (nextIndex-1));
        System.out.println(nextIndex-1);
    }

    public Command undo(){
        if(nextIndex > 0){
            Command undo = history.get(nextIndex-1);
            nextIndex--;
            return undo;
        }
        return null;
    }
    public Command redo(){
        if(nextIndex < history.size()){
            Command redone = history.get(nextIndex);
            nextIndex++;
            return  redone;
        }
        return null;
    }
}
