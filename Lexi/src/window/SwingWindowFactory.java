package window;

public class SwingWindowFactory extends WindowFactory {
    private SwingWindowFactory(){}
    public static SwingWindowFactory getInstance(){
        return new SwingWindowFactory();
    }
    protected WindowImp createWindowImpFactoryMethod(String title, Window window){
        return new SwingWindow(title,window);
    }
}
