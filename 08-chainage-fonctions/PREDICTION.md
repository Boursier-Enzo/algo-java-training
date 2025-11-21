# Ma prédiction - Exercice 08

## Pile d'appels

Dessine la pile au fur et à mesure :

```
Étape 1: [main]
Étape 2: [main, ___]
Étape 3: [main, ___, ___]
Étape 4: [main, ___, ___, ___]
Étape 5: [main, ___, ___]  ← retour de ___
Étape 6: [main, ___]       ← retour de ___
Étape 7: [main]            ← retour de ___
```

---

## Traçage dans l'ordre d'exécution

**main :** `a(5)` est appelé
```
main: debut
```

**a :** reçoit x = ___
```

```

**a :** appelle `b(x + 1)` → b(___)

**b :** reçoit y = ___
```

```

**b :** appelle `c(y + 1)` → c(___)

**c :** reçoit z = ___
```


```

**c :** retourne z * 3 = ___ * 3 = ___

**Retour dans b :** val = ___
```

```
**b :** retourne val + 10 = ___ + 10 = ___

**Retour dans a :** val = ___
```

```
**a :** retourne val * 2 = ___ * 2 = ___

**Retour dans main :** resultat = ___
```


```
