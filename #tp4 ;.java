#tp4 ;
/exc 1 :
		 *Scanner scanner = new Scanner(System.in);

	        // Demande à l'utilisateur d'entrer un entier positif
	        System.out.print("Entrez un entier positif : ");
	        int nombre = scanner.nextInt();

	        // Vérification de la validité de l'entrée
	        while (nombre <= 0) {
	            System.out.print("Veuillez entrer un entier positif : ");
	            nombre = scanner.nextInt();
	        }

	        // Affichage des diviseurs, leur nombre et la somme
	        int sommeDiviseurs = 0;
	        int nombreDiviseurs = 0;

	        System.out.print("Les diviseurs de " + nombre + " sont : ");
	        for (int i = 1; i <= nombre / 2; i++) {
	            if (nombre % i == 0) {
	                System.out.print(i + " ");
	                sommeDiviseurs += i;
	                nombreDiviseurs++;
	            }
	        }

	        // Ajout du nombre lui-même comme diviseur
	        System.out.print(nombre + " ");
	        sommeDiviseurs += nombre;
	        nombreDiviseurs++;

	        System.out.println("\nLe nombre total de diviseurs est : " + nombreDiviseurs);
	        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);*/
		
/exc 2 :
		
		*Scanner scanner = new Scanner(System.in);
         //Demande à l'utilisateur d'entrer l'heure
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();

         //Demande à l'utilisateur d'entrer les minutes
        System.out.print("Entrez les minutes : ");
        int minutes = scanner.nextInt();

         //Calcul de l'heure une minute plus tard
        minutes++; // Ajoute une minute

         S//i les minutes dépassent 59, ajuster l'heure
        if (minutes >= 60) {
            heure++;  // Ajoute une heure
            minutes = 0;  // Réinitialise les minutes à 0
        }

         //Si l'heure dépasse 23, revenir à 0
        if (heure >= 24) {
            heure = 0;
        }

         //Affichage de l'heure une minute plus tard
        System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

        scanner.close();*/
		
//exc 3 :
		
		*Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();

        // Vérifier si n est un nombre parfait
        if (estNombreParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }

        scanner.close();
    }

    public static boolean estNombreParfait(int n) {
        if (n <= 1) {
            return false;
        }

        int sommeDiviseurs = 1; // Initialiser avec 1 (car 1 est un diviseur de n)
        
        // Parcourir les nombres de 2 à n/2 (inclusivement)
        for (int i = 2; i <= n / 2; i++) {
            // Si i est un diviseur de n, l'ajouter à la somme
            if (n % i == 0) {
                sommeDiviseurs += i;
            }
        }
        
        // Vérifier si la somme des diviseurs est égale à n
        return sommeDiviseurs == n;
*/
		
//exc 4 : 
		*Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier entier (n) : ");
        int n = scanner.nextInt();

        System.out.print("Entrer le deuxième entier (m) : ");
        int m = scanner.nextInt();

        // Vérifier si les nombres n et m sont des nombres amis
        if (sontNombresAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }

        scanner.close();*/
   

    /*public static boolean sontNombresAmis(int n, int m) {
        // Calculer la somme des diviseurs de n et m
        int somm…
