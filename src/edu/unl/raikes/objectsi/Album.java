package edu.unl.raikes.objectsi;

public class Album {
    String name;
    Song[] songs;
    Genre genre;
    
    public Album(String name, Song[] songs, Genre genre) {
        this.name = name;
        this.songs = songs;
        this.genre = genre;
    }
    
    public void printAlbum() {
        System.out.println("album: " + this.name + " (" + this.genre + ")");
        for(int i = 0;i<this.songs.length;i++) {
            this.songs[i].printDetails();
        }
       
    }
}
