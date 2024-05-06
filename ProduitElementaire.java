public class ProduitElementaire extends Produit{
    private String categorie;

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public String getCategorie() {
        return categorie;
    }

    public ProduitElementaire(String nom,double prix,int quantite,String categorie){
        super(nom,prix,quantite);
        this.categorie=categorie;
    }

    @Override
    public String toString() {
        return super.toString()+", Categorie: " + categorie;
    }
}
