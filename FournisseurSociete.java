public class FournisseurSociete extends Fournisseur{
    private String raisonSociale;

    public void setRaison_sociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getRaison_sociale() {
        return raisonSociale;
    }
    public FournisseurSociete(String raisonSociale){
        super();
        this.raisonSociale=raisonSociale;

    }
    @Override
    public String toString() {
        return super.toString() + ", raison sociale: " + raisonSociale;
    }
}
