#tp3 ;
// exc 1 (déclaration d'un tableau) : 
			
			int i=0;
	         *int[] tab = {1,2,3,4,5}; //déclaration et initialisation d'un tableau de 5 entiers
	         
	         //méthode 1 : 
	          * 
	         for (i=0;i<5;i++) {
	        	 System.out.println("la valeur " +(i+1)+ " du tableau est : " +tab[i]); 
	         }*/
	         
			 //méthode 2 :
			
			*int[] tableau = new int [5]; //déclaration de la taille du tableau
			int i=0;
			 Scanner nc = new Scanner(System.in);
			 
			 for(i=0;i<5;i++){
				 System.out.print("entrer le valeur " +(i+1)+ " du tableau : ");
	             tableau[i] = nc.nextInt();			 
			 }
			 //affichage :
			 for (i=0;i<5;i++) {
				 System.out.println("element " +(i+1)+ " du tableau est : " +tableau[i]);
			 }*/
			
			//exc 2 :
			*int [] tab = new int[10];
			int i=0;
			Scanner nc = new Scanner(System.in);
			//remplissage :
			for(i=0;i<10;i++) {
				System.out.print("entrer l'element " +(i+1)+ " du tableau ");
				tab[i] = nc.nextInt();		
			}
			//affichage :
			for(i=0;i<10;i++) {
				System.out.println("element " +(i+1)+ " : " +tab[i]);
			}*/
			
			//exc 3 : 
			
			*int i=0,taille=0;
			int [] tab = null;
			
			Scanner nc = new Scanner(System.in);
			for (i=0 ; i<=50; i++) {
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();
				if(taille >= 10 || taille >= 50){
					tab = new int[taille];
					break;
				}
				else {
					System.out.println("la taille doit etre comprise entre 10 et 50 ");
				}	
			}
			//remplissage :
			for(i=0;i<10;i++) {
				System.out.println("entrer l'element " +(i+1)+ " du tableau ");
				tab[i] = nc.nextInt();		
			}
			
			//affichage : 
			for (i=0;i<taille;i++) {
				System.out.println("element " +(i+1)+ " est : " +tab[i]);
			}*/
			
			//exc 4 : 
			
			*int i=0,taille=0;
			int [] tab = null;
			
			Scanner nc = new Scanner(System.in);
			for (i=0 ; i<=50; i++) {
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();
				if(taille >= 10 || taille >= 50){
					tab = new int[taille];
					break;
				}
				else {
					System.out.println("la taille doit etre comprise entre 10 et 50 ");
				}	
			}
			
			//remplissage :
					for(i=0;i<10;i++) {
						System.out.println("entrer l'element " +(i+1)+ " du tableau ");
						tab[i] = nc.nextInt();		
					}
			//affichage avant : 
					System.out.println("l'affichage avant suppression des occurrences ");
						for (i=0;i<taille;i++) {
						System.out.println("element " +(i+1)+ " est : " +tab[i]);
					}
			//affichage aprés :
						
					System.out.print("l'affichage aprés la suppression des occurrences ");
					for (i=0;i<taille;i++) {
						if (tab[i] == tab[i+1]) {
							
							
						}*/
			
			//exc 5 :
			*int i=0,taille;
			int [] tab = new int[50];
			
			Scanner nc = new Scanner(System.in);
				System.out.print("entrer la taille du tableau : ");
				taille = nc.nextInt();	
			
			
			//remplissage :
					for(i=0;i<taille;i++) {
						System.out.println("entrer l'element " +(i+1)+ " du tableau ");
						tab[i] = nc.nextInt();		
					}
			//affichage avant l'inversement :
					System.out.println("affichage avant : ");
					for (i=0;i<taille;i++) {
						System.out.println("l'élement " +(i+1)+ " du tableau est : " +tab[i]);
					}
			//affichage aprés l'inversement :
					System.out.println("l'affichage inverse ");
					for (i=taille-1;i>=0 ;i--) {
						System.out.println("l'élément " +(i+1)+ " est : " +tab[i]);
					}*/
			
			//exc 6 :
		 *int taille = 0, pos = 0, neg = 0;
	        int[] T = new int[50];
	        ArrayList<Integer> TP = new ArrayList<>();
	        ArrayList<Integer> TN = new ArrayList<>();
	        Scanner nc = new Scanner(System.in);
	        System.out.print("entrer la taille des tableau : ");
	        taille = nc.nextInt();

