/**
 * 
 */
package OpenSud;

/**
 * @author thiba
 *
 */
public enum Main {
	left("gauche"),	right("droite");
	
	private String hand="";

	/**
	 * 
	 */
	Main(String m) {
		hand=m;
	}
	

	public String toString() {
		return hand;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Main.right);
	}

}
