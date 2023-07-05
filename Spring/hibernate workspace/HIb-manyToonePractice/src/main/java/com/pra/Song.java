package com.pra;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Song {
	@Id
	private int songId;
	private String songName;
	@ManyToOne
	private Artist artist;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(int songId, String songName, Artist artist) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.artist = artist;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", artist=" + artist + "]";
	}

}
