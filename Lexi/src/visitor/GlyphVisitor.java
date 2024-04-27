package visitor;

import glyph.Glyph;
import glyph.Character;
import glyph.Row;
import glyph.Column;
import glyph.Rectangle;

public interface GlyphVisitor {

        void visit(Glyph e);
        void visit(Character e);
        void visit(Rectangle e);
        void visit(Row e);
        void visit(Column e);

}
