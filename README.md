[![Maven CI](https://github.com/TheoGicquel/Tamagotchi-Simulation/actions/workflows/maven.yml/badge.svg)](https://github.com/TheoGicquel/Tamagotchi-Simulation/actions/workflows/maven.yml)
![](https://img.shields.io/badge/Coverage-41%25-83A603.svg?prefix=$coverage$)
![](https://img.shields.io/badge/successful%20tests-78-83A603.svg?prefix=$coverage$)
# EggFriend

Projet de groupe de réalisation d'un [Tamagotchi](https://en.wikipedia.org/wiki/Tamagotchi) sous Java
## Membres
* **Théo Gicquel** : architecte logiciel, chef de projet, gestionnaire de la qualité
* **Ryan Barrault** : développeur
* **Emilie Kermorvant** : analyste besoin
* **Corentin Quiniou** : chef de projet, analyste de besoin
## Documentation
* [Cahier des charges](https://docs.google.com/document/d/1CRq8gfZVj4WrMXI6eR8T7Iw_RYOO4IuYPifF_Ejfh94/edit?usp=sharing)
* [Dépôt GIT](https://github.com/TheoGicquel/Tamagochi-Simulation)
* [Diaporama de soutenance](https://docs.google.com/presentation/d/1CMQYeZqiHejnTpLuLi8jmTGkGIywHEuxQ0kgC7GOHSM/edit?usp=sharing)
* [Rapport Final](docs/livrable_final/livrable_final.pdf)

## Prérequis
* La version 1.8 de l'environnement d'éxecution Java est requis.
## Téléchargement
* [Dernière version disponible de l'éxecutable Jar](https://github.com/TheoGicquel/EggFriend/releases/latest)
## Compilation
### Prérequis
* un JDK supérieur ou égal a 1.8 (>mars 2014)
* [Apache Maven](https://maven.apache.org/)
### Compilation
* Aprés avoir copié le dépôt logiciel, effectuez dans le répertoire source :
  ```bash
  mvn compile
  ```
* Pour produire l'éxecutable Jar :
  ```bash
  mvn clean package
  ```
### Validation des tests unitaires
```
mvn test
```
Un rapport de test complet ainsi qu'un rapport de coverage Jacoco est trouvable dans le dossier `/target`
