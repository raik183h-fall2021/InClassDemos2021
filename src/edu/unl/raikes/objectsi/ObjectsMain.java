package edu.unl.raikes.objectsi;

public class ObjectsMain {
    public static void main(String[] args) {
        Song believin = new Song("Journey",Genre.ROCK,"Don't Stop Believin'", "Escape");
        Song wheel = new Song("Journey",Genre.ROCK,"Wheel In The Sky", "Escape");
        Song faithfully = new Song("Journey",Genre.ROCK,"Faithfully", "Escape");
        believin.printDetails();
        believin.setFavorited(true);
        believin.printDetails();
        Song[] songs = new Song[3];
        songs[0] = believin;
        songs[1] = wheel;
        songs[2] = faithfully;
        
        Album album = new Album("Escape", songs, Genre.ROCK);
        faithfully.setFavorited(true);
        album.printAlbum();
    }
}
