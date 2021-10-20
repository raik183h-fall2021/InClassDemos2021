/**
 * 
 */

package edu.unl.raikes.objectsi;

/**
 * @author valentine
 *
 */
public class Song {
    // number of listens
    private int numberOfListens = 0;
    
    //artist
    private String artist;
    
    //favorited
    private boolean favorited = false;
    
    //genre
    private Genre genre;
    
    //name
    private String name;
    
    // album
    private String album;
    
    public Song(String artist, Genre genre, String name, String albumName) {
        this.artist = artist; // ?
        this.genre = genre;
        this.name = name;
        this.album = albumName;
    }
    
    
    
    public void printDetails() {
        System.out.println(this.name + " favorited =" + this.favorited);
    }

    public int getNumberOfListens() {
        return numberOfListens;
    }

    public void setNumberOfListens(int numberOfListens) {
        this.numberOfListens = numberOfListens;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    
    
    
    
    
    
}
