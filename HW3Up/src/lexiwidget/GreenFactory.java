package lexiwidget;
import glyph.Compositor;

public class GreenFactory extends GUIFactory {
    // chatgpt
    private static GreenFactory instance = null;
    public GreenFactory(){
        //TODO
    }

    public static GreenFactory getInstance(){
        if (instance == null) {
            instance = new GreenFactory();
        }
        return instance;
        //return new GreenFactory();
        }

    @Override
    protected Label labelFactoryMethod(Compositor compositor) {
        return new GreenLabel(compositor);
    }

    @Override
    protected Button buttonFactoryMethod(Compositor compositor) {
        return new GreenButton(compositor);
    }
}
