public class Questions {

	public static void main(String[] args) {
		
        Personne jeanmichel = new Personne("Jean-Michel","Wouters",57);
        System.out.println(jeanmichel);		

        jeanmichel.setPrenom("Jean-Michel, Louis-Pierre");
        jeanmichel.setSexe(false);
        jeanmichel.setadresse("St Germain du PUCH");
        System.out.println(jeanmichel);
	}
}