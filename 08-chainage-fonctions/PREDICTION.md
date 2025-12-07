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

**a :** reçoit x = 5
```
a: debut avec x = 5
```

**a :** appelle `b(x + 1)` → b(5+1)

**b :** reçoit y = 6
```
b: debut avec y = 6
```

**b :** appelle `c(y + 1)` → c(6+1)

**c :** reçoit z = 7
```
c: debut avec z = 7
c: fin
```

**c :** retourne z * 3 = 7 * 3 = 21

**Retour dans b :** val = 21
```
b: retour de c avec val = 21
```
**b :** retourne val + 10 = 21 + 10 = 31

**Retour dans a :** val = 31
```
a: retour de b avec val = 31
```
**a :** retourne val * 2 = 31 * 2 = 62

**Retour dans main :** resultat = 62
```
main: resultat = 62
main: fin
```
