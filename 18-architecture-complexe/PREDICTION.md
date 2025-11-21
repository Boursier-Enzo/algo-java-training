# Ma prédiction - Exercice 18

## Architecture

**Classes présentes :**
- Main → ___
- Banque → ___
- Client → ___
- Compte → ___

**Qui contient quoi ?**
- Banque contient : ___
- Client contient : ___
- Compte contient : ___

---

## Traçage de l'exécution

### Création des objets

**Ligne 3 :** `new Banque("MaBanque")`
- Crée une Banque avec clients[] vide

**Lignes 5-6 :** `new Client(...)`
- Alice créé avec un Compte (solde = ___)
- Bob créé avec un Compte (solde = ___)

**Lignes 8-9 :** `ajouterClient(...)`
- clients[0] = ___, nbClients = ___
- clients[1] = ___, nbClients = ___

---

### Dépôts

**Ligne 11 :** `alice.deposer(100)`
- Appelle compte.crediter(100)
- Alice.compte.solde = ___

**Ligne 12 :** `bob.deposer(50)`
- Bob.compte.solde = ___

---

### Affichage initial

```


```

---

### Transfert

**Ligne 17 :** `alice.transferer(bob, 30)`

Que se passe-t-il dans transferer() ?
1. `this.retirer(30)` → Alice.compte.solde = ___
2. `destinataire.deposer(30)` → Bob.compte.solde = ___

---

### Affichage après transfert

```


```

---

### Total en banque

**Ligne 22 :** `banque.totalDepots()`
- total = ___ + ___ = ___

```

```
