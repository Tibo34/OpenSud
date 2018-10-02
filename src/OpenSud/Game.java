package OpenSud;

import java.util.ArrayList;
import java.util.Collection;

public class Game {
	
	private int nbPlayer;
	private ArrayList<Player> players;
		

	public Game() {
		
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
	
	

}
