import java.util.Scanner;


public class Mairie {
	
	public static Habitation[]tableau=new Habitation[10];
	public static int tailleeffective=0;

	public static void main(String[] args) {
		Habitation h;
		while(true)
		{
			switch(menu())
			{
			case 1 : h=HabitationIndiv.saisieIndiv();
					if(ajouterHabitation(h))
						System.out.println("ajout avec succes");
					else
						System.out.println("echec d'ajout!!!");
						
			break;
			
			case 2 : h=HabitationPro.saisie();
			if(ajouterHabitation(h))
				System.out.println("ajout avec succes");
			else
				System.out.println("echec d'ajout!!!");
			break;
			
			
			case 3 : for(int i=0;i<tailleeffective;i++)
					tableau[i].affiche();
			break;
			
			case 4 : double somme=0;
				
				for(int i=0;i<tailleeffective;i++)
				somme+=tableau[i].Impot();
				
				
				System.out.println("l'impot totalest : "+somme+ "DH");
		break;
			case 5 : System.exit(0);
			
			}
			
			
		}
		
		
	}
	
	public static int menu()
	{
		Scanner clavier=new Scanner(System.in);
		System.out.println("--------Menu Mairie ----------");
		System.out.println("1 - Ajouter une habitation Inidividuelle");
		System.out.println("2 - Ajouter une habitation Professionelle");
		System.out.println("3 - Lister toutes les habitations");
		System.out.println("4 - Impot total s");
		
		System.out.println("5 - Quitter l'appllication");
		
		System.out.println("Merci de choisir une fonction ? ");

		return clavier.nextInt();
		
	
	
	
	}
	
	public static boolean ajouterHabitation(Habitation h)
	{
		
		if(tailleeffective<10)
		{
		tableau[tailleeffective]=h;
		tailleeffective++;
		return true;
		}
		return false;
		
	}

}
