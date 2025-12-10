# Ma prédiction - Exercice 17

## Fonction `moyenneInef`

**Problème identifié :** Double boucle inutile.

**Nombre d'opérations actuelles (pour n éléments) :** ___

**Version optimisée :**
```java
public static double moyenneInef(int[] t) {
    double somme = 0;
    for (int i = 0; i < t.length; i++) {
        somme = somme + t[i];
        
    }
    return somme / t.length;
}
```

---

## Fonction `contientDoublonInef`

**Problème identifié :** Inutile de comparer plusieurs les éléments déja comparer.

**Version optimisée :**
```java
public static boolean contientDoublonInef(int[] t) {
    for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t.length; j++) {
            if (t[i] == t[j]) {
                return true;
            }
        }
    }
    return false;
}
```

---

## Fonction `premierEtDernierInef`

**Problème identifié :** Inutile de parcourir le tableau pour avoir le premier et le dernier élément.

**Version optimisée :**
```java
public static String premierEtDernierEff(int[] t) {
  if (t.length != 0){
    return t[0] + " et " +t[t.length-1];
  }
  return "Pas d'éléments"
}
```

---

## Fonction `rechercheInef`

**Problème identifié :** La boucle continue jusqu'au bout même si on a trouver l'élément.

**Version optimisée :**
```java
public static int rechercheInef(int[] t, int val) {
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            return i;
        }
    }
    return -1;
}

```
