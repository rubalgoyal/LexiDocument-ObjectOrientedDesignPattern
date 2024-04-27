package lexiwidget;
import command.Command;
import glyph.Compositor;
import glyph.Glyph;

public class RedFactory extends GUIFactory {
    private static RedFactory subRedFactory = null;

    private RedFactory(){

    }

    public static RedFactory getInstance(){
        if(subRedFactory == null){
            subRedFactory = new RedFactory();
        }

        return new RedFactory();
    }


    @Override
    public Label labelFactoryMethod(Glyph content,Compositor compositor ) {
        return new RedLabel(content, compositor);
    }


    @Override
    protected Button buttonFactoryMethod(Glyph content, Compositor compositor, Command command) {
        return new RedButton(content, compositor,command);
    }



}


