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
    
            
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e41da5ba-6399-4296-9bf8-634374be6926)

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/46ed182c-c8c4-4d94-b75b-dc8afcf75460)


      
   - Création de la base de données :
     
        - Pour créer notre base de données, on doit créer un dossier dans notre projet appelé "data". À l'intérieur, on crée un fichier nommé "db.json" où on spécifie nos données de produits.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/145f7880-f16d-49e0-a803-4205e073d1af)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b51292d9-b3fd-4ff6-95bd-60fdc18efa56)


        - Pour démarrer JSON Server, on utilise la commande suivante : `json-server -w data/db.json -p 8089`:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/269492c6-eb35-417f-abfc-ab8760ce9513)


   - Création d'un service :
     
       - On a créé un service en utilisant la commande suivante : `ng g s services/products`.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ee3788a4-3b38-4dc9-b118-035c7d9da553)


   - Récupérer la liste des produits :
     
       - Pour afficher la liste des produits en cliquant sur le bouton Products, on envoie une requête HTTP au backend via le module HttpClient dans product.service.ts. Ce service Angular injectable gère les opérations CRUD pour les produits avec la méthode getProducts() pour récupérer la liste, utilisant un observable pour une gestion asynchrone des données et des erreurs.

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b6058b1e-1830-45e3-861f-b0170f2c9be0)

       - Dans products.component.ts, le ProductsComponent gère l'affichage et la manipulation des produits. Sa méthode ngOnInit() appelle getProducts() du service ProductService pour charger la liste des produits via une requête HTTP.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/356bf965-d53f-4a76-8d58-6bdd8da38695)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/d705b511-474d-4da0-8183-d8915ee54536)



   - Vérifier un produit :
     
        - La méthode checkProducts() dans le fichier product.service.ts :

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/65553b03-6580-462f-a903-ac9db43ebc64)


        - La méthode handleCheckProduct() dans le fichier products.component.ts  :
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b270e679-10b8-42c9-8e91-d5f8d9d32238)

   - Supprimer un poduit :
     
        - La méthode deleteProducts() dans le fichier product.service.ts :

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c41c7bb1-2bee-4fc4-a244-db5be759e0bc)



        - La méthode handleDelete() dans le fichier products.component.ts  :
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e8899e2e-243b-483d-bdd4-d137df2eb42b)

   - Affichage du produit :
     
        - Le fichier products.component.html utilise la directive *ngFor pour afficher une liste de produits dans une table avec des colonnes "Name", "Price" et "Checked". Chaque produit est représenté par un bouton pour la vérification et la suppression, avec des icônes dynamiquement ajustées selon l'état de vérification du produit.
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bd2b7acd-a586-4f02-b544-6e852987578d)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a8bd8204-0040-4562-b579-8849f2f0616f)

   - Ajouter un produit :

        - La méthode saveProduct() dans le fichier product.service.ts :
          
          Cette méthode utilise le protocole HTTP pour  envoyer une requête POST au serveur backend, spécifiquement à l'URL 
 "http://localhost:8089/products", pour enregistrer le produit fourni en tant que paramètre. Le produit est envoyé au format JSON.

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c8c535b7-6601-4cd3-b771-2f140d97dd45)


            
        - Le fichier new-product.component.ts :

            Le fichier ‘new-product.component.ts’ définit le composant Angular ‘NewProductComponent’ pour la création de nouveaux produits, intégrant l'initialisation du formulaire avec validation et l'enregistrement des produits via ‘ProductService’ lors de la soumission du formulaire.
    
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/8ef1e5ca-e814-4224-9e16-5f4b13faa9f7)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f3d0ee52-1b93-40b3-a29a-c656b4824b4e)


        - Le fichier new-product.component.html :
          
            Le fichier ‘new-product.component.html’ définit le template HTML du composant ‘NewProductComponent’, incluant un formulaire de création de produit avec des validations et des gestionnaires d'événements Angular comme ‘(ngSubmit)’ lié à la méthode ‘saveProduct()’ du composant.
    
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7edc4987-c6b4-4ea5-9d81-6c614b5884b8)


        - L'affichage :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/d22319d2-a4a1-4535-a115-916d0f5cb03c)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/be3c226f-7e6d-4d36-854d-6061bdd1fb8d)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e6409bc7-e556-4a2c-ad40-44a696acd4f8)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bb813aa4-ac2d-4891-98cf-12a5fffb0b24)





   - Chercher un produit :
     
       - La méthode searchProducts() dans le fichier product.service.ts permet d'effectuer une recherche de produits en fonction d'un mot-clé spécifié. En utilisant une requête HTTP GET, elle communique avec l'API de produits en incluant le paramètre name_like dans l'URL.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b8cfe9e5-93ac-42b1-bf25-2da1b510f2d3)


       - La méthode searchProducts() est définie dans le composant product.component.ts. Elle utilise le service productService pour effectuer une recherche de produits en fonction du mot-clé spécifié dans la variable keyword.
    
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2b3496b9-ac2f-4e03-acb9-3134d38479bb)


       - Le code HTML extrait du fichier `product.component.html` crée une barre de recherche de produits avec un champ de texte et un bouton de recherche.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3438a920-38dd-4c96-86eb-ac39a05a0bec)


       - L'affichage :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b3224b2e-a816-4220-a4b7-454c84be29d6)

   - La pagination des produits :
     
       Pour mettre en œuvre la pagination, les méthodes getProducts() des fichiers product.service.ts et product.component.ts ont été mises à jour.

        - La méthode getProduct() du fichier product.service.ts:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/6569578d-b3aa-4acb-baab-c8107982bae9)

        - La méthode getProduct() du fichier product.component.ts:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7e80c2f1-1afe-401a-b672-9548b9751218)

        - Le fichier product.component.html:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ae42f264-f99e-4c35-94b7-ad07e73774df)

        - L'affichage :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bfb38a5a-9639-40fa-8d9a-cd57119b7966)


       Nous avons apporté une modification significative en renommant la méthode getProduct() en searchProduct() afin de mieux refléter sa fonctionnalité, qui consiste à rechercher des produits en fonction d'un mot-clé donné. Cette modification a été implémentée à la fois dans le fichier product.service.ts et dans le fichier product.component.ts.

     
        - Dans le fichier product.service.ts, la méthode searchProducts() a été mise à jour pour accepter un paramètre supplémentaire keyword, qui représente le mot-clé à rechercher :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/8ead9255-e9e9-48b1-8f0c-81a9a98ed183)


        - Dans le fichier product.component.ts, la méthode searchProducts() a également été mise à jour pour inclure le paramètre keyword lors de l'appel à la méthode searchProducts() du service productService.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ca035904-660e-4318-b836-b67984c8424f)


        - L'affichage :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/6ca27744-6a2b-4cbc-b45a-d8b85035a919)


      


   - Modifier un produit :
     
        - Tout d'abord , dans le fichier product.component.html, un bouton a été ajouté pour chaque produit, permettant de déclencher l'édition de ce produit. Ce bouton est lié à la fonction handleEdit() définie dans le fichier product.component.ts.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/225ce8d7-215d-42b0-be15-bc30f967fd6e)


        - Ensuite, nous avons créé un nouveau composant Angular appelé edit-product à l'aide de la commande ng generate component edit-product . Ce composant est destiné à fournir une interface pour la modification des produits.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/52238289-d7e5-49a9-b7a3-65b9842aa4ee)


        - La fonction handleEdit() dans le fichier product.component.ts est responsable de la navigation vers la page de modification (editProduct) avec l'identifiant du produit à éditer :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a9cb3d5f-5ece-419c-aae2-cad5d514fd2b)


        - Pour prendre en charge cette nouvelle route, nous avons ajouté la définition de la route editProduct/:id dans le fichier app.routes.ts :
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/71f9ad2f-f5c8-44d2-b594-c284fa17289d)


        - La méthode getProductById() du fichier product.service.ts, envoie une requête HTTP GET au backend pour récupérer les détails d'un produit spécifique.
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7c5dc1d6-2255-4b83-b253-94893b14a9d0)

 
        - La méthode updateProduct()  du fichier product.service.ts, est utilisée pour mettre à jour les informations d'un produit existant sur le backend.
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a3ab48ab-5cd4-4e0a-aafa-8e504d3d86a2)


        - Le fichier edit-product.component.ts : Dans cette méthode `ngOnInit()`, nous initialisons le composant en extrayant l'identifiant du produit à partir de l'URL, puis récupérons les détails du produit via `ProductService`, construisons un formulaire réactif avec `FormBuilder`, ajoutons des validations, et gérons les erreurs de récupération en affichant les messages dans la console.
    
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4e1f0b8a-b82c-4faf-a67f-f30439558405)


        - La méthode updateProduct() du fichier edit-product.component.ts ,  est responsable de la mise à jour des informations d'un produit dans l'application Angular.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/36e79e90-1972-46c4-89ba-159baf473e4f)


        - Le fichier edit-product.component.html : Ce fichier HTML constitue le formulaire de modification d'un produit dans l'application.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/66ede44d-03fd-4b54-8b55-4cd193ef557b)
 
        - L'affichage :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/25c37ec2-2bc8-4ff4-8676-80217c0aa13e)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ca914fb0-256a-45bb-9fe6-7946fe77dad3)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c0425769-770f-4e85-865b-2c8f339e399d)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0bded002-9035-4e59-9674-929fdb4ab90d)




   - wscsaojsojc :
   - svnvqevnsaksvq
   -  
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
