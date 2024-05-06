public class ClientPersonne extends Client{
    private String nom;
    private String prenom;
    private String cin;
    ClientPersonne(String nom, String prenom, String cin) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    @Override
    public String toString() {
        return super.toString() +"ClientPersonne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}

