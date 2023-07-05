package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {

	@Id
	public int artistId;
	public int artistName;

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public int getArtistName() {
		return artistName;
	}

	public void setArtistName(int artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + "]";
	}

}
