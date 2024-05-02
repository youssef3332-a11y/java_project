public class Client {
    private static int reference;

    public void setReference(int reference) {
        Client.reference = reference;
    }

    public int getReference() {
        return reference;
    }
    public Client(){
        reference++;
    }
}
