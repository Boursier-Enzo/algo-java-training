public class Main {
    public static void main(String[] args) {
        int nombre = 10;
        int[] tableau = {1, 2, 3};

        System.out.println("Avant : nombre = " + nombre);
        System.out.println("Avant : tableau[0] = " + tableau[0]);

        modifierNombre(nombre);
        modifierTableau(tableau);

        System.out.println("Apres : nombre = " + nombre);
        System.out.println("Apres : tableau[0] = " + tableau[0]);

        nombre = doubler(nombre);
        System.out.println("Apres doubler : nombre = " + nombre);
    }

    public static void modifierNombre(int n) {
        n = n + 100;
        System.out.println("Dans modifierNombre : n = " + n);
    }

    public static void modifierTableau(int[] tab) {
        tab[0] = tab[0] + 100;
        System.out.println("Dans modifierTableau : tab[0] = " + tab[0]);
    }

    public static int doubler(int n) {
        return n * 2;
    }
}
