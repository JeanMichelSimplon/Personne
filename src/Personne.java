
public class Personne{

	private String nom;
	private int age;
	public String prenom;	
	public String adresse;
	public boolean sexe;

	public Personne(String prenom, String nom, int age, boolean sexe, String adresse) {
		super();
		this.prenom = prenom;		
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
//		this.adresse = adresse;
	}
/*	public void setadresse(String adresse) {
		this.adresse = adresse;
		
	}*/
		


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPrenom(String prenom) {

		this.prenom = prenom;
	}
	public void setSexe(boolean b) {

		this.sexe = false;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + ", prenom=" + prenom
				+ ", sexe=" + sexe + "]";
	}







	



}
