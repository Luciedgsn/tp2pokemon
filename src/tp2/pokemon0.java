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
	
	public String getNom() {
		return this.nom;
	}
	public int getNiveau() {
		return this.niveau;
	}
	public int getHP() {
		return this.hp;
	}
	public int getATK() {
		return this.atk;
	}
	
	public void setHP(int n) {
		this.hp = n;
	}

	public boolean isKO() {
		if (getHP()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void soigner() {
		setHP(getNiveau()*2);
	}
	
	public void attaquer(pokemon0 p) {
		int a = getATK();
		int b =p.getHP();
		if (b-a < 0) {
			p.setHP(0);
		}
		else {
			p.setHP(b-a);
		}
		log("J'attaque "+p.getNom()+"\n");
	}
	
	public String toString() {
		return ("Je m'appelle "+getNom()+" !\nJe suis niveau "+getNiveau()+"\nJ'ai "+getHP()+" PV\nMon attaque de base est de " +getATK()+"\n");
	}
	
	public void log(String msg) {
		System.out.println("[Pokémon "+getNom()+"] :" +msg+ "\n");
	}
	
	
	
}
