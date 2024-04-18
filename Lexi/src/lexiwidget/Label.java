    package lexiwidget;

    import glyph.Embellishment;
    import glyph.Glyph;
    import window.Window;

    public abstract class Label extends Embellishment {

        public Label(Glyph content){
            super(content);
        }

        public abstract void draw(Window window);
        public abstract void setSize(Window window);
    }
