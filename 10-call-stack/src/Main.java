public class Main {
    public static void main(String[] args) {
        System.out.println("Calcul de factorielle(4)");
        int resultat = factorielle(4);
        System.out.println("Resultat : " + resultat);
    }

    public static int factorielle(int n) {
        System.out.println("factorielle(" + n + ") appelé");

        if (n <= 1) {
            System.out.println("Cas de base atteint : return 1");
            return 1;
        }

        int sousResultat = factorielle(n - 1);
        int resultat = n * sousResultat;

        System.out.println("factorielle(" + n + ") : " + n + " * " + sousResultat + " = " + resultat);
        return resultat;
    }
}
