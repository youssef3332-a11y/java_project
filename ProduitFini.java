public class ProduitFini extends Produit{
    private int reference;

    public void setReference(int reference) {
        this.reference = reference;
    }
    public int getReference() {
        return reference;
    }

    public ProduitFini(String nom, double prix, int quantite){
        super(nom,prix,quantite);
        reference++;
    }

    @Override
    public String toString(){
        return super.toString() + ", Reference: " + reference;
    }
}
