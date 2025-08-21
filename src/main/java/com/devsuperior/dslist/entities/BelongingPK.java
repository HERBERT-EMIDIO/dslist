package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList lsit;
	
	
	public BelongingPK() {
		
	}


	public BelongingPK(Game game, GameList lsit) {
		super();
		this.game = game;
		this.lsit = lsit;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public GameList getLsit() {
		return lsit;
	}


	public void setList(GameList lsit) {
		this.lsit = lsit;
	}


	@Override
	public int hashCode() {
		return Objects.hash(game, lsit);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(lsit, other.lsit);
	}

	
	

}
