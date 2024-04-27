package window;

public abstract class WindowFactory {
    private static WindowFactory single = null;
    protected abstract WindowImp createWindowImpFactoryMethod(String title, Window window);
    public static WindowFactory getInstance(){
        if(single == null){
//            String string =System.getenv("LexiWindow");
            String string = "Swing";
            if(string != null && string.equals("Swing"))
                single = SwingWindowFactory.getInstance();
            else if(string != null && string.equals("Awt"))
                single = AwtWindowFactory.getInstance();
        }
        return single;
    }
    public final WindowImp createWindowImp(String title, Window window){
        return createWindowImpFactoryMethod(title,window);

    }


}
