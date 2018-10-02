package OpenSud;

import java.util.ArrayList;

public class Game {
	
	private int nbPlayer;
	private ArrayList<Player> players;

		

	public Game() {		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str="Game [nbPlayer=" + nbPlayer ;
		for (Player player : players) {
			str+=" "+player+" ";
		}		
		return str;
	}
	
	public Game(int nbPlayer) {
		super();
		this.nbPlayer=nbPlayer;
		this.players=new ArrayList<Player>();	
	}


	/**
	 * @param nbPlayer
	 * @param players
	 */
	public Game(int nbPlayer, ArrayList<Player> players) {
		super();
		this.nbPlayer = nbPlayer;
		this.players = players;
	}
	
	public void addPlayer(Player p) {
		players.add(p);
	}
	

	/**
	 * @return the nbPlayer
	 */
	public int getNbPlayer() {
		return nbPlayer;
	}


	/**
	 * @param nbPlayer the nbPlayer to set
	 */
	public void setNbPlayer(int nbPlayer) {
		this.nbPlayer = nbPlayer;
	}


	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}


	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public static void main(String[] args) {
		Game game=new Game(5);
		Player p1,p2,p3,p4,p5;
		p1=new Player("Nadal","Raphael",5000,Main.left);
		p2=new Player("Federe","Roger",4000,Main.right);
		p3=new Player("Novak","Djokovik",4500,Main.right);
		p4=new Player("Gael","Monfils",3000,Main.right);
		p5=new Player("Jo","Wilfrid",3800,Main.right);
		game.addPlayer(p1);
		game.addPlayer(p2);
		game.addPlayer(p3);
		game.addPlayer(p4);
		game.addPlayer(p5);
		System.out.println(game);	
		
	}

}
