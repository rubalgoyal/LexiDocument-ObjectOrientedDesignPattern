package lexiwidget;

import glyph.Embellishment;
import window.Window;
import command.Command;
import glyph.*;
import java.awt.Point;

public abstract class Button extends Embellishment {
    Command command = null;

    public Button(Glyph content,Compositor compositor, Command command) {
        super(content, compositor);
        this.command = command;
    }
//    public abstract void draw(Window window);
//    public abstract void setSize(Window window);

//    public Glyph Press(){
//        return this;
//    }

    public void onClick(int x, int y){
        if(intersect(x,y)){
            command.execute();
        }
        super.onClick(x,y);
    }
    public Command getCommand(){
        return command;
    }

}
