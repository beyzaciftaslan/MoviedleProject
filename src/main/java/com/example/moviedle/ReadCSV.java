package com.example.moviedle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
//import java.util.Random;

public class ReadCSV {
    public static Movie[] movies = new Movie[250];

    public static Movie[] readCSV() {


        try (BufferedReader reader = new BufferedReader(new FileReader("imdb_top_250.csv"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {

                for (i = 0; i < 250; i++) {

                    line = reader.readLine();
                    String[] dvd = line.split(";");
                    Movie movie = new Movie();

                    movie.setNo(dvd[0]);
                    movie.setTitle((dvd[1]));
                    movie.setYear(dvd[2]);
                    movie.setGenre(dvd[3]);
                    movie.setOrigin(dvd[4]);
                    movie.setDirector(dvd[5]);
                    movie.setStar(dvd[6]);

                    movies[i] = movie;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

         public static void main(String[] args) {

             String filePath = "C:\\Users\\90505\\IdeaProjects\\Moviedle";
             ReadCSV csvReader = new ReadCSV();
             csvReader.readCSV();

             for (Movie movie : movies) {
                 System.out.println("No: " + movie.getNo());
                 System.out.println("Title: " + movie.getTitle());
                 System.out.println("----------------------------------------");
             }


         }

  }





