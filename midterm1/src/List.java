public interface List {
    List car();
    List cdr();
    boolean nil();
    boolean pair();

    String toString();
}
