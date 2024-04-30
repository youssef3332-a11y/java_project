public class Date {
    int jour;
    int mois;
    int annee;
    Date(int jour,int mois,int annee){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }

    @Override
    public String toString() {
        return jour+"/"+mois+"/"+annee;
    }
}
