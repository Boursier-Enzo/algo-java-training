# Ma prédiction - Exercice 09

## Schéma mémoire

Dessine les objets et les références :

```
Après ligne 5 :

p1 ──→ [Objet A: nom=___, age=___]

p2 ──→ ??? (même objet que p1 ou nouvel objet ?)

p3 ──→ [Objet B: nom=___, age=___]
```

---

## Traçage ligne par ligne

**Ligne 3 :** `Personne p1 = new Personne("Alice", 25);`
- Création d'un nouvel objet : {nom="Alice", age=25}
- p1 pointe vers cet objet

**Ligne 4 :** `Personne p2 = p1;`
- p2 pointe vers ___ (nouvel objet / même objet que p1)

**Ligne 5 :** `Personne p3 = new Personne("Alice", 25);`
- p3 pointe vers ___ (nouvel objet / même objet que p1)

**Lignes 7-9 :** Affichages
```



```

---

**Lignes 11-12 :** Modification via p2
- p2.nom = "Bob"
- p2.age = 30

**Question : p1 est-il affecté par ces modifications ?** ___

**Question : p3 est-il affecté par ces modifications ?** ___

---

**Lignes 14-17 :** Affichages après modification
```




```

---

**Lignes 19-20 :** Comparaisons de références
- p1 == p2 → ___ (comparent-ils la même adresse mémoire ?)
- p1 == p3 → ___ (comparent-ils la même adresse mémoire ?)

```


```
