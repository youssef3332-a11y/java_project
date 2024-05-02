public class Produit {
    String libelle;
    private double prix_TTC;
    private int quantiteStock;


    public void setPrix(double prix){
        this.prix_TTC=prix;
    }
    public double getPrix(){
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

}
