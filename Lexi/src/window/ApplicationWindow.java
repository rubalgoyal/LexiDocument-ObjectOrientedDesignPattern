package window;

public class ApplicationWindow extends Window {
    public ApplicationWindow(String title){
        windowImp = WindowFactory.getInstance().createWindowImp(title, this);
    }
}
