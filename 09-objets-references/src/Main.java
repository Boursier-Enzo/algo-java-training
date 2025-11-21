public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Alice", 25);
        Personne p2 = p1;
        Personne p3 = new Personne("Alice", 25);

        System.out.println("p1.nom = " + p1.nom);
        System.out.println("p2.nom = " + p2.nom);
        System.out.println("p3.nom = " + p3.nom);

        p2.nom = "Bob";
        p2.age = 30;

        System.out.println("Apres modification de p2 :");
        System.out.println("p1.nom = " + p1.nom + ", p1.age = " + p1.age);
        System.out.println("p2.nom = " + p2.nom + ", p2.age = " + p2.age);
        System.out.println("p3.nom = " + p3.nom + ", p3.age = " + p3.age);

        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1 == p3 : " + (p1 == p3));
    }
}

class Personne {
    String nom;
    int age;

    Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
