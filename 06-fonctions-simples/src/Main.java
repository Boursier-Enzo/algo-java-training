public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int resultat1 = addition(a, b);
        System.out.println("addition(5, 3) = " + resultat1);

        int resultat2 = carre(a);
        System.out.println("carre(5) = " + resultat2);

        int resultat3 = addition(carre(2), b);
        System.out.println("addition(carre(2), 3) = " + resultat3);
    }

    public static int addition(int x, int y) {
        int somme = x + y;
        return somme;
    }

    public static int carre(int n) {
        return n * n;
    }
}
