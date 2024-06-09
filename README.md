# Activit-Pratique-N-4---Angular---Spring


Première Partie (First Demo) : 

   Tout d'abord, nous avons installé Node.js à partir du site https://nodejs.org/en. Ensuite, nous avons installé Angular CLI avec la commande suivante : `npm install -g @angular/cli`. Puis, nous avons créé le projet "FirstApp" en utilisant la commande `ng new FirstApp --no-standalone`. Pour démarrer le serveur Angular, nous avons accédé au dossier "FirstApp" et tapé la commande `ng serve`. Ensuite, nous avons effectué les tâches suivantes.

   - Installation de boostrap :
      Nous avons installé Bootstrap avec la commande suivante : `npm i bootstrap bootstrap-icons`.
      ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/863ca352-bb3c-42e2-8b57-d0d4ae6254fe)

      Nous avons déclaré le module Bootstrap dans le fichier angular.json :
      ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/60b9ed36-cf2d-46b5-89a8-2d00d83ba140)

     
     

   - nscjdsnkns
   - cndncndnck
   - dcnsncinc
   - bsjcndsnsdnchikdsnh
   - ddjsbsjd
   - dnvsdnvdbvdjoihwir
   - vnvkdnvnd
   - vknvknkvnsd
   - nknvskdnv
 
Deuxième Partie :
Créer une application web Angular qui permet de gérer des produits avec un backend basé sur Json-server

Troisième Partie : Spring Angular

Objectif : 
Développer une application qui permet de gérer le payement des étudiants. Chaque étudiants peut effectuer plusieurs payements
- Chaque étudiant est défini par son : id, firstName, lastName, email, sa filière, sa photo,
- Chaque Payement est défini par son id, son code, sa date, son type (CASH, CHECK,TRANSFER), son status (CREATED, VALIDATED, REJECTED), file (fichier pdf représentant le reçu de payement)

A: Développer et Tester la partie Backend avec Spring. :  https://www.youtube.com/watch?v=oTuAXfD2M1g
   1. Créer les entités JPA
   2. Créer les interfaces JPARepository basées sur Spring Data
   3 . Générer des données aléatoires concernant quelques étudiants et pour chaque étudiants des payements
   4. Créer une Web service RESTful (ResController) qui permet d'exposer les fonctionnalisés suivantes :
        - Consulter tous les payements
        - Consulter un payement sachant son id
        - Consulter les payemenst d'un type donné
        - Consulter les payements d'un status donné
        - Consulter les payements d'un étudiant donné
        - Consulter les payements d'une filière donnée
        - Consulter tous les étudiants
        - Consulter les étudiants d'une filière donnée
        - Consulter un étudiant sachant son code
        - Effectuer un nouveau payement avec les données et le reçu de payement au format pdf
        - Mettre à jour le status d'un payement
        - Consulter le reçu d'un payement  (fichier pdf) 
     5 - Tester le backend en utilisant un client REST (Postman) et avec SWAGGER UI
     6 - Faire un refactoring du code en utilisant la couche service, les DTOs et les Mappers
B : Développer la partie frontend en utilisant Angular avec Angular Material pour la partie design : https://www.youtube.com/watch?v=QqmoMDGr3Ww
     1. Créer un projet angular 
     2. Intégrer Angular Material
     3. Créer une page template contenant un Toolbar avec une barre de menu et un Side Menu
     4. Créer les différents component de l'application
     5. Créer un système d'authentification simple qui oblige l'utilisateur à s'authentifier avant d'accéder à l'application. Dans un premier temps, les utilisateurs et les rôles qui ont le droit d'accéder à l'application sont stockés de manière statique dans le service d'authentification. Protéger les routes par Un Guard d'authentification et un Guard pour les autorisations
     6. Créer les components fonctionnels de l'application :
           - Afficher les payements avec une Pagination frontend
           - Afficher et chercher les étudiants
           - Afficher le Dashboard d'un étudiant (Infos et Payements)
           - Ajouter un nouveau payement en uploadant le reçu de payement
           - Consulter le détail d'un payement
           - Mettre à jour le status d'un payement
  C : Sécurité avec Spring Security et Json Web Token
           - Sécuriser le backend
           - Sécuriser le front end
