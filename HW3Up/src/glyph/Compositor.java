package glyph;

/*
This is an interface to implement Strategy Design Pattern for Formatting the lexi document.
 */
public interface Compositor {
    void compose();
    void setComposition(Composition composition);
}
