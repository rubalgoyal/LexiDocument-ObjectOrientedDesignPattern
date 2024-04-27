package lexiwidget;
import glyph.Compositor;
import glyph.Glyph;
import command.Command;


public abstract class GUIFactory {

    protected abstract Label labelFactoryMethod(Glyph content, Compositor compositor );
    protected abstract Button buttonFactoryMethod(Glyph content, Compositor compositor,  Command command);
//    private static GUIFactory single = null;

//    public static GUIFactory getInstance(){
//        if(single == null){
////            String string = System.getenv("LexiWidget");
//            String string = "Green";
//            if(string != null && string.equals("Red")){
//                single = RedFactory.getInstance();
//            }
//            else if(string != null && string.equals("Green")){
//                single = GreenFactory.getInstance();
//            }
//        }
//        return single;
//    }
    public final Button createButton( Glyph content, Compositor compositor, Command command){
        return buttonFactoryMethod( content, compositor, command);
    }
    public final Label createLabel(Glyph content, Compositor compositor ){
        return labelFactoryMethod(content , compositor);
    }
}
