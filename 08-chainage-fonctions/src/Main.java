public class Main {
    public static void main(String[] args) {
        System.out.println("main: debut");
        int resultat = a(5);
        System.out.println("main: resultat = " + resultat);
        System.out.println("main: fin");
    }

    public static int a(int x) {
        System.out.println("a: debut avec x = " + x);
        int val = b(x + 1);
        System.out.println("a: retour de b avec val = " + val);
        return val * 2;
    }

    public static int b(int y) {
        System.out.println("b: debut avec y = " + y);
        int val = c(y + 1);
        System.out.println("b: retour de c avec val = " + val);
        return val + 10;
    }

    public static int c(int z) {
        System.out.println("c: debut avec z = " + z);
        System.out.println("c: fin");
        return z * 3;
    }
}
