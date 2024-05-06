public class Client {
    private static int reference;
    private static int count;

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }
    public Client(){
        count++;
        reference = count;
    }

    @Override
    public String toString() {
        return "Reference #" + reference;
    }
}
