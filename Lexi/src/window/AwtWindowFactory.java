package window;

public class AwtWindowFactory extends WindowFactory {
    private AwtWindowFactory(){}
    public static AwtWindowFactory getInstance(){
        return new AwtWindowFactory();
    }
    protected WindowImp createWindowImpFactoryMethod(String title, Window window){
        return new AwtWindow(title, window);
    }
}
