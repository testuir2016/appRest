
public class Habitation {

	private String nomP;
	private String adresse;
	private double surface;
	
	public void affiche()
	{
		System.out.println("nom : "+nomP+" adresse :"+adresse+" surface : "+surface);
	}
	
	public double Impot()
	{
		return 2*surface;
	}
	
	public Habitation(String nomP, String adresse, double surface) {
		
		this.nomP = nomP;
		this.adresse = adresse;
		this.surface = surface;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	
	
	
}
