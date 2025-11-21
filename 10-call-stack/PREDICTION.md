# Ma prédiction - Exercice 10

## Phase 1 : Empilage (appels récursifs)

**Appel 1 :** factorielle(4)
- Pile : [main, fact(4)]
- n = 4, n <= 1 ? ___
- Appelle factorielle(___)

**Appel 2 :** factorielle(___)
- Pile : [main, fact(4), fact(___)]
- n = ___, n <= 1 ? ___
- Appelle factorielle(___)

**Appel 3 :** factorielle(___)
- Pile : [main, fact(4), fact(___), fact(___)]
- n = ___, n <= 1 ? ___
- Appelle factorielle(___)

**Appel 4 :** factorielle(___)
- Pile : [main, fact(4), fact(___), fact(___), fact(___)]
- n = ___, n <= 1 ? ___
- Cas de base ! return ___

---

## Phase 2 : Dépilage (retours)

**Retour de fact(1) :** retourne ___
- Pile : [main, fact(4), fact(3), fact(2)]

**Dans fact(2) :** sousResultat = ___
- resultat = 2 * ___ = ___
- Retourne ___

**Dans fact(3) :** sousResultat = ___
- resultat = 3 * ___ = ___
- Retourne ___

**Dans fact(4) :** sousResultat = ___
- resultat = 4 * ___ = ___
- Retourne ___

**Dans main :** resultat = ___


