package lexiwidget;
import command.Command;
import glyph.Compositor;
import glyph.Glyph;

public class GreenFactory extends GUIFactory {


    public GreenFactory(){

    }

    public static GreenFactory getInstance(){

        return new GreenFactory();
        }

    @Override
    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new GreenLabel(compositor,content);
    }

    @Override
    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new GreenButton(compositor,content,command);
    }
}
