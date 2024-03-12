public class IntAtom implements Atom {
    private int value;

    public IntAtom(int value) {
        this.value = value;
    }

    @Override
    public List car() {
        return this;
    }

    @Override
    public List cdr() {
        return new NilAtom();
    }

    @Override
    public boolean nil() {
        return false;
    }

    @Override
    public boolean pair() {
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
