# Exercices Java - Algorithmique et Logique

Formation progressive pour développer ta logique et ta capacité à lire et comprendre du code.

## Objectif

Ces exercices t'entraînent à :
- Tracer mentalement l'exécution du code
- Comprendre des architectures complexes
- Débugger par lecture de code
- T'intégrer dans du code existant
- Penser comme une machine, pas comme un humain

## Structure du projet

```
algo/
├── 01-tracage-simple/          # Variables et opérations de base
├── 02-boucles-for/             # Tracer l'exécution de boucles simples
├── 03-conditions-imbriquees/   # Suivre le chemin d'exécution
├── 04-boucles-while/           # Comprendre les différents types de boucles
├── 05-tableaux-indices/        # Manipulation et accès aux éléments
├── 06-fonctions-simples/       # Appels et retours de fonctions
├── 07-effets-de-bord/          # Différence entre modification et retour
├── 08-chainage-fonctions/      # Comprendre le flow d'exécution
├── 09-objets-references/       # Distinction valeur vs référence
├── 10-call-stack/              # Tracer la pile d'appels
├── 11-reverse-engineering/     # Prédire le code à partir du résultat
├── 12-code-mystere/            # Comprendre du code sans nom explicite
├── 13-pattern-recognition/     # Identifier les structures récurrentes
├── 14-bug-hunt/                # Trouver l'erreur par lecture
├── 15-code-incomplet/          # Compléter le code manquant
├── 16-refactoring-mental/      # Simplifier sans modifier le comportement
├── 17-optimisation/            # Améliorer la performance par la compréhension
├── 18-architecture-complexe/   # Multiples fichiers et classes
├── 19-code-legacy/             # S'intégrer dans du code existant
├── 20-challenge-final/         # Synthèse de tous les concepts
└── corrections/                # Solutions (à ne regarder qu'après avoir essayé)
```

**Phase 1 (exercices 01-07)** : Traçage de base  
**Phase 2 (exercices 08-13)** : Architecture et reverse engineering  
**Phase 3 (exercices 14-17)** : Debug et complétion  
**Phase 4 (exercices 18-20)** : Synthèse et maîtrise

## Comment utiliser ce repo

### 1. Lis le guide
Commence par lire [BE_A_BOT.MD](./BE_A_BOT.MD) pour comprendre comment penser comme une machine.

### 2. Fais les exercices dans l'ordre
Les exercices sont progressifs. Ne saute pas d'étapes.

### 3. Lancer un exercice
```bash
cd 01-tracage-simple
javac Main.java
java Main.java
```

## Règles d'or

0. **N'utilise pas internet ni l'ia !** C'est 100% de la logique, si tu utilise des sources externes tu ne progresseras pas.
1. **Ne lance pas le code avant d'avoir tracé** (sauf si l'exercice dit le contraire)
2. **Écris ton traçage** sur papier ou fichier texte (pas dans ta tête)
3. **Prédis le résultat** avant d'exécuter
4. **Compare ta prédiction** avec le résultat réel
5. **Comprends tes erreurs** si tu t'es trompé

## Prérequis

- Java 11+ installé
- Un éditeur de texte
- Du papier et un stylo (sérieusement, c'est important)

## Progression recommandée

**Semaine 1** : Exercices 01-07 (Traçage de base)  
**Semaine 2** : Exercices 08-14 (Architecture, reverse engineering et debug)  
**Semaine 3** : Exercices 15-20 (Complétion, refactoring et synthèse)
