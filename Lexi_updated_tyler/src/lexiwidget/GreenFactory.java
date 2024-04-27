package lexiwidget;
import command.Command;
import glyph.Compositor;
import glyph.Glyph;

public class GreenFactory extends GUIFactory {

    private static GreenFactory subGreenFactory = null;


    public GreenFactory(){

    }

    public static GreenFactory getInstance(){
        if(subGreenFactory == null){
            subGreenFactory = new GreenFactory();
        }
        return  subGreenFactory;
        }

    @Override
    protected Label labelFactoryMethod(Glyph content,Compositor compositor ) {
        return new GreenLabel(content, compositor);
    }

    @Override
    protected Button buttonFactoryMethod(Glyph content, Compositor compositor,  Command command) {
        return new GreenButton(content, compositor, command);
    }
}
