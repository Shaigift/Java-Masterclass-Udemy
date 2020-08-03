package com.company;

<<<<<<< HEAD
/**
 * Created by dev on 18/09/15.
 */
=======
>>>>>>> 77eef9825aecd69e91c73a9927b0d7f82405ee91
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
