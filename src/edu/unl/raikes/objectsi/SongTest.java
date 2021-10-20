package edu.unl.raikes.objectsi;

import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest { 

    @Test
    public void setFavoriteSetsFavoriteToTrue() {
        // setup
        Song song = new Song("Journey", Genre.ROCK, "Don't Stop Believin'", "Escape");
        // execute
        song.setFavorited(true);
        // test
        assertTrue("told it to favorite the song but it didn't and it was rude", song.isFavorited());
    }

}
