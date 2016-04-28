import java.util.Scanner;


public class HabitationIndiv extends Habitation {
private int nbrpieces;
private boolean piscine;
public HabitationIndiv(String nomP, String adresse, double surface,
		int nbrpieces, boolean piscine) {
	super(nomP, adresse, surface);
	this.nbrpieces = nbrpieces;
	this.piscine = piscine;
}
@Override
public String toString() {
	return "HabitationIndiv [nbrpieces=" + nbrpieces + ", piscine=" + piscine
			+ "]";
}

public void affiche()
{
	super.affiche();
	System.out.println(this.toString());
}

public double Impot()
{
	if(piscine)
	{
		return 500+100*nbrpieces+super.Impot();
	}
	return 100*nbrpieces+super.Impot();
}

public static HabitationIndiv saisieIndiv()
{
	Scanner clavier=new Scanner(System.in);
	System.out.println("Saisir le nom du proprietaire : ");
	String prop=clavier.next();
	
	System.out.println("Saisir l'adresse : ");
	String adresse=clavier.next();
	
	System.out.println("Saisir la surface : ");
	double surface=clavier.nextDouble();
	
	System.out.println("Saisir le nombre de pieces : ");
	int nbrpieces=clavier.nextInt();
	
	System.out.println("Saisir si y a til une piscine ou pas (true/false : ");
	boolean piscine=clavier.nextBoolean();
	
	return new HabitationIndiv(prop, adresse, surface, nbrpieces, piscine);
	
}

}
