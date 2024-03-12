 class NilAtom implements List{
    @Override
    public List car() {
        return null;
    }

    @Override
    public List cdr() {
        return null;
    }

    @Override
    public boolean nil() {
        return true;
    }

    @Override
    public boolean pair() {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
