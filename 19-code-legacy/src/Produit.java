public class Produit {
    private String n;
    private double p;
    private int q;

    public Produit(String n, double p, int q) {
        this.n = n;
        this.p = p;
        this.q = q;
    }

    public String getNom() { return n; }
    public double getPrix() { return p; }
    public int getQuantite() { return q; }

    public void setQuantite(int q) { this.q = q; }

    public double valeur() {
        return p * q;
    }
}
