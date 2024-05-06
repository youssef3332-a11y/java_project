public class ProduitFini extends Produit{
    private static int reference;
    private static int count;
    public void setReference(int reference) {
        this.reference = reference;
    }
    public int getReference() {
        return reference;
    }

    public ProduitFini(String nom, double prix, int quantite){
        super(nom,prix,quantite);
        count++;
        this.reference = count;
    }

    @Override
    public String toString(){
        return super.toString() + ", Reference: " + reference;
    }
}
