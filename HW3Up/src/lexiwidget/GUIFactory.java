package lexiwidget;
import glyph.Compositor;


public abstract class GUIFactory {

    protected abstract Label labelFactoryMethod(Compositor compositor);
    protected abstract Button buttonFactoryMethod(Compositor compositor);
    private static GUIFactory single = null;

    public static GUIFactory getInstance(){
        if(single == null){
            //String string = System.getProperty("LexiWidget");
            String string = "Red";
            if(string != null && string.equals("Red")){
                single = RedFactory.getInstance();
            }
            else if(string != null && string.equals("Green")){
                single = GreenFactory.getInstance();
            }
        }
        return single;
    }

    public final Button createButton(Compositor compositor){
        return buttonFactoryMethod(compositor);
    }

    public final Label createLabel(Compositor compositor){
        return labelFactoryMethod(compositor);
    }




}
