public class Client {
    private static int reference;

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }
    public Client(){
        reference++;
    }
}
