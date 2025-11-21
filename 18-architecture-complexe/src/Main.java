public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("MaBanque");

        Client alice = new Client("Alice");
        Client bob = new Client("Bob");

        banque.ajouterClient(alice);
        banque.ajouterClient(bob);

        alice.deposer(100);
        bob.deposer(50);

        System.out.println("=== Etat initial ===");
        banque.afficherClients();

        alice.transferer(bob, 30);

        System.out.println("\n=== Apres transfert ===");
        banque.afficherClients();

        System.out.println("\n=== Total en banque ===");
        System.out.println("Total : " + banque.totalDepots());
    }
}
