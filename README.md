# 6QuiPrendKata

## Règles
6QuiPrend est un jeu de cartes (il en comprend 104, numéroté de 1 à 104). Chaque carte vaut un certain nombre de têtes de boeufs en fonction de son numéro.
  - si le nombre est un multiple de 5, la carte vaut 2 têtes de bœufs
  - si le nombre est un multiple de 10, la carte vaut 3 têtes de bœufs
  - si les chiffres des dizaines et des unités sont identiques, la carte vaut 5 têtes de bœufs (sauf pour la carte 100)
  - la carte 55 vaut 7 têtes de bœufs
  - les autres cartes valent 1 tête de bœufs chacune
  
## Setup
  - Forker le projet
  - Importer le projet forké dans IntelliJ Idea : File > New > Project from Version Control > Git > Rentrer l'url du dépôt
  - Clic droit sur le dossier java > Mark Directory as Root Source
  - File > Project Structure > renseigner votre jdk et votre fichier de sortie <VOTRE_WORKING_DIR/out>
  - Run > Edit Configuration > ajouter une Application > Renseigner votre jdk si ce n'est pas déjà fait
  - Pour ajouter JUnit, la façon la plus simple est la suivante : allez dans le fichier java > 6QuiPrendTest > alt-Enter sur un @Test rouge > add JUnit to classpath
  - Implémenter la méthode dans java > 6QuiPrend
  - Jouer les tests dans java > 6QuiPrendTest
  - Pousser sur votre dépôt et m'envoyer le lien par mail avec les noms des contributeurs
