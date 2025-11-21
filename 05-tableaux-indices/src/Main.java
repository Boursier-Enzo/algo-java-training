public class Main {
    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 40, 50};

        System.out.println("tab[0] = " + tab[0]);
        System.out.println("tab[2] = " + tab[2]);

        tab[1] = tab[0] + tab[2];
        System.out.println("tab[1] = " + tab[1]);

        tab[4] = tab[1] - tab[3];
        System.out.println("tab[4] = " + tab[4]);

        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }

        System.out.println("Somme = " + somme);
    }
}
