public class Main {
    public static void main(String[] args) {
        List list1 = new Pair(new IntAtom(1), new Pair(new StrAtom("hi"), new Pair(new IntAtom(2), new NilAtom())));
        List list2 = new Pair(new IntAtom(1),
                new Pair(new Pair(new StrAtom("hi"),
                        new NilAtom()),
                        new Pair(new IntAtom(2),
                                new NilAtom())));
        System.out.println(list1);
        System.out.println(list2);
    }
}