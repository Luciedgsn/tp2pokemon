package tp2;

public class main {
	 public static void main(String[] args) {
		 
		 System.out.println("\nTEST POKEMON0 \n");
		 pokemon0 p1 = new pokemon0("Rhinolove");
		 pokemon0 p2 = new pokemon0("Chovsourir");
		 p1.log(p1.toString());
		 p2.log(p2.toString());
		 p1.attaquer(p2);
		 p2.log(p2.toString());
	 }
}
