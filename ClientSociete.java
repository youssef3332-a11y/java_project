public class ClientSociete extends Client {
    private String raisonSociale;
    private String domaineActivite;


    public void setRaisonSociale(String raisonSociale){
        this.raisonSociale=raisonSociale;
    }
    public String getRaisonSociale(ClientSociete clientSociete){
        return raisonSociale;
    }

    public void setDomaineActivite(String domaineActivite){
        this.domaineActivite=domaineActivite;
    }
    public String getDomaineActivite(ClientSociete clientSociete){
        return domaineActivite;
    }

}
