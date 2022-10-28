# Examen Blanc Design Pattern et Programmation Orientée Aspect
 ## 1. Etablir un Diagramme de classe du modèle en appliquant les design patterns appropriés en justifiant les designs patterns appliqués. 

![alt text](images/img.png)

### explication 
Pour donner la possibilité de Créer un groupe de figures. Chaque groupe peut contenir d’autres
groupes. on utilise Pattern Composite

![alt text](images/img_2.png)

Pour assure qui nous introduisons un Objet Paramétrage dont l’état est défini par attributs par défaut comme
l’épaisseur du contour, la couleur du contour et la couleur de remplissage. On voudrait qu’à
chaque fois que l’état de cet objet change, toutes les figures doivent être notifiées pour se
mettre à jour. on utilise Pattern Observer

![alt text](images/img_1.png)

Pousr assure Une méthode « traiter » qui permet de traiter le contenu du dessin en utilisant une
famille d’algorithmes qui sont interchangeables dynamiquement. Ce signifie qu’au
moment de l’exécution, l’objet dessin pour changer d’algorithme avec un autre de la
même famille. Chaque algorithme peut évoluer indépendamment de la classe dessin
qui les utilise. on utilise Pattern Strategy
![alt text](images/img_3.png)

 ## 2. Faire une implémentation du modèle en utilisant un projet Maven sans prendre enconsidération des aspects techniques.
La structure de notre application
![alt text](images/img_4.png)

## 3. Effectuer des Tests du modèle
==> Test
![alt text](images/img_5.png)
==> Resultat
![alt text](images/img_6.png)
 ==> Serialized file
![alt text](images/img_7.png)





