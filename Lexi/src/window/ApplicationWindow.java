package window;
import glyph.Glyph;

public class ApplicationWindow extends Window {
    public ApplicationWindow(String title){
        windowImp = WindowFactory.getInstance().createWindowImp(title, this);
    }
//    public void setContents(Glyph glyph){
//        this.root = glyph;
//        this.windowImp.setContents();
//
//    }
}
