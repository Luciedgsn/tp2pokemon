package tp2;

import java.util.Random;

public class pokemon0 {

	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	
	public pokemon0 (String n) {
		this.nom =n;
		Random valeur = new Random();
		this.niveau = valeur.nextInt(10) + 1;
		this.hp = this.niveau*2;
		this.atk = (niveau/2)+1;
	}
	
}
