public class Fournisseur {
    private int reference;
    private static int count;

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }
    public Fournisseur(){
        count++;
        reference = count;
    }

    @Override
    public String toString() {
        return "Reference #" + reference;
    }
}


}
