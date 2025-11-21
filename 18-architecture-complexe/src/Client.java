public class Client {
    private String nom;
    private Compte compte;

    public Client(String nom) {
        this.nom = nom;
        this.compte = new Compte();
    }

    public String getNom() {
        return nom;
    }

    public int getSolde() {
        return compte.getSolde();
    }

    public void deposer(int montant) {
        compte.crediter(montant);
    }

    public void retirer(int montant) {
        compte.debiter(montant);
    }

    public void transferer(Client destinataire, int montant) {
        this.retirer(montant);
        destinataire.deposer(montant);
    }
}
