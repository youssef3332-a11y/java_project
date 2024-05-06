public class ClientSociete extends Client {
    private String raisonSociale;
    private String domaineActivite;

    public void setRaisonSociale(String raisonSociale){
        this.raisonSociale=raisonSociale;
    }
    public String getRaisonSociale(){
        return raisonSociale;
    }

    public void setDomaineActivite(String domaineActivite){
        this.domaineActivite=domaineActivite;
    }
    public String getDomaineActivite(ClientSociete clientSociete){
        return domaineActivite;
    }

    public ClientSociete(String raisonSociale, String domaineActivite) {
        super();
        this.raisonSociale=raisonSociale;
        this.domaineActivite=domaineActivite;
    }

    @Override
    public String toString() {
        return super.toString()+"ClientSociete{" +
                "raisonSociale='" + raisonSociale + '\'' +
                ", domaineActivite='" + domaineActivite + '\'' +
                '}';
    }
}
