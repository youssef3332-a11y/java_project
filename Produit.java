public class Produit {
    private String libelle;
    private double prix_TTC;
    private int quantiteStock;

    public void setLibelle(String libelle) {this.libelle = libelle;}
    public String getLibelle() {return libelle;}

    public void setPrix_TTC(double prix){
        this.prix_TTC=prix;
    }
    public double getPrix_TTC(){
        return prix_TTC;
    }

    public void setQuantite(int quantite){
        this.quantiteStock=quantite;
    }
    public double getQuantite(Produit product){
        return quantiteStock;
    }

    public Produit(String nom, double prix, int quantite){
        this.libelle=nom;
        this.prix_TTC=prix;
        this.quantiteStock=quantite;
    }

    @Override
    public String toString(){
        return "le nom: " + libelle + ", prix_TTC: " + prix_TTC + ", quantite en stock: " + quantiteStock;
    }
}
