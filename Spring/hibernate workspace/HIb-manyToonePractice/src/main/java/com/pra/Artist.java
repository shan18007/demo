package com.pra;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Artist {
	@Id
	private int artistId;
	private String artistName;
	@OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
	private List<Song> song;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(int artistId, String artistName, List<Song> song) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.song = song;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		this.song = song;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", song=" + song + "]";
	}

}
