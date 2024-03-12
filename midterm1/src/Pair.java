public class Pair implements List {
    private List first;
    private List rest;

    public Pair(List first, List rest) {
        this.first = first;
        this.rest = rest;
    }

    @Override
    public List car() {
        return first;
    }

    @Override
    public List cdr() {
        return rest;
    }

    @Override
    public boolean nil() {
        return false;
    }

    @Override
    public boolean pair() {
        return true;
    }

    public String toString() {
//        if (rest.nil()) {
//            return first.toString();
//        }
//        return first.toString() + " " + rest.toString();
//    }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(first.toString());

        List currentRest = rest;
        while (!currentRest.nil()) {
            sb.append(" ");
            sb.append(currentRest.car().toString());
            currentRest = currentRest.cdr();
        }

        sb.append(")");
        return sb.toString();
    }

}


