# Ma prédiction - Exercice 11

## Analyse des fonctions

### Fonction `xxx(int[] t)`

**Que fait cette fonction ?**
- Analyse le code ligne par ligne :
  - r = t[0] → 3
  - Boucle : si t[i] > r alors r = t[i] → 9
  - return r → 9

**En une phrase, cette fonction :** Cette fonction renvoie la plus grande valeur de la liste.

**xxx({3, 7, 2, 9, 1, 5}) = 9**

---

### Fonction `yyy(int[] t)`

**Que fait cette fonction ?**
- Analyse :
  - r = 0 → 0
  - Boucle : r = r + t[i] → 0+3+7+2+9+1+5
  - return r → 27

**En une phrase, cette fonction :** Cette fonction renvoie la somme des valeurs de la liste.

**yyy({3, 7, 2, 9, 1, 5}) = 27**

---

### Fonction `zzz(int[] t, int v)`

**Que fait cette fonction ?**
- Première boucle : compte les éléments où t[i] < v → 3,2,1
- Crée un nouveau tableau de taille c → [] de taille 3
- Deuxième boucle : remplit le tableau avec les éléments < v → 3,2,1

**En une phrase, cette fonction :** Cette fonction renvoie un nouveau tableau avec les valeurs du tableau entré en paramètre strictement inférieur à v.

**zzz({3, 7, 2, 9, 1, 5}, 4) = {3,2,1}**

---

### Fonction `aaa(int[] t)`

**Que fait cette fonction ?**
- Double boucle imbriquée → parcourt toute les éléments de la boucles
- Compare t[j] et t[j+1], échange si t[j] > t[j+1] → trie dans l'ordre croissant

**En une phrase, cette fonction :** Cette fonction trie les éléments de la liste dans l'ordre croissant.

**Après aaa({3, 7, 2, 9, 1, 5}) : {1, 2, 3, 4, 7, 9}**
