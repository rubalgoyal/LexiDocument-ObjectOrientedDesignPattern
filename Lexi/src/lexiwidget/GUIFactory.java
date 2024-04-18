package lexiwidget;
import glyph.Compositor;
import glyph.Glyph;
import command.Command;


public abstract class GUIFactory {

    protected abstract Label labelFactoryMethod(Compositor compositor, Glyph content);
    protected abstract Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command);
    private static GUIFactory single = null;

    public static GUIFactory getInstance(){
        if(single == null){
//            String string = System.getenv("LexiWidget");
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

    public final Button createButton(Compositor compositor, Glyph content, Command command){
        return buttonFactoryMethod(compositor,content,command);
    }

    public final Label createLabel(Compositor compositor, Glyph content){
        return labelFactoryMethod(compositor,content);
    }




}
