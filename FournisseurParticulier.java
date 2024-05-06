public class FournisseurParticulier extends Fournisseur{
    private String nom;
    private String prenom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }
    public FournisseurParticulier(String nom,String prenom){
        super();
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return super.toString()+"FournisseurParticulier{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
