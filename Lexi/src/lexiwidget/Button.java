package lexiwidget;

import glyph.Embellishment;
import window.Window;
import command.Command;
import glyph.*;
import java.awt.Point;

public abstract class Button extends Embellishment {
    //Command command = null;

    public Button(Glyph content, Command command) {
        super(content);
        this.command = command;
    }
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

    public Glyph Press(){
        return this;
    }

    @Override
    public void onClick(Point point){
        if(intersect(point)){
            System.out.println("onlclick");
            command.execute();
        }
        super.onClick(point);
    }
    public Command getCommand(){
        return command;
    }

}
