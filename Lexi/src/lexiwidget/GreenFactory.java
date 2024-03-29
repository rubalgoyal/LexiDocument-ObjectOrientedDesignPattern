package lexiwidget;
import glyph.Compositor;

public class GreenFactory extends GUIFactory {


    public GreenFactory(){
        //TODO
    }

    public static GreenFactory getInstance(){

        return new GreenFactory();
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
