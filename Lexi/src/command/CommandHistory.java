// Prototype(117): Client

package command;

import java.util.ArrayList;

public class CommandHistory {

    private static CommandHistory single = null;
    private static ArrayList<Command> history;
    private static int nextIndex = 0;

    private CommandHistory(){
        history = new ArrayList<Command>();
    }

    public static CommandHistory getInstance(){
        if(single == null){
            single = new CommandHistory();
            history = new ArrayList<>();
            nextIndex = 0;
        }

        return single;
    }

    public void add(Command command){
        if(command.isUndoable()){
            while(history.size() > nextIndex + 1){
                history.removeLast();
            }
            history.add(command);
            nextIndex = history.size() -1;
        }
//        if(nextIndex < history.size()){
//            ArrayList<Command> truncate = new ArrayList<Command>();
//            int endPoint = nextIndex -1;
//            for (int i = 0;  i < endPoint; i++){
//                truncate.add(history.get(i));
//            }
//            history.clear();
//            history = truncate;
//        }
//        history.add(command);
//        nextIndex++;
//        System.out.println("added" + command.shortcut + "at index " + (nextIndex-1));
//        System.out.println(nextIndex-1);
    }

    public static void undo(){
        if(nextIndex < 0){
            System.out.println("No further undo");
            return;
        }
        if(history.size() > nextIndex){
            history.get(nextIndex).unexecute();
            nextIndex--;
        }
//        if(nextIndex > 0){
//            Command undo = history.get(nextIndex-1);
//            nextIndex--;
//            return undo;
//        }
//        return null;
    }
    public static void redo(){
        nextIndex++;
        if(nextIndex == history.size()){
            nextIndex--;
            System.out.println("No further Redo");
            return;
        }
        history.get(nextIndex).execute();
    }
}
