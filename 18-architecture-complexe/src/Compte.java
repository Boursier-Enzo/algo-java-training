public class Compte {
    private int solde;

    public Compte() {
        this.solde = 0;
    }

    public int getSolde() {
        return solde;
    }

    public void crediter(int montant) {
        solde = solde + montant;
    }

    public void debiter(int montant) {
        solde = solde - montant;
    }
}
