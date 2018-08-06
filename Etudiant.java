public class Etudiant extends Personne {
    public String filiere;
    public double moyenne;
    public void passerOuRedoubler(double moyenne) {
    	if (moyenne >= 10) {
    		System.out.print("Cet étudiant passe dans la classe supérieure");
    	}
    	else {
    		System.out.print("Cet étudiant redouble");
    	}
    }
    
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
}