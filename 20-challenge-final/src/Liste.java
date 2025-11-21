public class Liste {
    private int[] elements;
    private int taille;

    public Liste() {
        elements = new int[100];
        taille = 0;
    }

    public void ajouter(int val) {
        elements[taille] = val;
        taille++;
    }

    public int somme() {
        int s = 0;
        for (int i = 0; i < taille; i++) {
            s = s + elements[i];
        }
        return s;
    }

    public void doubler() {
        for (int i = 0; i < taille; i++) {
            elements[i] = elements[i] * 2;
        }
    }
}
