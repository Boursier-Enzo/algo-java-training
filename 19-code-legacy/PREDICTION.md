# Ma prédiction - Exercice 19

## Partie 1 : Comprendre l'existant

### Classe `Produit`

**Attributs (noms cryptiques) :**
- `n` représente : Nom
- `p` représente : Prix
- `q` représente : Quantité

**Méthode `valeur()` :**
- Que calcule-t-elle ? le prix * la quantité = valeur totale

---

### Classe `Inventaire`

**Attributs :**
- `prods` représente : Le tableau de produits
- `nb` représente : Le nombre de produit dans le tableau

**Méthodes :**
- `ajouter(Produit p)` : Ajoute un produit au tableau et ajoute 1 a nb.
- `chercher(String nom)` : Recherche un produit.
- `afficher()` : Affiche la liste de tout les produits.
- `valeurTotale()` : Calcule la valeur totale de tous les produits du tableau.

---

## Partie 2 : Prédire la sortie actuelle

```
=== Inventaire ===
Pomme : 2.50 x 100
Pain : 1.20 x 50
Lait : 0.95 x 75
Beurre : 2.10 x 30

```

---

## Partie 3 : Ajouter la fonctionnalité

**Fonctionnalité demandée :** 
Ajouter une méthode `afficherCher(double seuil)` qui affiche les produits dont le prix est supérieur au seuil.

**Ma méthode :**
```java
public void afficherCher(double seuil) {
  for (int i = 0; i < nb; i++){
    Produit prod = prods[i];
    if (prod.getPrix() > seuil){
      System.out.println(prod.getNom() + " : " + prod.getPrix() + " x " + prod.getQuantite());
    }
  }
}
```

**Sortie attendue pour `afficherCher(2.0)` :**
```
=== Produits chers (>2 euros) ===
Pomme : 2.5 x 100
Beurre : 2.1 x 30
```
