 class StrAtom implements Atom{
     private String value;

     public StrAtom(String value) {
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
         return "\"" + value + "\"";
     }

}
