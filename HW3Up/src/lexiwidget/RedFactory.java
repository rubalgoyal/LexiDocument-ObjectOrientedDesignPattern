package lexiwidget;
import glyph.Compositor;
public class RedFactory extends GUIFactory {
    // added as per chatgpt suggestion
    private static RedFactory instance = null;

    private RedFactory(){
        //TO DO
    }

    public static RedFactory getInstance(){
        if (instance == null) {
            instance = new RedFactory();
        }
        return instance;
        //return new RedFactory();
    }


    @Override
    protected Label labelFactoryMethod(Compositor compositor) {
        return new RedLabel(compositor);
    }

    @Override
    protected Button buttonFactoryMethod(Compositor compositor) {
        return new RedButton(compositor);
    }



}


