public class Commande {
    int numero;
    Date dateCommande;
    Date dateLivraison;
    Produit[] produitsCommandes;
    double prixTotal;

    //lier la commande qu client
    public String livrerCommande(Commande commande,Client client){
        return "La commande numéro "+commande.numero+"a été livré au client : "+client.getReference();
    }
}
