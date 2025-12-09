# Ma prédiction - Exercice 15

## Fonction `trouverMax`

```java
int max = t[0];      // Trou 1 : ___
for (int i = 1; i < t.length; i++);   // Trou 2 : ___
    if (t[i] > max)  // Trou 3 : ___
        max = t[i];     // Trou 4 : ___
```

**Raisonnement :**
- Trou 1 : max = premier élément du tableau.
- Trou 2 : On commence a partir de i = 1 car max = t[0].
- Trou 3 : si t[i] est plus grand que max permet de comparer l'ancienne valeur du tableau avec la nouvelle.
- Trou 4 : si la valeur est plus grande max prend cette valeur.

---

## Fonction `contient`

```java
if (t[i] == val)     // Trou 1 et 2 : ___ == ___
    return true     // Trou 3 : ___
return false         // Trou 4 : ___
```

**Raisonnement :**
- Trous 1-2 : Vérifie si la valeur du tableau est égale a la valeur qu'on cherche.
- Trou 3 : si les deux valeurs sont égales on return true.
- Trou 4 : sinon false.

---

## Fonction `sommePairs`

```java
if (t[i] % 2 == 0  // Trou 1 et 2 : ___ et ___
    somme = somme + t[i]; // Trou 3 : ___
```

**Raisonnement :**
- Trou 1 : Pour avoir la somme des éléments pairs du tableau il faut obtenir le reste. 
- Trou 2 : Puis vérifier si il est égale à 0.
- Trou 3 : Puis ajouter les éléments pairs.

---

## Fonction `dupliquer`

```java
int[] res = new int[t.length * 2];  // Trou 1 : ___
res[i * 2] = t[i];                   // Trou 2 : ___
res[i * 2 + 1] = t[i];              // Trou 3 et 4 : ___ et ___
```

**Raisonnement :**
- Trou 1 : On multiplie par 2 car on à 2 fois plus d'éléments.
- Trou 2 : Permet d'avoir l'élément une premiere fois.
- Trous 3-4 : Permet d'avoir l'élément une seconde fois à l'indice juste après grâce au + 1.
