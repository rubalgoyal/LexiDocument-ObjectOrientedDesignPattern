    package lexiwidget;
    import java.awt.Point;

    import command.Command;
    import glyph.Glyph;
    import glyph.Compositor;
    import java.util.ArrayList;
    import window.Window;

    public class RedButton extends Button {

        protected RedButton(Glyph content, Compositor compositor,  Command command){
            super(content,compositor, command);
        }
        @Override
        public int getXstart(){
            return this.getXposition() + 4;
        }

        public int getYstart(){
            return this.getYposition() + 4;
        }

        @Override
        public void draw(Window window) {
                window.drawButton
                        (this.getXposition(), this.getYposition(),this.getWidth(),this.getHeight(),"red");
                super.draw(window);

        }

        @Override
        public void setSize(Window window) {
            int width = 0;
            int height = 0;
            this.setBounds(width + (2 * 4), height +(2*4));
        }
    }
