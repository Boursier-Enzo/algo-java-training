# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java-based training program consisting of 20 progressive exercises designed to help learners think like a machine rather than a human. The target audience has already mastered theoretical concepts (variables, conditions, loops, functions, classes/objects) but struggles to reason effectively when reading or writing code.

**Key Philosophy:** This is NOT a theory course. There are no lessons to teach. This is pure practical training focused on different aspects of computational reasoning to train the brain to think like a machine.

## Core Pedagogy

The exercises are built around concepts from `BE_A_BOT.MD`, which identifies common reasoning failures:
- Humans guess, machines execute line by line
- Humans skip steps, machines process every operation
- Humans understand context, machines follow instructions literally
- Variables are "boxes" that get substituted with their values during execution

## Exercise Structure

20 exercises organized in 4 progressive phases:

**Phase 1 (01-07)**: Traçage de base - Line-by-line execution tracing
**Phase 2 (08-13)**: Architecture and reverse engineering - Understanding execution flow and call stacks
**Phase 3 (14-17)**: Debug and completion - Finding bugs by reading, completing missing code
**Phase 4 (18-20)**: Synthesis and mastery - Complex architectures, legacy code integration

## Directory Structure

Each exercise should be in a numbered directory (e.g., `01-tracage-simple/`, `02-boucles-for/`) containing:
- Java source files for the exercise
- Instructions (typically in a README.md or as comments)
- The `corrections/` directory contains solutions (learners should only consult after attempting)

## Development Commands

### Running an exercise
```bash
cd [exercise-directory]
javac Main.java
java Main
```

## Golden Rules for Exercise Design

When creating or modifying exercises, respect these core principles from the README:

1. **Ne lance pas le code avant d'avoir tracé** - Learners must trace execution on paper/file before running
2. **Écris ton traçage** - Written tracing is mandatory, not mental
3. **Prédis le résultat** - Predict output before execution
4. **Compare ta prédiction** - Compare prediction with actual result
5. **Comprends tes erreurs** - Understand mistakes if prediction was wrong

## Exercise Design Patterns

Based on `BE_A_BOT.MD` principles:

- **Traçage exercises**: Force line-by-line execution tracking
- **Reverse engineering**: Provide output, learners deduce the code
- **Code mystère**: Intentionally poorly-named functions to prevent guessing based on names
- **Bug hunt**: Find errors through code reading only (no execution)
- **Effets de bord**: Emphasize difference between mutation and return values
- **Objets et références**: Critical distinction between value vs reference semantics

## Recommended Timeline

3-week progression:
- **Week 1**: Exercises 01-07
- **Week 2**: Exercises 08-14
- **Week 3**: Exercises 15-20

## Prerequisites

- Java 11+
- Text editor
- Paper and pen (seriously important for tracing exercises)

## Important Notes

- Exercises should force "robot stupide" (stupid robot) mode - treating code execution as if understanding nothing about context
- Variable substitution is key: teach learners to mentally replace variables with their actual values during tracing
- Call stack visualization is critical for understanding function chains
- Code should sometimes deliberately use misleading names to prevent reliance on semantic guessing
