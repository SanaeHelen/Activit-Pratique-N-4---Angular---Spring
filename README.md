# Activit-Pratique-N-4---Angular---Spring


**Première Partie  :**

   Tout d'abord, nous avons installé Node.js à partir du site https://nodejs.org/en. Ensuite, nous avons installé Angular CLI avec la commande suivante : `npm install -g @angular/cli`. Puis, nous avons créé le projet "FirstApp" en utilisant la commande `ng new FirstApp --no-standalone`. 
   Pour démarrer le serveur Angular, nous avons accédé au dossier "FirstApp" et tapé la commande `ng serve`. Ensuite, nous avons effectué les tâches suivantes.

   - Installation de boostrap :
     
      - Nous avons installé Bootstrap avec la commande suivante : `npm i bootstrap bootstrap-icons`.
     
      ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/863ca352-bb3c-42e2-8b57-d0d4ae6254fe)

      - Nous avons déclaré le module Bootstrap dans le fichier angular.json :
     
      ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/60b9ed36-cf2d-46b5-89a8-2d00d83ba140)


          

   - Création des composants :
     
     - Nous avons créé deux composants, home et products, en utilisant les commandes : `ng g c home` et `ng g c product`.
     
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/5fec184e-5950-48a9-8ab1-34e58a18ce7f)

     - Nous avons déclaré les routes de ces composants dans le fichier app-routing.module.ts.
     
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/388451c7-f121-4e2a-a8ee-98fded118a1a)


     - Dans le fichier app.component.html, nous avons créé deux boutons stylés pour "Home" et "Products" qui changent la vue affichée dans le 'router-outlet' en fonction des liens de routage Angular :
     
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0766934f-e703-4eed-bcf8-0a1f3d22963d)


     - L'affichage :
     
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f0a25b2d-898c-4c26-939f-f8ccfcae7231)
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/1f9058aa-f994-4c79-9358-64302f419c00)
     ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/614171c6-d288-4218-afb3-f7ac32d11b25)







   - Personnalisation des composants :
     
      - le fichier home.component.html :
        
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9a78c0ef-d49c-4121-bf6e-c80084b0396a)
        
      - le fichier products.component.html :
        
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a7c513c5-43ed-4b4e-a208-14c9a47e988e)
        
      - L'affichage : 
               
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0253820a-1fb5-4d1e-8507-fc5cbf2f0c1b)
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7fd16d29-6b76-4833-a5ed-0762481b0aa5)




   - Affichage d'une liste de produits :
     
       - Création d'une liste statique de produits dans le fichier products.component.ts :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/497420fb-1783-4f36-a46f-2b2ceaddd8cd)

       - Création d'une table pour afficher les produits dans le  fichier products.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7a83779f-84e4-41f2-bbc1-f1480a26be69)

       - L'affichage :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7407fddf-7fdd-4636-9f48-92435aefaf9f)


          
          
   - Suppression des produits :
     
       - Création de la méthode deleteProduct() dans le fichier products.component.ts :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c12e3007-2331-44f2-b019-c62cbb81fe65)

       - L'ajout d'un bouton "Delete" dans le fichier products.component.html, avec une classe "btn btn-danger" qui appelle la méthode deleteProduct(p) lorsqu'il est cliqué, pour chaque produit de la liste affichée dans le tableau :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/878c4dbe-f956-47ba-9c81-bc65ab6d69be)

       - L'affichage :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9997b96b-6d9a-4b0c-b20b-763a92f40b05)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/dd77ccc1-2921-45d9-8b4b-51c5a2afa230)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0c70c88e-1f8d-4f54-a09e-797958951799)










   - Chercher un produit :
     
        - Création d'une formulaire pour ajouter le champ de recherche dans le fichier products.component.html :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/5f7b7477-5ac8-4bbd-98d7-39febd9fe612)

        - L'importation des modules pour l'utilisation des formulaires , dans le fichier app.module.ts  :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/24834fb1-3741-49f2-bc84-cd6c19cf009f)

        - Création de la méthode serach() dans le fichier products.component.ts :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/85bcf825-2588-46e3-ab56-97f59b30fa06)

        - L'affichage :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3b6269ec-c6b9-4167-961d-307953f5d12c)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/dd6fa38a-6ddc-4fc9-add5-0649c5b4134a)


   - Mettre en évidence l'onglet actif :
     
      - Création dans le fichier app.component.ts des méthodes de navigation vers les routes "home" et "products", avec mise à jour de la propriété currentRoute :
        
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/6c11b1cd-cc9f-4b7e-8de4-a22f1d65c939)

      - L'ajout dans le fichier app.component.html le déclenchement des méthodes de navigation vers les routes correspondantes, tout en appliquant les classes CSS dynamiquement en fonction de la route actuelle :
        
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0354b71f-1a1c-41e1-bc12-9c7c0dd1f155)

      - L'affichage :
        
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3cb17ec4-0ade-479f-ab32-49a969fd5449)
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2c517b4c-7616-4415-a258-4afff6e8c3fa)


   


**Deuxième Partie :**

   Après avoir créé un nouveau projet Angular avec la commande "ng new Angular_SecondApp", nous avons installé Bootstrap et Bootstrap Icons avec la commande "npm i bootstrap bootstrap-icons". Ensuite, dans le fichier angular.json, nous avons ajouté les liens indiqués dans la capture d'écran ci-dessous dans les sections styles :[] et scripts : [] :
   
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c3197920-a22a-4e39-8852-32854b4866a8)



Dans le fichier style.css on a ajouté la ligne suivante : 

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/33a31d92-40ae-4091-980a-0d7f22459441)


Ensuite, nous avons effectué les tâches suivantes :

   - Création des composents :
     
       - Nous avons créé trois composants : Home, Products et New Product, en utilisant les commandes suivantes : 'ng g c home', 'ng g c products' et 'ng g c new-product'.

     
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/fbc134fd-0b01-4bf9-ba24-684794e8c5f7)
     

       - Dans le fichier app.routes.ts, nous avons défini les routes des composants.
    
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f6a2899a-7444-4a27-a121-b21c44339613)
         

       - Dans notre fichier app.component.ts, le composant racine AppComponent gère une liste d'actions de navigation représentée par un tableau d'objets contenant des titres, des routes et des icônes, et définit la méthode setCurrentAction() pour mettre à jour l'action actuelle lorsqu'un bouton est cliqué.
    
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7ee6e6f0-aed1-44be-9667-9be680c6d2ea)
         

       - La vue app.component.html contient une barre de navigation <nav> avec des boutons générés dynamiquement via *ngFor, liés chacun à une route spécifique avec routerLink. Les classes des boutons sont déterminées dynamiquement selon l'action en cours, et <router-outlet> est utilisé pour afficher les vues des différentes routes de l'application.
    
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e5c0a586-2928-4c1e-9e99-ffca420193de)
         

       - L'affichage :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/46ed182c-c8c4-4d94-b75b-dc8afcf75460)


      
   - Création de la base de données :
   - Création d'un service : 
   - Affichage des produits :
   - Supprimer un poduit :
   - Chercher un produit :
   - La pagination des produits : 
   - Modifier un produit :
   - wscsaojsojc :
   - svnvqevnsaksvq
   - veoemadenv
   - dvvslvmslmv
   - knvsjdbvjbdvj
   - svjbsakbkbvlsbvjd
   - sknksdkbvjsdbv
   - sjbvkebksbjcnmmnsnvknv
   - scksnckscns
   - 




Troisième Partie : Spring Angular

Objectif : 
Développer une application qui permet de gérer le payement des étudiants. Chaque étudiants peut effectuer plusieurs payements
- Chaque étudiant est défini par son : id, firstName, lastName, email, sa filière, sa photo,
- Chaque Payement est défini par son id, son code, sa date, son type (CASH, CHECK,TRANSFER), son status (CREATED, VALIDATED, REJECTED), file (fichier pdf représentant le reçu de payement)

A: Développer et Tester la partie Backend avec Spring. :  
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
