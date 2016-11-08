public class Questions {
	public static void main(String[] args) {
		
        Personne quelqun = new Personne("Sylvie","Bernert",46,true,"St Germain du PUCH");
        System.out.println(quelqun);
        
        Adresse monadresse = new Adresse(30,"Route du grand PUCH","33750","Saint Germain du PUCH");
        System.out.println(monadresse);
        
        quelqun.setPrenom("Jean-Michel, Louis-Pierre");
        quelqun.setSexe(false);
        quelqun.setAge(57);  
        quelqun.setNom("Wouters");   
        
        monadresse.setNumero(25);
        monadresse.setNomRue("Route de créon");
        monadresse.setCodePostal("33750");
        monadresse.setVille("Saint Germain du PUCH");
        
        System.out.println(quelqun);
        System.out.println(monadresse);
        
	}
}