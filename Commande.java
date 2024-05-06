public class Commande {
    private int numero;
    private Date dateCommande;
    private Date dateLivraison;
    private Produit[] produitsCommandes;
    private double prixTotal;
    //setters and getters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
    public Date getDateCommande() {
        return dateCommande;
    }

    public void setProduitsCommandes(Produit[] produitsCommandes) {
        this.produitsCommandes = produitsCommandes;
    }

    //lier la commande au fournisseur
    public String livrerCommande(Commande commande,Client client){
        //condition pour verifier si dateLivraison < today : doit livrer sinon print produit livré
        return "La commande numéro "+commande.numero+"a été livré au client : "+client.getReference();
    }
    //constructeur
    public Commande(int numero,Date dateCommande,Date dateLivraison,double prixTotal){
        this.numero=numero;
        this.dateCommande=dateCommande;
        this.dateLivraison=dateLivraison;
        this.prixTotal=prixTotal;
    }
}
