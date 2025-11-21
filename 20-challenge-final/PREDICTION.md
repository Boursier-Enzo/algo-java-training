# Ma prédiction - Exercice 20 (Challenge Final)

## Partie 1 : Références (Liste chaînée)

**Schéma mémoire après lignes 11-12 :**
```
a ──→ [Noeud: valeur=___, suivant=___]
              │
              ▼
b ──→ [Noeud: valeur=___, suivant=___]
              │
              ▼
c ──→ [Noeud: valeur=___, suivant=___]
```

**Traçage de la boucle while :**
- Tour 1 : courant = ___, affiche ___, courant devient ___
- Tour 2 : courant = ___, affiche ___, courant devient ___
- Tour 3 : courant = ___, affiche ___, courant devient ___
- Sortie : courant = ___, condition fausse

**Affichage :**
```

```

---

## Partie 2 : Récursion

**Pile d'appels :**
```
sommeRecursive(a) : 1 + sommeRecursive(b)
  sommeRecursive(b) : 2 + sommeRecursive(c)
    sommeRecursive(c) : 3 + sommeRecursive(null)
      sommeRecursive(null) : return 0
```

**Dépilage :**
- sommeRecursive(null) retourne ___
- sommeRecursive(c) retourne ___ + ___ = ___
- sommeRecursive(b) retourne ___ + ___ = ___
- sommeRecursive(a) retourne ___ + ___ = ___

**Résultat :** ___

---

## Partie 3 : Bug à trouver

**Que fait la fonction `compterOccurrences` ?**
___

**Quel est le bug ?**
- Ligne problématique : ___
- Description : ___

**Résultat actuel :** ___
**Résultat attendu :** ___

**Correction proposée :**
```java

```

---

## Partie 4 : Architecture

**Après les 3 `ajouter()` :**
- elements = [___, ___, ___, ...]
- taille = ___

**somme() :** ___ + ___ + ___ = ___

**Après doubler() :**
- elements = [___, ___, ___, ...]

**somme() :** ___ + ___ + ___ = ___
