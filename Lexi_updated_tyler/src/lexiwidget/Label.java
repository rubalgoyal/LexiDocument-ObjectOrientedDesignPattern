    package lexiwidget;

    import glyph.Compositor;
    import glyph.Embellishment;
    import glyph.Glyph;
    import window.Window;

    public abstract class Label extends Embellishment {

        protected Label(Glyph content, Compositor compositor){
            super(content, compositor);
        }


    }
