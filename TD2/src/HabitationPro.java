import java.util.Scanner;


public class HabitationPro extends Habitation {
	
	private int nbrEmployes;

	public HabitationPro(String nomP, String adresse, double surface,
			int nbrEmployes) {
		super(nomP, adresse, surface);
		this.nbrEmployes = nbrEmployes;
	}

	@Override
	public String toString() {
		return "HabitationPro [nbrEmployes=" + nbrEmployes + "]";
	}

	public int getNbrEmployes() {
		return nbrEmployes;
	}

	public void setNbrEmployes(int nbrEmployes) {
		this.nbrEmployes = nbrEmployes;
	}
	
	public void affiche()
	{
		super.affiche();
		System.out.println(this);
	}
	
	public double Impot()
	{
		int nbtranche=nbrEmployes/10;
		return super.Impot()+nbtranche*1000;
	}
	public static HabitationPro saisie()
	{
		Scanner clavier=new Scanner(System.in);
		System.out.println("Saisir le nom du proprietaire : ");
		String prop=clavier.next();
		
		System.out.println("Saisir l'adresse : ");
		String adresse=clavier.next();
		
		System.out.println("Saisir la surface : ");
		double surface=clavier.nextDouble();
		
		System.out.println("Saisir le nombre de personnes : ");
		int nbremployes=clavier.nextInt();
		
		
		return new HabitationPro(prop, adresse, surface, nbremployes);
		
	}
}
