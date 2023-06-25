package com.example.moviedle;

import java.util.Random;

public class MovieRandomizer extends ReadCSV {
    private Movie[] movies;


    public Movie getRandomMovie() {
        Random random = new Random();
        int randomIndex = random.nextInt(movies.length);
        return movies[randomIndex];
    }

    public static void main(String[] args) {
        Movie[] movies = readCSV();

        MovieRandomizer randomizer = new MovieRandomizer();
        Movie randomMovie = randomizer.getRandomMovie();


        System.out.println("Rastgele Film: ");
        System.out.println("No: " + randomMovie.getNo());
        System.out.println("Title: " + randomMovie.getTitle());
        System.out.println("Year: " + randomMovie.getYear());
        System.out.println("Genre: " + randomMovie.getGenre());
        System.out.println("Origin:" + randomMovie.getOrigin());
        System.out.println("Director: " + randomMovie.getDirector());
        System.out.println("Star: " + randomMovie.getStar());

    }
}
