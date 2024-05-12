import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Commande {
    private int numero;
    private boolean livree = false;
    static public int counter = 1;
    private String dateCommande ;
    private Fournisseur fournisseur;
    //produit elementaire car le type produit fini est fabriqué par l'entreprise elle meme
    private List<ProduitElementaire> Listeproduitscomandes = new ArrayList<>();
    private double prixTotal;
    //setters and getters

    public int getNumero() {
        return numero;
    }
    public void setLivree(boolean livree) {this.livree = livree;}
    public boolean isLivree() {return livree;}

    public List<ProduitElementaire> getListeproduitscomandes() {return this.Listeproduitscomandes;}
    public void addproduit(ProduitElementaire produit) {
        if (Listeproduitscomandes.contains(produit)){
            System.out.println("produit deja existe sur la commande! ");
        }
        else{
            Listeproduitscomandes.add(produit);
        }
    }

    //lier la commande au fournisseur

    public void livrerCommande(){
        this.datedenvoyer();
        this.livree = true;
        System.out.println(this);
    }
    //constructeur
    public Commande(Fournisseur fournisseur){
        this.fournisseur=fournisseur;
        this.numero = counter;
        counter++;
    }
    public void datedenvoyer(){
        LocalDate date = LocalDate.now();
        dateCommande = date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear();
    }
    public String afficherlistecommandes(){
        if (Listeproduitscomandes.isEmpty()){
            System.out.println("vous n'avez pas de produits!");
            return "vous n'avez pas de produits!";
        }
        else{
            StringBuilder hold = new StringBuilder();
            for (ProduitElementaire prod : Listeproduitscomandes){
                hold.append(prod);
                hold.append("\n");
            }
            return hold.toString();
        }
    }
    public void prixsum(){
        double count = 0;
        if (Listeproduitscomandes.isEmpty()){
            System.out.println("vous n'avez pas de produits!");
        }
        else{
            for (ProduitElementaire prod : Listeproduitscomandes){
                count += prod.getPrix_TTC();
            }
        }
        prixTotal = count;
    }
    public String toString() {
        String sep = "\n------------------------------------------------------\n";
        String group= sep + "numero de commande : " + numero +
                "\n\n le fournisseur: " + fournisseur +
                "\n\nles produits commandes: " +
                afficherlistecommandes() +
                "\n prix total : " + prixTotal +
                "\n\n livree : " + livree;
        if (livree){
            group += "\n\nla date de la commande: " + dateCommande;
        }
        group += sep;
        return group;
    }
}
