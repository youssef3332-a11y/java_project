import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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

        //les listes des produits
        List<ProduitElementaire> ListeProduitElementaire = new ArrayList<>();
        List<ProduitFini> ListeProduitsFini = new ArrayList<>();

        //les listes des clients
        List<ClientPersonne> ListeClientPersonne = new ArrayList<>();
        List<ClientSociete> ListeClientSociete = new ArrayList<>();

        while (true) {
            System.out.println("Commencez par choisir l'un des menus :");
            System.out.println("1. MENU Produits");
            System.out.println("2. MENU Clients");
            System.out.println("3. MENU Fournisseurs");
            System.out.println("4. MENU Commande");
            System.out.println("5. finissez la gestion.");
            System.out.print(">>>");
            Scanner scan = new Scanner(System.in);
            int menuChoix = scan.nextInt();
            switch (menuChoix){
                case 1 :
                    while (true) {
                        System.out.println("\n1. Consulter la liste des produits");
                        System.out.println("2. Ajouter un nouveau produit");
                        System.out.println("3. Supprimer un produit");
                        System.out.println("4. Mettre à jour les détails d'un produit");
                        System.out.println("5. retourner à la page d'accueil");
                        System.out.print(">>>");
                        int operationProduit = scan.nextInt();
                        Scanner scan2 = new Scanner(System.in);
                        int choose;
                        switch (operationProduit) {
                            case 1:
                                System.out.println("----->la liste des produits elementaire: 1   produit fini: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    afficherListeProduitsElementaire(ListeProduitElementaire);
                                }
                                else if (choose == 2) {
                                    afficherListeProduitsFini(ListeProduitsFini);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 2:
                                System.out.println("l'ajout d'un nouveau produit elementaire: 1   produit fini: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    addlisteProduitElementaire(ListeProduitElementaire);
                                }
                                else if (choose == 2) {
                                    addlisteProduit(ListeProduitsFini);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 3:
                                System.out.println("supprimer un produit elementaire: 1   produit fini: 2:");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    supprimerProduitElementaire(ListeProduitElementaire);
                                }
                                else if (choose == 2) {
                                    supprimerProduit(ListeProduitsFini);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 4:
                                System.out.println("mettre à jour les détails d'un produit elementaire: 1   produit fini: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    modifierProduitElementaire(ListeProduitElementaire);
                                }
                                else if (choose == 2) {
                                    modifierProduit(ListeProduitsFini);
                                }
                                else{
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 5:
                                System.out.println("la page d'accueil :");
                                break;
                            default:
                                System.out.println("Votre choix ne correspond à aucune opération");
                        }
                        if (operationProduit == 5) {
                            break;
                        }
                    }
                    continue;
                case 2 :
                 while (true){
                     System.out.println("1. Consulter la liste des clients");
                     System.out.println("2. Ajouter un nouveau client");
                     System.out.println("3. Supprimer un client");
                     System.out.println("4. Mettre à jour les détails d'un client");
                     System.out.println("5. retourner à la page d'accueil");
                     System.out.print(">>>");
                     int operationClient = scan.nextInt();
                     Scanner scan2 = new Scanner(System.in);
                     int choose;
                     switch (operationClient) {
                         case 1:
                             System.out.println("----->la liste des clients personnes: 1   societes: 2");
                             choose = scan2.nextInt();
                             scan2.nextLine();
                             if (choose == 1) {
                                 afficherListeClientPersonne(ListeClientPersonne);
                             }
                             else if (choose == 2) {
                                 afficherListeClientSociete(ListeClientSociete);
                             }
                             else
                             {
                                 System.out.println("option non disponible !");
                             }
                             break;
                         case 2:
                             System.out.println("l'ajout d'un nouveau client personne: 1   societe: 2");
                             choose = scan2.nextInt();
                             scan2.nextLine();
                             if (choose == 1) {
                                 addlisteClientPersonne(ListeClientPersonne);
                             }
                             else if (choose == 2) {
                                 addlisteClientSociete(ListeClientSociete);
                             }
                             else
                             {
                                 System.out.println("option non disponible !");
                             }
                             break;
                         case 3:
                             System.out.println("supprimer un client  personne: 1   societe: 2:");
                             choose = scan2.nextInt();
                             scan2.nextLine();
                             if (choose == 1) {
                                 supprimerClientPersonne(ListeClientPersonne);
                             }
                             else if (choose == 2) {
                                 supprimerClientSociete(ListeClientSociete);
                             }
                             else
                             {
                                 System.out.println("option non disponible !");
                             }
                             break;
                         case 4:
                             System.out.println("mettre à jour les détails d'un client personne: 1   societe: 2");
                             choose = scan2.nextInt();
                             scan2.nextLine();
                             if (choose == 1) {
                                 modifierClientPersonne(ListeClientPersonne);
                             }
                             else if (choose == 2) {
                                 modifierClientSociete(ListeClientSociete);
                             }
                             else{
                                 System.out.println("option non disponible !");
                             }
                             break;
                         case 5:
                             System.out.println("la page d'accueil :");
                             break;
                         default:
                             System.out.println("Votre choix ne correspond à aucune opération");
                     }
                     if (operationClient == 5) {break;}
                 }
                 continue;
                case 3 :
                    while (true){
                        System.out.println("1. Consulter la liste des fournisseurs");
                        System.out.println("2. Ajouter un nouveau fournisseur");
                        System.out.println("3. Supprimer un fournisseur");
                        System.out.println("4. Mettre à jour les détails d'un fournisseur");
                        System.out.println("5. retourner à la page d'accueil");
                        System.out.print(">>>");
                        int operationFournisseur = scan.nextInt();
                        Scanner scan2 = new Scanner(System.in);
                        int choose;
                        switch (operationFournisseur) {
                            case 1:
                                System.out.println("----->la liste des fournisseurs  particuliers: 1   societes: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    afficherListeFournisseurParticulier(ListeFournisseurParticulier);
                                }
                                else if (choose == 2) {
                                    afficherListeClientSociete(ListeClientSociete);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 2:
                                System.out.println("l'ajout d'un nouveau client personne: 1   societe: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    addlisteClientPersonne(ListeClientPersonne);
                                }
                                else if (choose == 2) {
                                    addlisteClientSociete(ListeClientSociete);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 3:
                                System.out.println("supprimer un client  personne: 1   societe: 2:");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    supprimerClientPersonne(ListeClientPersonne);
                                }
                                else if (choose == 2) {
                                    supprimerClientSociete(ListeClientSociete);
                                }
                                else
                                {
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 4:
                                System.out.println("mettre à jour les détails d'un client personne: 1   societe: 2");
                                choose = scan2.nextInt();
                                scan2.nextLine();
                                if (choose == 1) {
                                    modifierClientPersonne(ListeClientPersonne);
                                }
                                else if (choose == 2) {
                                    modifierClientSociete(ListeClientSociete);
                                }
                                else{
                                    System.out.println("option non disponible !");
                                }
                                break;
                            case 5:
                                System.out.println("la page d'accueil :");
                                break;
                            default:
                                System.out.println("Votre choix ne correspond à aucune opération");
                        }
                        if (operationClient == 5) {break;}
                    }
                    continue;
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
                            //kayna chi methode f class Commande
                            //break;
                        default :
                            System.out.println("Votre choix ne correspond à aucune opération");
                    }
                    break;
                case 5:
                    System.out.println("l'application est fermée.");
                    System.exit(0);
                default:
                    System.out.println("Pas de Menu correspondant");
            }
        }
    }
//methodes pour les produits elementaire
    public static int indexProduitElementaire(List<ProduitElementaire> listeProduits, String nom){
        for (int i = 0; i < listeProduits.size(); i++) {
            if (listeProduits.get(i).libelle.equals(nom)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean verifierProduitElementaire(List<ProduitElementaire> listeProduits, String nom){
        if (indexProduitElementaire(listeProduits, nom) == -1) {
            return false;
        }
        return true;
    }
    public static void afficherListeProduitsElementaire(List<ProduitElementaire> listeProduits){
        if (listeProduits.isEmpty()){
            System.out.println("Vous n'avez pas les produits");
        }
        else {
            for (ProduitElementaire produit : listeProduits) {System.out.println(produit);// calling the toString methode
            }
        }
    }
    public static void addlisteProduitElementaire(List<ProduitElementaire> listeProduits){
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nom du produit");
        System.out.print(">>>");
        String nom;
        while (true){
            try{
                nom = scan.next();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un nom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner le prix du produit:");
        System.out.print(">>>");
        double prix;
        while (true){
            try {
                prix = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un prix valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner la quantitee:");
        System.out.print(">>>");
        int quantitee;
        while (true){
            try {
                quantitee = scan.nextInt();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une quantitee valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner la categorie:");
        System.out.print(">>>");
        String categorie;
        while (true){
            try {
                categorie = scan.nextLine();
                //scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une categorie valide!\n>>>");
                scan.nextLine();
            }
        }
        ProduitElementaire produit = new ProduitElementaire(nom, prix, quantitee, categorie);
        listeProduits.add(produit);
    }
    public static void supprimerProduitElementaire(List<ProduitElementaire> listeProduits) {
        if (listeProduits.isEmpty()) {
            System.out.println("vous n'avait pas des produits  !");
        } else{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("donner le nom du produit:");
            System.out.print(">>>");
            String nom;
            nom = scan2.nextLine();
            int test = 0;
            for (int i = 0; i < listeProduits.size(); i++) {
                if (listeProduits.get(i).libelle.equals(nom)) {
                    listeProduits.remove(i);
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                System.out.println("ce nom n'existe pas !");
            }
        }
    }
    public static void modifierProduitElementaire(List<ProduitElementaire> listeProduits){
        if (listeProduits.isEmpty()){
            System.out.println("Vous n'avez pas des produits");
        }
        else {
            Scanner scan3 = new Scanner(System.in);
            System.out.println("donner le nom du produit à modifier");
            System.out.print(">>>");
            String nom = scan3.nextLine();
            scan3.nextLine();
            if (!verifierProduitElementaire(listeProduits, nom)){
                System.out.println("ce produit n'existe pas !");
            }
            else {
                while (true){
                    System.out.println("------>quelle paramètre vous voulez changer:");
                    System.out.println("    le nom: 1   le prix: 2   la quantitee: 3  la categorie: 4  finissez la modification: 5");
                    System.out.print(">>>");
                    int number = scan3.nextInt();
                    scan3.nextLine();
                    int test1 = 0;
                    switch (number){
                        case 1:
                            listeProduits.get(indexProduitElementaire(listeProduits, nom)).libelle = scan3.nextLine();
                            scan3.nextLine();
                            System.out.println("le nom a été modifier");
                            break;
                        case 2:
                            double prix;
                            while (true){
                                try{
                                    prix = scan3.nextDouble();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer un prix valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeProduits.get(indexProduitElementaire(listeProduits, nom)).setPrix_TTC(prix);
                            System.out.println("le prix à été modifier");
                            break;
                        case 3:
                            int quantitee;
                            while (true){
                                try{
                                    quantitee = scan3.nextInt();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer une quantitee valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeProduits.get(indexProduitElementaire(listeProduits, nom)).setQuantite(quantitee);
                            System.out.println("la quantitee à été modifier");
                            break;
                        case 4:
                            String categorie = scan3.nextLine();
                            listeProduits.get(indexProduitElementaire(listeProduits, nom)).setCategorie(categorie);
                            scan3.nextLine();
                            System.out.println("la categorie a été modifier");
                            break;
                        case 5:
                            System.out.println("finissez la modification");
                            test1 = 1;
                            break;
                        default:
                            System.out.println("choisissez une option valide !");
                            break;
                    }
                    if (test1 == 1){
                        break;
                    }
                }
            }
        }
    }
//methodes pour les produits fini
    public static int indexProduitFini(List<ProduitFini> listeProduits, String nom){
        for (int i = 0; i < listeProduits.size(); i++) {
            if (listeProduits.get(i).libelle.equals(nom)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean verifierProduitFini(List<ProduitFini> listeProduits, String nom){
        if (indexProduitFini(listeProduits, nom) == -1) {
            return false;
        }
        return true;
    }
    public static void afficherListeProduitsFini(List<ProduitFini> listeProduits){
        if (listeProduits.isEmpty()){
            System.out.println("Vous n'avez pas les produits");
        }
        else {
            for (ProduitFini produit : listeProduits) {System.out.println(produit);// calling the toString methode
            }
        }
    }
    public static void addlisteProduit(List<ProduitFini> listeProduits){
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nom du produit");
        System.out.print(">>>");
        String nom;
        while (true){
            try{
                nom = scan.next();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un nom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner le prix du produit:");
        System.out.print(">>>");
        double prix;
        while (true){
            try {
                prix = scan.nextDouble();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un prix valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner la quantitee:");
        System.out.print(">>>");
        int quantitee;
        while (true){
            try {
                quantitee = scan.nextInt();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une quantitee valide!\n>>>");
                scan.nextLine();
            }
        }
        ProduitFini produit = new ProduitFini(nom, prix, quantitee);
        listeProduits.add(produit);
    }
    public static void supprimerProduit(List<ProduitFini> listeProduits) {

        if (listeProduits.isEmpty()) {
            System.out.println("vous n'avait pas des produits  !");
        } else{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("donner le nom du produit:");
            System.out.print(">>>");
            String nom;
            nom = scan2.nextLine();
            int test = 0;
            for (int i = 0; i < listeProduits.size(); i++) {
                if (listeProduits.get(i).libelle.equals(nom)) {
                    listeProduits.remove(i);
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                System.out.println("ce nom n'existe pas !");
            }
        }
    }
    public static void modifierProduit(List<ProduitFini> listeProduits){
        if (listeProduits.isEmpty()){
            System.out.println("Vous n'avez pas des produits");
        }
        else {
            Scanner scan3 = new Scanner(System.in);
            System.out.println("donner le nom du produit à modifier");
            System.out.print(">>>");
            String nom = scan3.nextLine();
            scan3.nextLine();
            if (!verifierProduitFini(listeProduits, nom)){
                System.out.println("ce produit n'existe pas !");
            }
            else {
                while (true){
                    System.out.println("------>quelle paramètre vous voulez changer:");
                    System.out.println("    le nom: 1     le prix: 2     la quantitee: 3    finissez la modification: 4");
                    System.out.print(">>>");
                    int number = scan3.nextInt();
                    scan3.nextLine();
                    int test1 = 0;
                    switch (number){
                        case 1:
                            listeProduits.get(indexProduitFini(listeProduits, nom)).libelle = scan3.nextLine();
                            scan3.nextLine();
                            System.out.println("le nom a été modifier");
                            break;
                        case 2:
                            double prix;
                            while (true){
                                try{
                                    prix = scan3.nextDouble();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer un prix valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeProduits.get(indexProduitFini(listeProduits, nom)).setPrix_TTC(prix);
                            System.out.println("le prix à été modifier");
                            break;
                        case 3:
                            int quantitee;
                            while (true){
                                try{
                                    quantitee = scan3.nextInt();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer une quantitee valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeProduits.get(indexProduitFini(listeProduits, nom)).setQuantite(quantitee);
                            System.out.println("la quantitee à été modifier");
                            break;
                        case 4:
                            System.out.println("finissez la modification");
                            test1 = 1;
                            break;
                        default:
                            System.out.println("choisissez une option valide !");
                            break;
                    }
                    if (test1 == 1){
                        break;
                    }
                }
            }
        }
    }
//methodes pour manupiler les clients personne
    public static int indexClientPersonne(List<ClientPersonne> listeClients, int ref){
    for (int i = 0; i < listeClients.size(); i++) {
        if (listeClients.get(i).getReference() == ref) {
            return i;
        }
    }
    return -1;
}
    public static boolean verifierClientPersonne(List<ClientPersonne> listeClients, int ref){
    return indexClientPersonne(listeClients, ref) != -1;
}
    public static void afficherListeClientPersonne(List<ClientPersonne> listeClients){
        if (listeClients.isEmpty()){
            System.out.println("Pas de clients personnes");
        }
        else {
            for (ClientPersonne client : listeClients) {System.out.println(client);// calling the toString methode
            }
        }
    }
    public static void addlisteClientPersonne(List<ClientPersonne> listeClients){
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nom du client");
        System.out.print(">>>");
        String nom;
        while (true){
            try{
                nom = scan.next();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un nom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner le prenom du client:");
        System.out.print(">>>");
        String prenom;
        while (true){
            try {
                prenom = scan.nextLine();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un prenom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner CIN:");
        System.out.print(">>>");
        String cin;
        while (true){
            try {
                cin = scan.nextLine();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une CIN valide!\n>>>");
                scan.nextLine();
            }
        }
        ClientPersonne client = new ClientPersonne(prenom, nom, cin);
        listeClients.add(client);
    }
    public static void supprimerClientPersonne(List<ClientPersonne> listeClients) {
        if (listeClients.isEmpty()) {
            System.out.println("vous n'avait pas de clients personnes  !");
        } else{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("donner la CIN du client:");
            System.out.print(">>>");
            String cin;
            cin = scan2.nextLine();
            int test = 0;
            for (int i = 0; i < listeClients.size(); i++) {
                if (listeClients.get(i).getCin().equals(cin)) {
                    listeClients.remove(i);
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                System.out.println("ce client n'existe pas !");
            }
        }
    }
    public static void modifierClientPersonne(List<ClientPersonne> listeClients){
        if (listeClients.isEmpty()){
            System.out.println("Vous n'avez pas de clients");
        }
        else {
            Scanner scan3 = new Scanner(System.in);
            System.out.println("donner la reference du client à modifier");
            System.out.print(">>>");
            int ref = scan3.nextInt();
            scan3.nextLine();
            if (!verifierClientPersonne(listeClients, ref)){
                System.out.println("ce client n'existe pas !");
            }
            else {
                while (true){
                    System.out.println("------>quelle paramètre vous voulez changer:");
                    System.out.println("    le nom: 1   le prenom: 2   la cin: 3  finissez la modification: 4");
                    System.out.print(">>>");
                    int number = scan3.nextInt();
                    scan3.nextLine();
                    int test1 = 0;
                    switch (number){
                        case 1:
                            listeClients.get(indexClientPersonne(listeClients, ref)).setNom(scan3.nextLine());
                            scan3.nextLine();
                            System.out.println("le nom a été modifier");
                            break;
                        case 2:
                            String prenom = scan3.nextLine();
                            while (true){
                                try{
                                    prenom = scan3.nextLine();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer un prenom valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeClients.get(indexClientPersonne(listeClients, ref)).setPrenom(prenom);
                            System.out.println("le prenom à été modifier");
                            break;
                        case 3:
                            String cin = scan3.nextLine();
                            while (true){
                                try{
                                    cin = scan3.nextLine();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer une cin valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeClients.get(indexClientPersonne(listeClients, ref)).setCin(cin);
                            System.out.println("la cin à été modifier");
                            break;
                        case 4:
                            System.out.println("finissez la modification");
                            test1 = 1;
                            break;
                        default:
                            System.out.println("choisissez une option valide !");
                            break;
                    }
                    if (test1 == 1){
                        break;
                    }
                }
            }
        }
    }
//methodes pour manupiler les clients societe
    public static int indexClientSociete(List<ClientSociete> listeClients, int ref){
    for (int i = 0; i < listeClients.size(); i++) {
        if (listeClients.get(i).getReference() == ref) {
            return i;
        }
    }
    return -1;
}
    public static boolean verifierClientSociete(List<ClientSociete> listeClients, int ref){
        return indexClientSociete(listeClients, ref) != -1;
    }
    public static void afficherListeClientSociete(List<ClientSociete> listeClients){
        if (listeClients.isEmpty()){
            System.out.println("Pas de clients Societes");
        }
        else {
            for (ClientSociete client : listeClients) {System.out.println(client);// calling the toString methode
            }
        }
    }
    public static void addlisteClientSociete(List<ClientSociete> listeClients){
        Scanner scan = new Scanner(System.in);
        System.out.println("donner la raison sociale de la societe");
        System.out.print(">>>");
        String nom;
        while (true){
            try{
                nom = scan.next();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une raison sociale valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner le domaine d'activite de la societe :");
        System.out.print(">>>");
        String da;
        while (true){
            try {
                da = scan.nextLine();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un domaine valide!\n>>>");
                scan.nextLine();
            }
        }
        ClientSociete client = new ClientSociete(nom,da);
        listeClients.add(client);
    }
    public static void supprimerClientSociete(List<ClientSociete> listeClients) {
        if (listeClients.isEmpty()) {
            System.out.println("vous n'avez pas de clients societes  !");
        } else{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("donner la raison sociale du client societe:");
            System.out.print(">>>");
            String rs;
            rs = scan2.nextLine();
            int test = 0;
            for (int i = 0; i < listeClients.size(); i++) {
                if (listeClients.get(i).getRaisonSociale().equals(rs)) {
                    listeClients.remove(i);
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                System.out.println("ce client n'existe pas !");
            }
        }
    }
    public static void modifierClientSociete(List<ClientSociete> listeClients){
        if (listeClients.isEmpty()){
            System.out.println("Vous n'avez pas de clients");
        }
        else {
            Scanner scan3 = new Scanner(System.in);
            System.out.println("donner la reference du client à modifier");
            System.out.print(">>>");
            int ref = scan3.nextInt();
            scan3.nextLine();
            if (!verifierClientSociete(listeClients, ref)){
                System.out.println("ce client n'existe pas !");
            }
            else {
                while (true){
                    System.out.println("------>quelle paramètre vous voulez changer:");
                    System.out.println("   la raison sociale: 1   le domaine d'activite: 2   finissez la modification: 3");
                    System.out.print(">>>");
                    int number = scan3.nextInt();
                    scan3.nextLine();
                    int test1 = 0;
                    switch (number){
                        case 1:
                            listeClients.get(indexClientSociete(listeClients, ref)).setRaisonSociale(scan3.nextLine());
                            scan3.nextLine();
                            System.out.println("la raison sociale a été modifie");
                            break;
                        case 2:
                            String da = scan3.nextLine();
                            while (true){
                                try{
                                    da = scan3.nextLine();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer un domaine valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeClients.get(indexClientSociete(listeClients, ref)).setDomaineActivite(da);
                            System.out.println("le domaine à été modifie");
                            break;

                        case 3:
                            System.out.println("finissez la modification");
                            test1 = 1;
                            break;
                        default:
                            System.out.println("choisissez une option valide !");
                            break;
                    }
                    if (test1 == 1){
                        break;
                    }
                }
            }
        }
    }
    //methodes pour manipuler les fournisseurs particuliers
    public static int indexFournisseurParticulier(List<FournisseurParticulier> listeFournisseurs, int ref){
        for (int i = 0; i < listeFournisseurs.size(); i++) {
            if (listeFournisseurs.get(i).getReference() == ref) {
                return i;
            }
        }
        return -1;
    }
    public static boolean verifierFournisseurParticulier(List<FournisseurParticulier> listeFournisseurs, int ref){
        return indexFournisseurParticulier(listeFournisseurs, ref) != -1;
    }
    public static void afficherListeFournisseurParticulier(List<FournisseurParticulier> listeFournisseurs){
        if (listeFournisseurs.isEmpty()){
            System.out.println("Pas de fournisseurs particuliers");
        }
        else {
            for (FournisseurParticulier fournisseur : listeFournisseurs) {System.out.println(fournisseur);// calling the toString methode
            }
        }
    }
    public static void addlisteFournisseursParticulier(List<FournisseurParticulier> listeFournisseursParticulier){
        Scanner scan = new Scanner(System.in);
        System.out.println("donner le nom du client");
        System.out.print(">>>");
        String nom;
        while (true){
            try{
                nom = scan.next();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un nom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner le prenom du client:");
        System.out.print(">>>");
        String prenom;
        while (true){
            try {
                prenom = scan.nextLine();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer un prenom valide!\n>>>");
                scan.nextLine();
            }
        }
        System.out.println("donner CIN:");
        System.out.print(">>>");
        String cin;
        while (true){
            try {
                cin = scan.nextLine();
                scan.nextLine();
                break;
            }
            catch (Exception e){
                System.out.println("error: " + e.getMessage());
                System.out.print("veuillez entrer une CIN valide!\n>>>");
                scan.nextLine();
            }
        }
        ClientPersonne client = new ClientPersonne(prenom, nom, cin);
        listeClients.add(client);
    }
    public static void supprimerClientPersonne(List<ClientPersonne> listeClients) {
        if (listeClients.isEmpty()) {
            System.out.println("vous n'avait pas de clients personnes  !");
        } else{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("donner la CIN du client:");
            System.out.print(">>>");
            String cin;
            cin = scan2.nextLine();
            int test = 0;
            for (int i = 0; i < listeClients.size(); i++) {
                if (listeClients.get(i).getCin().equals(cin)) {
                    listeClients.remove(i);
                    test = 1;
                    break;
                }
            }
            if (test == 0) {
                System.out.println("ce client n'existe pas !");
            }
        }
    }
    public static void modifierClientPersonne(List<ClientPersonne> listeClients){
        if (listeClients.isEmpty()){
            System.out.println("Vous n'avez pas de clients");
        }
        else {
            Scanner scan3 = new Scanner(System.in);
            System.out.println("donner la reference du client à modifier");
            System.out.print(">>>");
            int ref = scan3.nextInt();
            scan3.nextLine();
            if (!verifierClientPersonne(listeClients, ref)){
                System.out.println("ce client n'existe pas !");
            }
            else {
                while (true){
                    System.out.println("------>quelle paramètre vous voulez changer:");
                    System.out.println("    le nom: 1   le prenom: 2   la cin: 3  finissez la modification: 4");
                    System.out.print(">>>");
                    int number = scan3.nextInt();
                    scan3.nextLine();
                    int test1 = 0;
                    switch (number){
                        case 1:
                            listeClients.get(indexClientPersonne(listeClients, ref)).setNom(scan3.nextLine());
                            scan3.nextLine();
                            System.out.println("le nom a été modifier");
                            break;
                        case 2:
                            String prenom = scan3.nextLine();
                            while (true){
                                try{
                                    prenom = scan3.nextLine();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer un prenom valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeClients.get(indexClientPersonne(listeClients, ref)).setPrenom(prenom);
                            System.out.println("le prenom à été modifier");
                            break;
                        case 3:
                            String cin = scan3.nextLine();
                            while (true){
                                try{
                                    cin = scan3.nextLine();
                                    scan3.nextLine();
                                    break;
                                }
                                catch (Exception e){
                                    System.out.println("error: " + e.getMessage());
                                    System.out.print("veuillez entrer une cin valide!\n>>>");
                                    scan3.nextLine();
                                }
                            }
                            listeClients.get(indexClientPersonne(listeClients, ref)).setCin(cin);
                            System.out.println("la cin à été modifier");
                            break;
                        case 4:
                            System.out.println("finissez la modification");
                            test1 = 1;
                            break;
                        default:
                            System.out.println("choisissez une option valide !");
                            break;
                    }
                    if (test1 == 1){
                        break;
                    }
                }
            }
        }
    }
}
