public class Main {
    public static void main(String[] args) {
        int somme = 0;

        for (int i = 1; i <= 5; i++) {
            somme = somme + i;
            System.out.println("i = " + i + ", somme = " + somme);
        }

        System.out.println("Resultat final : " + somme);
    }
}
