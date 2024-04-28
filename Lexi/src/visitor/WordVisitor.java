package visitor;

import glyph.*;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Arrays;

public class WordVisitor implements GlyphVisitor{
    private StringBuilder wordBuilder = new StringBuilder();
    private final ArrayList<Character> separators = new ArrayList<>(Arrays.asList(' ', '|', ',', '!', '-', '.','?', '@',' '));
    // Initialize the List with separator characters
//    separators.pus(' ');
//    separators.add('|');
//    separators.add(',');
//    separators.add('!');
//    separators.add('-');
//    separators.add('.');


    @Override
    public void visit(glyph.Glyph e) {

    }

    @Override
    public void visit(glyph.Character e) {
        // Assume that non-alphanumeric characters indicate word boundaries
        char currentChar = e.getChar();

        if (!this.separators.contains(currentChar)) {
            wordBuilder.append(currentChar);
        }
        else {
            wordBuilder.append(' ');
        }

    }

    @Override
    public void visit(Rectangle e) {

    }

    @Override
    public void visit(Row e) {

    }

    @Override
    public void visit(Column e) {

    }

    public String getString(){
        return this.wordBuilder.toString();
    }
}
