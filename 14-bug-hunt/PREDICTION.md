# Ma prédiction - Exercice 14

## BUG 1 : fonction `moyenne`

**Ligne suspecte :** for (int i = 0; i <= t.length; i++)

**Description du bug :** i <= t.length est un bug car vu qu'on met <= on sort des indices du tableau.

**Ce qui va se passer :** recevoir un erreur

**Correction proposée :** for (int i = 0; i < t.length; i++)

---

## BUG 2 : fonction `estTrie`

**Ligne suspecte :** for (int i = 0; i < t.length; i++)

**Description du bug :** On compare avec i+1 la boucle va sortir des indices du tableau.

**Ce qui va se passer :** recevoir un erreur

**Correction proposée :** for (int i = 0; i < t.length - 1; i++)

---

## BUG 3 : fonction `inverse`

**Ligne suspecte :** for (int i = 0; i < t.length; i++)

**Description du bug :** La boucle parcourt toute la longueure donc le tableau est inversé puis ré inversé.

**Ce qui va se passer :** Le tableau est comme au départ.

**Correction proposée :** for (int i = 0; i < t.length / 2; i++)

---

## BUG 4 : fonction `compter`

**Ligne suspecte :** return count;

**Description du bug :** Le return est dans la boucle donc des la première itération la fonction return et s'arrête.

**Ce qui va se passer :** La fonction ne comptera qu'une seule occurence

**Correction proposée :** 

public static int compter(int[] t, int val) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                count++;
            }
        }
        return count;
    }
