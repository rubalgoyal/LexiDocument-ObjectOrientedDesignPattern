package window;
import command.*;
import glyph.Glyph;

public class ApplicationWindow extends Window {
    public ApplicationWindow(String title){
        windowImp = WindowFactory.getInstance().createWindowImp(title, this);
        setShortcuts();
    }
//    public void setContents(Glyph glyph){
//        this.root = glyph;
//        this.windowImp.setContents();
//
//    }

    private void setShortcuts(){
        this.keyMap.put('i',new IncrementFontSize(this));
        this.keyMap.put('d',new DecrementFontSize(this));
        this.keyMap.put('u',new Undo());
        this.keyMap.put('r',new Redo());
        this.keyMap.put('w', new PrintWordsCommand(this));
    }
}
