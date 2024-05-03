import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("*                                                *");
        System.out.println("*         Bienvenue dans le Gestionnaire          *");
        System.out.println("*                  de Produits !                 *");
        System.out.println("*                                                *");
        System.out.println("* Une application console pour gérer les produits *");
        System.out.println("*          de votre entreprise.                  *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
        System.out.println();

        System.out.println("Commencez par choisir l'un des menus :");
        System.out.println("1. MENU Produits");
        System.out.println("2. MENU Clients");
        System.out.println("3. MENU Fournisseurs");
        System.out.println("4. MENU Commande");

        Scanner scan = new Scanner(System.in);
        int menuChoix = scan.nextInt();
        switch (menuChoix){
            case 1 :
                System.out.println("1. Consulter la liste des produits");
                System.out.println("2. Ajouter un nouveau produit");
                System.out.println("3. Supprimer un produit");
                System.out.println("4. Mettre à jour les détails d'un produit");
                int operationProduit = scan.nextInt();
                switch(operationProduit){
                    case 1 :
                        //yt9ra dakchi li kayn f lfichier li stockena fih les produits
                        //break;
                    case 2 :
                        //bayn
                        //break;
                    case 3 :
                        //code
                        //break;
                    case 4 :
                        //code
                        //break;
                    default :
                        System.out.println("Votre choix ne correspond à aucune opération");
                }
                break;
            case 2 :
                System.out.println("1. Consulter la liste des clients");
                System.out.println("2. Ajouter un nouveau client");
                System.out.println("3. Supprimer un client");
                System.out.println("4. Mettre à jour les détails d'un client");
                int operationClient = scan.nextInt();
                switch(operationClient){
                    case 1 :
                        //yt9ra dakchi li kayn f lfichier li stockena fih les clients
                        //break;
                    case 2 :
                        //bayn hh
                        //break;
                    case 3 :
                        //code
                        //break;
                    case 4 :
                        //code
                        //break;
                    default :
                        System.out.println("Votre choix ne correspond à aucune opération");
                }
                break;
            case 3 :
                System.out.println("1. Consulter la liste des fournisseurs");
                System.out.println("2. Ajouter un nouveau fournisseur");
                System.out.println("3. Supprimer un fournisseur");
                System.out.println("4. Mettre à jour les détails d'un fournisseur");
                int operationFournisseur = scan.nextInt();
                switch(operationFournisseur){
                    case 1 :
                        //yt9ra dakchi li kayn f lfichier li stockena fih les fournisseurs
                        //break;
                    case 2 :
                        //bayn
                        //break;
                    case 3 :
                        //code
                        //break;
                    case 4 :
                        //code
                        //break;
                    default :
                        System.out.println("Votre choix ne correspond à aucune opération");
                }
                break;
            case 4 :
                System.out.println("1. Consulter la liste des commandes");
                System.out.println("2. Ajouter une nouvelle commande");
                System.out.println("3. Supprimer une commande");
                System.out.println("4. Mettre à jour les détails d'une commande");
                System.out.println("5. Envoyer une commande à un client");
                int operationCommande = scan.nextInt();
                switch(operationCommande){
                    case 1 :
                        //yt9ra dakchi li kayn f lfichier li stockena fih les commandes
                        //break;
                    case 2 :
                        //bayn
                        //break;
                    case 3 :
                        //code
                        //break;
                    case 4 :
                        //code
                        //break;
                    case 5 :
                        //kayna chi methode f class Commande wa9ila
                        //break;
                    default :
                        System.out.println("Votre choix ne correspond à aucune opération");
                }
                break;
            default:
                System.out.println("Pas de Menu correspondant");
        }


    }
}
