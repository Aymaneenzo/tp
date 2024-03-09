tp1 ;
//exercice 1:
		*int somme, diff, produit, quotient;
		System.out.println("entrer un entier a : ");
		Scanner nc = new Scanner(System.in);
		int a = nc.nextInt();
		System.out.println("entrer un entier b :");
		int b = nc.nextInt();
		somme = a + b;
		diff = a - b;
		produit = a*b;
		quotient = a%b;
		System.out.println("la somme de a et b est : " +somme);
		System.out.println("la différence de a et b est : " +diff);
		System.out.println("le produit de a et b est : " +produit);
		System.out.println("le quotient de a et b est : " +quotient);*/
		
		//exc 2:
		
		*double rayon;
		Scanner nc = new Scanner(System.in);
	    System.out.print("donner le raryon du cercle : ");
	    rayon = nc.nextDouble();
	    System.out.println("la surface du cercle est : " +(3.14 * rayon * rayon));
	    System.out.println("le perimetre de cette cercle est : " +(2 * 3.14 * rayon));*/
		
		//exc 3 :
		*int a, b, c=0;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer entier a : ");
		a = nc.nextInt();
		System.out.print("entrer entier b : ");
		b = nc.nextInt();
		System.out.println("l'affichage avant : ");
		System.out.println("a = "+a+ ", b = " +b);
		System.out.println("l'affichage aprés : ");
		c = a;
		a = b;
		b = c;
		System.out.print("a = "+a+ ", b = " +b);*/
		
		//exc 4 : 
		*int x, n;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer a : ");
		x = nc.nextInt();
		System.out.print("entrer la puissance : ");
		n = nc.nextInt();
		System.out.print("x à la puissance n = " +Math.pow(x,n));*/
		
		//exc 5 : 
		*int n,i, factorielle = 1;
		Scanner nc = new Scanner(System.in);
		System.out.print("entrer un entier a : ");
		n = nc.nextInt();
		for (i = n; i>0 ; i--) {
			factorielle = factorielle * i;
		}
		System.out.print("le factorielle de " +n+ " est : " +factorielle);*/
		
		//exc 6 :
		*double a,b, solution;
		Scanner nc = new Scanner(System.in);
		System.out.println("on veut résourdre l'equation ax+b : ");
		System.out.println("entrer a :");
		a = nc.nextDouble();
		System.out.println("entrer b : ");
		b = nc.nextDouble();
		solution = -b / a;
		System.out.print("il existe une seule solution c'est  : " +solution);*/
		
		//exc 7 : 
		
		*Scanner nc =  new Scanner(System.in);
		double a,b,c,solution_1, solution_2,delta;
		System.out.print("entrer a : ");
		a = nc.nextDouble();
		System.out.print("entrer b : ");
		b = nc.nextDouble();
		System.out.print("entrer c : ");
		c = nc.nextDouble();
		delta = (b*b - 4*a*c);
		if (delta > 0) {
			solution_1 = ((-b - Math.sqrt(delta))/(2*a));
			solution_2 = ((-b + Math.sqrt(delta))/(2*a));
			System.out.println("cette eqt admet 2 solution réelle: ");
			System.out.println("solution 1 : " +solution_1);
			System.out.println("solution 2 : " +solution_2);	
		}
		else if (delta == 0) {
			solution_1 = -b/2*a;
			System.out.println("cette eqt admet une seule solution : " +solution_1);
		}
		else {
			System.out.println("l'équation admet des solutions imaginaire ");
		}*/
		
		//exc 8 (PGCD): 
		*Scanner nc = new Scanner(System.in);
		int a,b, pgcd=0, max;
		System.out.print("entrer l'entier a : ");
		a = nc.nextInt();
		System.out.print("entrer l'entier b : ");
		b = nc.nextInt();
		for (int i=1; i>0 ; i++) {
			if ((a % i == 0) && (b % i == 0)){
				pgcd = i;
			}
			
		}
		System.out.print("pgcd : "+pgcd);*

