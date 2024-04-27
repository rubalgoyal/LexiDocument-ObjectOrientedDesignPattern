package window;

public class ApplicationWindow extends Window {
    public ApplicationWindow(String title){
        super(title);
        windowImp = WindowFactory.getInstance().createWindowImp(title, this);
    }
}
