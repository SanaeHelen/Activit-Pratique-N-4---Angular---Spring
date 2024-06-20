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




   - Création du servie app-state :
     
        - Nous avons créé le service app-state en utilisant la commande : `ng g s services/app-state`.
          
        - Le service a une propriété appelée productsState qui contient l'état des produits :
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/d05d78a4-f85d-4ef3-9685-e193dcbbefe4)


        - La méthode setProductState(state:any) pour mettre à jour l'état des produits.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/df2ceca1-85f7-4d76-9458-cf417bde4d08)


        - Le fichier product.component.ts:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7c911a4f-0150-4234-9378-3c132bdad2f3)


        - Le fichier product.component.html:
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bed5c17f-b6b4-4f9c-b726-5c69e6069ed2)

          
   - Création du composant dashboard :
     
       - Nous avons créé le composant dashboard en utilisant la commande : `ng g c dashboard`.
         
       - Le fichier dashboard.component.html: affiche des informations résumées sur les produits de l'application. Il utilise le service AppStateService pour accéder à l'état des produits et affiche le nombre de pages, la taille, le total de produits et le nombre de produits sélectionnés.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ee2529af-3eb6-4e9a-a4c7-581999015297)


       - L'affihage :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2b6b913a-df86-4447-b7bf-45f098436bac)

   - Création du composant navbar :
     
        - Nous avons créé le composant navbar en utilisant la commande : `ng g c navbar`. Ce composant Angular qui représente la barre de navigation de l'application. Il contient des boutons pour accéder à différentes parties de l'application et affiche un spinner de chargement lorsque nécessaire.
          
        - Le fichier navbar.component.ts :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b7c096af-27c0-4a7f-8b8c-4645e579b1d9)

        - Le fichier navbar.component.html :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3dc5e6c8-61b5-495d-a83d-6cca194964ca)

        - L'affichage :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4bf3080b-92f9-42d5-be04-4b176956e2aa)

     
   - Création du composant app-errors :
     
        - Nous avons créé le composant app-errors en utilisant la commande : `ng g c app-errors`. Ce composant Angular affiche les erreurs de l'application lorsque le statut est "ERROR". Il utilise le service AppStateService pour récupérer les informations sur l'erreur à afficher.

        - Le fichier app-errors.component.ts :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/131eb36b-c67d-4ba2-bde5-a15fe5743955)

        - Le fichier app-errors.component.html :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/db0012fb-e6a9-4b53-afff-8cb4b824ab03)

        - L'affichage :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/135fc0b8-1981-4d7e-b452-c8be8a8a7d21)

   
   -  Création de l’intercepteur HTTP app-http :
     
       - Nous avons créé l’intercepteur HTTP app-http en utilisant la commande : `ng g interceptor app-http`. Cet intercepteur HTTP AppHttpInterceptor gère l'ajout d'un en-tête d'autorisation aux requêtes sortantes et contrôle  l'affichage du spinner de chargement pendant la durée de la requête grâce aux services AppStateService et LoadingService.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a32e3741-21f9-4727-9a43-fa7b10619ea6)



      
   - Création du servie loading :
     
       - Nous avons créé le service loading en utilisant la commande : `ng g s services/loading`. Ce service utilise un observable (isLoading$) pour gérer l'état du spinner de chargement dans l'application. Il fournit des méthodes showLoadingSpinner() et hideLoadingSpinner() pour afficher et cacher le spinner en émettant des valeurs booléennes.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/89419679-516f-4726-8bf1-02c28d4b6bf4)


         
   - Création de la page login:
     
       - Nous avons créé le composant login en utilisant la commande : `ng g c login`.
         
       - Le fichier login.component.html : On crée la partie html de la page login avec les deux champs username et password :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/1571145c-e3d7-4b9b-adff-c09eb4ca6ce6)


       - Le fichier login.component.ts : crée un formulaire de connexion avec deux champs (username et password) et une méthode pour gérer la soumission du formulaire et afficher les valeurs entrées dans la console.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4b366ca4-968c-45cc-8408-fffd8273730d)


       - Le fichier app.routes.ts :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a4038ae7-ca0e-4b57-93c3-28496862f0ba)

       - L'affichage :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/d623b039-5b0f-4e2e-b5f5-b63ac279fc72)

   - Création de la template admin :
     
       - Nous avons créé le composant admin-template en utilisant la commande : `ng g c admin-template`.
         
       - Le fichier admin-template. component.html  :  le navbar et le dashboard ne s’affiche que lorqsue on est connecté.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3cc846a4-6fd9-41a3-9bce-88f21ddd2e4f)


       - Le fichier app.component.html : on met seulement router-outlet pour ne pas afficher rien que le formulaire:
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/6c664d5a-4f83-4be7-9630-ade7aa5c03c3)
         

       - Le fichier app.routes.ts : On a fait quelque modifications au niveau des routes pour rendre quelques pages accessibles seleument aprés la connexion .
         
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ef7b2a87-f562-43d2-be3c-7594de7660ef)


       - La méthode handlelogin() :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/85fc9c55-0331-4323-a1c1-82a342cccf86)
     
       - Le fichier navbar.component.ts :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0f87c025-96ae-41b8-b110-507583da0de3)

       - La création de quelques utilisateurs pour la connexion avec token jwt.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0b781d11-0bcd-403e-b859-57fc10d7f57e)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/1344cca9-cfb1-4510-9043-5a38462bb70f)



            

   - Création du servie auth :
     
        - Nous avons créé le service auth en utilisant la commande : `ng g s auth`.
          
        - Le fichier auth.service.ts :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/27285d4b-d81b-4bc3-a1d4-973681943797)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c91ed378-669e-4c4b-ba8a-89b71a316be5)


        - L'installation du package jwt-decode via la commande : `npm i jwt-decode`.
          
        - Dans le fichier auth.service.ts, nous importons Injectable pour l'injection, HttpClient pour les requêtes HTTP, firstValueFrom pour gérer les Observables, AppStateService pour l'état global, et jwtDecode pour décoder les tokens JWT.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/18c4eb02-6fe6-4379-900b-b7d9dd86eba8)

        - La méthode login() dans le fichier auth.service.ts :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a3f850e5-c5cd-4ca6-8718-a0f355c41be2)

        - le fichier login.component.ts : on a ajouté la variable errorMessage pour capturer et afficher les erreurs lors de la tentative de connexion de l'utilisateur.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/96a3dc1c-0ec2-42ce-af6c-ec12edb99815)

            
        - La méthode handleLogin() :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ca1446a6-4f37-4c25-b558-0f2b5fc8fe1f)


        - Le fichier login.component.html : On a ajouté une alerte qui affiche les messages d'erreur lorsqu'une tentative de connexion échoue.
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9ca0d013-fef3-4248-a816-1d7efd0a3079)


        - L'affichage :
          
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9d2894ac-f581-4d3e-9f14-788257eeec73)


   - Affichage de l'Utilisateur dans la Barre de Navigation :
     
       - Le fichier navbar.component.html : On a ajouté des conditions pour afficher le nom de l'utilisateur et un bouton de déconnexion si l'utilisateur est authentifié, sinon un bouton de connexion apparaît pour
les utilisateurs non authentifiés.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/857a3ad5-cd04-4a58-887d-3d98a031d75d)

       - Le fichier navbar.component.ts : on a ajouté les méthodes logout() et login().
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/89ff9bd7-28a5-4366-b605-e34217fad386)

       - L'affichage :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/cab55e92-cf91-43b9-8e50-6d60c35e6b24)


   - Protection des routes :
     
       - Nous avons créé deux gardiens Angular, AuthenticationGuard et AuthorizationGuard avec les commandes `ng g g guards/authentication` et `ng g g guards/authorization` , pour sécuriser les routes en vérifiant
l'authentification et les autorisations des utilisateurs .
 
       - La classe AuthenticationGuard : on a implémenté la méthode canActivate() pour vérifier si l'utilisateur est authentifié.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b44fed18-5926-4c09-8b54-3e74acf547e3)

       - La classe AuthorizationGuard : la méthode canActivate vérifie si les rôles de l'utilisateur correspondent aux rôles requis de la route.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7b0601ce-f7bf-4302-bddc-d41ba6fbdb9e)

       - Nous avons créé le composant not-authorized avec la commande : `ng g c not-authorized`, pour afficher une page d'erreur lorsque les utilisateurs tentent d'accéder à des routes pour lesquelles ils n'ont pas les autorisations nécessaires.
         
       - Le fichier not-authorized.component.html : affiche le message "You are not authorized" pour signaler un accès refusé.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/cea193c8-9f95-48d9-871e-ef2d9d92dc2e)

       - Le fichier app.routes.ts : On a défini les routes sécurisées par AuthenticationGuard et AuthorizationGuard. La route notAuthorized redirige vers une page spécifique lorsqu'un accès non autorisé est
détecté. AuthenticationGuard vérifie si l'utilisateur est connecté, tandis que AuthorizationGuard contrôle les permissions pour accéder aux routes administratives.

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/36bdfabb-9166-4f4f-92db-a587f5e771fe)


       - Si un utilisateur sans droits d'admin essaie d'accéder aux sections d'ajout ou de modification de produits, le message "You are not authorized" s'affiche comme suit :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9506c1d0-62b5-44e3-8bcc-731fd07151cb)


       - Le fichier products.component.html : On a utilisé des conditions *ngIf pour afficher les boutons d'édition, de suppression, et de vérification uniquement si je possède le rôle 'ADMIN'. Cela assure que
seuls les administrateurs peuvent modifier, supprimer ou vérifier les produits.

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/047ed057-3415-46af-855e-7d5bfe1813fc)


       - L'affichage :
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/72a370d9-fa55-4c8e-b033-e60b62e2717e)




**Troisième Partie : Spring Angular**


A: Développer et Tester la partie Backend avec Spring. :  

  1. Créer les entités JPA :
      
        - Payment : Cette entité capture les détails d'un paiement effectué par un étudiant.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/adce535a-be44-4645-aa04-c77403f6fa0b)

        - PaymentType : Cette énumération définit les différents types de paiements possibles.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/192e899f-2843-4235-8445-a0dd71f50b28)

        - PaymentStatus : Cette énumération représente l'état d'un paiement.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/fc621e98-e228-4153-8a14-8dcbb597426a)

        - Student : Cette entité représente les informations d'un étudiant, y compris des détails personnels et d'identification.
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/774bf6c5-cae3-4c22-9f68-bffbff72bff9)

   2. Créer les interfaces JPARepository basées sur Spring Data :
      
        - PaymentRepository : Ces méthodes permettent de rechercher des paiements selon le code de l'étudiant, le statut du paiement ou le type de paiement.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/46b5fdb9-3efe-4beb-aa61-d4844f2bbeec)

        - StudentRepository : Ces méthodes permettent de rechercher des étudiants en fonction de leur code d'identification ou de l'identifiant de leur programme.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/44f577ce-7829-4220-ac0e-8631a82adbd3)

   3. Générer des données aléatoires concernant quelques étudiants et pour chaque étudiants des payements : 
   
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e1f4df33-a8f3-473c-838d-0873977bd980)
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/451c47bc-3d4b-4706-9069-2d2b73ed9376)


   4. Créer une Web service RESTful (ResController) qui permet d'exposer les fonctionnalisés suivantes :
      
        - Consulter tous les payements : localhost:8021/payments
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4e214c8e-b96f-47d5-b13b-8e045b514f85)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0a4dca2d-d9a4-4978-b3a6-52c4c56edb19)


        - Consulter un payement sachant son id : localhost:8021/payments/1
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4f5b5053-da7d-425d-b87d-cfd2b17453d6)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/d9529d2b-7db5-4c46-8864-5db5dd0891fe)


        - Consulter les payemenst d'un type donné : localhost:8021/payments/byType?type=DEPOSIT
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/69efb62b-f0dc-4f95-9010-828de0e775a5)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ec0db177-87e0-4a61-948f-1b37c436580c)


        - Consulter les payements d'un status donné : localhost:8021/payments/byStatus?status=CREATED
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/25588b9b-d10f-4380-865c-ffdff9e035c1)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0db7fe65-8fed-4097-a2bc-b9b5583337ca)


        - Consulter les payements d'un étudiant donné : localhost:8021/students/112255/payments :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/5a89b6aa-a1f7-462a-b39e-9fbc133058f1)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a9a4ca8a-ffdd-41e7-aaeb-9e4b5aca2608)


        - Consulter les payements d'une filière donnée: localhost:8021/payments/byProgramId?programId=IAAD
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/1eb214b0-1afd-4608-b229-b5b014f97a8b)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b2992c45-5cff-4493-b1b9-56abd357e8be)


        - Consulter tous les étudiants : localhost:8021/students
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/add3607a-085e-4a3f-b629-dff0dc681cd8)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a887236b-b310-4c89-a775-f089f3ad5f7b)


        - Consulter les étudiants d'une filière donnée : localhost:8021/studentsByProgramId?programId=IAAD
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4e002d03-bbf3-40dc-9b24-8b65dc6f76b9)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9d4fc260-4d78-4fa0-adb2-afec65adb1c1)


        - Consulter un étudiant sachant son code : localhost:8021/students/112233
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/30e423ff-46cb-421d-bab6-b084762638ea)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/68cdeaf4-a1ab-48f4-9b33-5532e9677767)


        - Effectuer un nouveau payement avec les données et le reçu de payement au format pdf :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/50348030-75cd-4979-90e2-ed452ddb7a54)

        - Mettre à jour le status d'un payement :
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/1dc5f1b4-aaaa-451d-b84f-bfd548f11489)

        - Consulter le reçu d'un payement  (fichier pdf) :
          
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f6601938-afbd-4269-9665-4ce37ae683b4)

5. Tester le backend en utilisant un client REST (Postman) et avec SWAGGER UI :
   
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/90b1c415-5464-4aea-9bf0-61660391bdf9)

        
   On accède à http://localhost:8021/swagger-ui/index.html pour visualiser la documentation interactive de l'API, explorer les différents endpoints disponibles et tester les requêtes directement via l'interface utilisateur de Swagger.

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2bd84979-bd1a-4c06-acd7-7a2a691daae1)

   On teste la mise à jour du statut d'un paiement avec l'ID 1 en exécutant :

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/20545fdc-b158-49ac-9402-287044011bbe)

   On teste la création d'un nouveau paiement, en incluant les données requises et en attachant le reçu de paiement au format PDF.

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0bd3bbba-ac3e-4867-987f-a4b29c51e7c5)
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2ac25b03-8212-445c-b479-0a938e4e4b76)

   Et pour récupérer le fichier associé à un paiement spécifique :

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a933bdba-b2bd-4c9c-bf46-91ca8e1dcd07)

   On accede a http://localhost:8021/payments/41/file pour voir le file 






 6. Faire un refactoring du code en utilisant la couche service, les DTOs et les Mappers 

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/54dd7e20-8362-4aa2-8563-e1623833ab74)
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/131665f2-30c8-4901-803c-ae3a33a2cd3f)
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3f2c8248-7ab5-4f1e-9333-e47272beb6fb)

   En PaymentRestController : On crée dtos/paymentDTO :

   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/5798d605-e170-4ae3-8e22-2c7dfc3f20ce)
   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/82008842-4552-43b9-8984-9e9462569ad0)





B : Développer la partie frontend en utilisant Angular avec Angular Material pour la partie design :


   1. Créer un projet angular :
      
        La première commande pour créer le projet frontend angular et la commande pour installer le matériels  : 
                           ng new frontend-ang-app --directory=./ --no-standalone
                           ng add @angular/material

   2. Intégrer Angular Material
        La commande pour créer le component admin-template  :  ng g c admin-template

   3. Créer une page template contenant un Toolbar avec une barre de menu et un Side Menu :
      
        Le fichier Admin-template.component.html :
      
         ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/cfd18b3d-810f-43a0-8a22-24aafe877204)
         ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4ec997e3-2fff-4a7b-9999-a6103f6ac7e0)


   4. Créer les différents component de l'application :
      
       - Creation des composant :
            ng g c login    
            ng g c students
            ng g c dashboard
            ng g c payments
            ng g c home
            ng g c profile
            ng g c load-students
            ng g c load-payments
      
       - Ensuite on a defini les routes qui définissent les chemins et les composants correspondants pour la navigation dans une application Angular.
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b9130456-1184-4e79-abf5-59adb71b42e4)

       - Mettre à jours la page hom.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9239b533-1cd8-47bd-8015-08c2dee8b314)

       - Création de la classe container dans le dossier css:
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/ecd23bb8-bfbf-47cf-997c-ce125db4e42a)

       - la page load-students.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/82db7b41-e5b8-44d0-868f-e123670f3ab0)

       - la page payments.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bffe7ca4-6752-4cbc-9363-fee2c956bc72)

       - la page profile.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/06775e6b-2fe0-4f66-a781-4845285cb7d6)

       -  la page students.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3300340a-5f62-457c-955c-3c2dae978a7c)

       - Mettre à jours la page app.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/56e4e87e-0eca-4755-982c-91d96368f1a8)

       - la page Dashboard.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/880ec769-0146-4a7a-8eaf-7ad2f9fd5eff)

       - Changement des routes :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/0b955ee0-2542-497c-965b-d0b937f14baf)

       - L'affichage :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/777ed844-1a30-41f8-96da-7ca5905e647c)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/4870c10a-98d2-4527-b534-9c796a822564)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/67414dbf-babc-4eb1-b8aa-a1986dc0c551)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3c5d94bc-96db-415a-90dd-1049ed10f595)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b00bc353-132e-4fc2-99d1-a491e94bbdfe)





         
      

   5. Créer un système d'authentification simple qui oblige l'utilisateur à s'authentifier avant d'accéder à l'application. Dans un premier temps, les utilisateurs et les rôles qui ont le droit d'accéder à l'application sont stockés de manière statique dans le service d'authentification. Protéger les routes par Un Guard d'authentification et un Guard pour les autorisations.

       - La page d’Authentification:
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/91cc9620-5a4b-4738-8263-d14a831e3ca5)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/98025719-67a1-447e-a7fd-f7120ac2ccea)


       - Le fichier Login.component.ts   pour récupérer les données du formulaire:
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/fdcea5e2-84d4-4139-919e-2e7393221ae6)

       - Creation du service auth avec la commande :  ng g s sevices/auth
         
       - Le fichier auth.service.ts: pour gérer l’authentification avec 2 utilisateurs admin et user1
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/e12f3d9f-de30-4e9a-8fbc-2a945d2eabe1)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/95696c3d-bd0d-43eb-95e4-896a6c9fbf05)


       - Le fichier Admin-template.ts :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/279e0dbf-88c3-46b0-9e90-4ec5e82137e1)

       - La fonction logout dans auth.services.ts pour se déconnecter :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/6963e765-c4b8-4caf-bc71-759a71a57afb)

       - Affichage du nom de l'utilisateur :
         
          Lorsque l’admin qui se conncte on aura ca:
      
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/87e0b802-fb43-4565-b420-d442a94b0f7b)
         
          Lorsque l’user1 qui se conncte on aura ca:
      
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bb826d3e-549a-402c-afe8-d3d1014d768e)


       - Pour protejer la connexion an va créer un guard avec la commande : ng g g guards/auth
         
       - Le fichier Auth.guards.ts :
         
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2da4cbb9-847b-40e4-8d59-2fdd21a4b118)

       - On va declarer le service dans le fichier app.module.ts :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f7491b29-6a57-4fe7-b0b6-c8ab6e4c8d5c)

       - puis il faut protéger la route admin dans le fichier app-routing.module.ts :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/7fe9d2f9-00a4-4e93-9ca0-4d82a70032cb)

       - Lorsque nous entrons l'URL : http://localhost:4200/admin, rien ne s'affiche :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/135792bb-5f4d-4cd7-9fc7-976331235fa1)
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/bee7ad64-71cc-404c-9720-3fa208aedb3a)


       - Le fichier auth.guard.ts contient un gardien d'authentification (AuthGuard) qui protège les routes. Le gardien utilise deux services injectés, AuthService pour vérifier si l'utilisateur est authentifié, et Router pour naviguer. La méthode canActivate vérifie si l'utilisateur est authentifié via authService.isAuthenticated. Si c'est le cas, l'accès à la route est autorisé (return true). Sinon, l'utilisateur est redirigé vers la page de déconnexion (/logout) et l'accès est refusé (return false). Ce gardien s'assure que seules les personnes authentifiées peuvent accéder aux routes protégées.
         
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/2711b6ce-5704-4ab6-b9cd-a689044d3524)
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b19b1dd7-5a2e-430d-bf96-92cf0b201466)
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/579cbb8f-97e6-427e-b3f3-ad3a62382084)



       - Pour protéger les routes par les rôles on va ajouter un autre Guard : authorization.guard.ts, on va déclarer AuthorizationGuard dans providers dans le fichier app.module.ts :
         
          ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/18602c04-69d4-4db6-b0b8-1d9b0b29d097)
 

       - dans le fichier app-routing.module.ts on doit protéger les routes :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/f7e05a81-fe1b-4b10-886c-45fab62d59fd)

       - Le fichier authorization.guard.ts protège les routes en fonction des rôles des utilisateurs. Il utilise AuthService pour vérifier l'authentification et obtenir les rôles de l'utilisateur, et Router pour la navigation. La méthode canActivate vérifie si l'utilisateur est authentifié ; sinon, il est redirigé vers /logout. Si l'utilisateur est authentifié, elle compare ses rôles avec ceux requis pour la route. Si un rôle correspond, l'accès est autorisé, sinon, il est refusé. Ce gardien s'assure que seuls les utilisateurs authentifiés et autorisés accèdent aux routes protégées.
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/dcb655f1-3456-4c95-838a-257cc00d91e7)

       - Le menu doit être masqué pour l'utilisateur user1 et s'afficher pour l'utilisateur admin .Pour ce faire, nous allons ajouter un test de rôle dans le fichier admin-template.component.html :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c753e51a-439b-4d9d-9618-a9e1644d9e90)

       - Authentification avec l’utilisateur admin :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/c23c9c6e-a754-438b-976e-5b5d41d03875)

       - Authentification avec l’utilisateur user1 :
         
           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/244bfa15-5ecd-4e7a-92c1-63658f874631)

     
         

       
  7. Créer les components fonctionnels de l'application :
     
      - Afficher les payements avec une Pagination frontend :
     
         - le fichier payment.component.ts : Le composant PaymentsComponent affiche les données des paiements provenant du backend en utilisant Angular Material.
           
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/32f0756f-07f2-469a-b709-19f9dff884b2)
           
         - Le fichier payment.component.html :
           
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/b590fa48-f8fe-40e3-9443-b41dac9bd7c2)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/3d6a1afd-f5a9-4096-ab1c-24c1f09dc048)


         - L'affichage :
           
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/a9e58dfe-dbc9-4f5c-89c2-81fbbc83bf83)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-4---Angular---Spring/assets/136022070/9546e027-c25e-43e4-a442-2de3a4f63f20)


                 

             
           
     
     
       
           
