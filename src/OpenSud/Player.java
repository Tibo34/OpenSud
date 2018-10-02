/**
 * 
 */
package OpenSud;

/**
 * @author Thibaut
 *
 */
class Player {
	
	private String name;
	private String prenom;
	private int point;
	private Main hand;	

	/**
	 * 
	 */
	public Player() {
		
	}
	
	/**
	 * @param name
	 * @param point
	 * @param hand
	 */
	public Player(String name, String prenom, int point, Main hand) {
		super();
		this.name = name;
		this.point = point;
		this.hand = hand;
	}
	
		


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the point
	 */
	public int getPoint() {
		return point;
	}


	/**
	 * @param point the point to set
	 */
	public void setPoint(int point) {
		this.point = point;
	}


	/**
	 * @return the hand
	 */
	public Main getHand() {
		return hand;
	}


	/**
	 * @param hand the hand to set
	 */
	public void setHand(Main hand) {
		this.hand = hand;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", prenom=" + prenom + ", point=" + point + ", hand=" + hand + "]";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player p1=new Player("Jo","Wilfrid",100,Main.left);
		System.out.println(p1);

	}

}
