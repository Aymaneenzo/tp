#tp2 ;
//exc 1 :
		
	    *int n,i=0, a, somme=0, multip=1, moy=0;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer le nombre des entier : ");
		n = nc.nextInt();
		while (i < n) {
			System.out.print("entrer l'entier " +(i+1));
			a = nc.nextInt();
			somme = somme + a;
			multip = multip * a;
		i++;	
		}
		System.out.println("la somme des entier est : " +somme);
		System.out.println("leur produit : " +multip);
		System.out.println("moyenne : " +(somme / n));*/
		
		*int n,i=0, a, somme=0, multip=1, moy=0;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer combien d'entier : ");
		n = nc.nextInt();
		
		do {
			System.out.print("entrer l'entier " +(i+1) );
			a = nc.nextInt();
			somme = somme + a;
			multip = multip * a;
			i++;
			
		   }while (i < n);
		System.out.println("la somme des entier est : " +somme);
		System.out.println("leur produit : " +multip);
		System.out.println("moyenne : " +(somme / n));*/
		
		//exc 2 :
		*int x,n,i, resultat=1;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer x : ");
		x = nc.nextInt();
		System.out.print("entrer n : ");
		n = nc.nextInt();
		for (i=0 ; i<n ; i++){
			resultat*=x;
		}
		System.out.print("le resultat est : " +resultat);*/
		
		//exc 3 :
		
		*double n,i=0,somme=0;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer n (nbr des termes qu'on va calculer) : ");
		n = nc.nextInt();
		for (i=0 ; i<n;i++) {
			somme += 1/(i+1);
		}
		System.out.print("la somme : " +somme);*/
		
		//exc 4 :
		
		*int i=0,j=0;
		Scanner nc = new Scanner(System.in);
		for (i=0;i<5;i++) {
			
			for(j=0;j<=i;j++) {
				System.out.print("*");	
			}
			System.out.println(" ");
			
		}*/
		
		//exc 5 (factorielle avec while puis avec for):
		
		*int n, i=1, factorielle=1;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer un entier n :");
		n = nc.nextInt();
		while (i <= n) {
			factorielle = factorielle * i;
			
		i++;	
		}
		System.out.print("le factorielle de " +n+ " est : " +factorielle);*/
		
		//exc 6 (nombre premier): 
		int i=1, n,j=0;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer un nombre : ");
		n = nc.nextInt();
		*for(i=1; i<=n; i++) {
			if (n % i == 0) {
				j+=1;			
			}	
		}
		if (j==2) {
			System.out.print("le nbr est premier");
		}
		else {
			System.out.print("le nbr n'est pas premier");
		}

