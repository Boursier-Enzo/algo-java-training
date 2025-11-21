public class Main {
    public static void main(String[] args) {
        int n = 100;
        int compteur = 0;

        while (n > 1) {
            n = n / 2;
            compteur++;
            System.out.println("n = " + n + ", compteur = " + compteur);
        }

        System.out.println("Nombre de divisions : " + compteur);
    }
}
