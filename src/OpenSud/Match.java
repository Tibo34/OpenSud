package OpenSud;

class Match {
	
	private Player player1;
	private Player player2;
	

	public Match() {
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Match [player1=" + player1 + ", player2=" + player2 + "]";
	}

	/**
	 * @return the player1
	 */
	public Player getPlayer1() {
		return player1;
	}


	/**
	 * @param player1 the player1 to set
	 */
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	/**
	 * @return the player2
	 */
	public Player getPlayer2() {
		return player2;
	}


	/**
	 * @param player2 the player2 to set
	 */
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}




	/**
	 * @param player1
	 * @param player2
	 */
	public Match(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}

}
