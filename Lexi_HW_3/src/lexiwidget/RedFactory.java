package lexiwidget;
import glyph.Compositor;
public class RedFactory extends GUIFactory {


    private RedFactory(){

    }

    public static RedFactory getInstance(){
        return new RedFactory();
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


