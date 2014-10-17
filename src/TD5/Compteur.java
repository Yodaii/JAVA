package TD5;

public class Compteur extends Thread{
	private String nom;
	private int time;
	
	public Compteur(String s, int t){
		this.nom = s;
		this.time = t;
	}
	
	public void run(){
	    for (int i = 1; i <= time; i++) {
	        try {
	          sleep((int)(Math.random() * 5000));
	        } 
	        catch(InterruptedException e) {
	          System.err.println(nom + " a ete interrompu.");
	        }
	        System.out.println(nom + " : " + i);
	      }
	      System.out.println("*** " + nom + " a fini de compter jusqu'à " + time);
	}
	
	public static void main(String[] args) {
	    Compteur[] compteurs = {
	      new Compteur("Toto", 10),
	      new Compteur("Titi", 10),
	      new Compteur("Tata", 10),
	    };
	    for (int i = 0; i < compteurs.length; i++) {
	      compteurs[i].start();
	    }
	  }
}
