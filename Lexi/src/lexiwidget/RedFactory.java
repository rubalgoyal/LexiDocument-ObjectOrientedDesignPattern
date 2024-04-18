package lexiwidget;
import command.Command;
import glyph.Compositor;
import glyph.Glyph;

public class RedFactory extends GUIFactory {


    private RedFactory(){

    }

    public static RedFactory getInstance(){
        return new RedFactory();
    }


    @Override
    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new RedLabel(compositor);
    }

    @Override
    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new RedButton(compositor,content,command);
    }



}


