
public class Adresse {
	
	private int numero;
	private String nomRue;
	private String codePostal;	
	private String ville;
	
	public Adresse(int numero, String nomRue, String codePostal, String ville) {
		this.numero = numero;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", nomRue=" + nomRue
				+ ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}


}