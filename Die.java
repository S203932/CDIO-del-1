public class Die {
    private int face;
    private final int maxsides = 6;
    private final int minsides=1;
    private int range=maxsides-minsides+1;
    public Die()
    {
        face=0;
    }

    public int roll() {
        face = (int) (Math.random() * range) + minsides;
        return face;
    }
    public String toString()
    {
        String result = Integer.toString(face);
        return result;
    }

}
