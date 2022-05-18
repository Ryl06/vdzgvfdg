package com.api.taller.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cancion")
public class Cancion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Id;
		private String title;
		private String artist;
		private String album;
		private Date year;
		
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public Date getYear() {
			return year;
		}
		public void setYear(Date year) {
			this.year = year;
		}
		@Override
		public String toString() {
			return "Cancion [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
		}
		
}
