package com.example.moviedle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class ReadICSV {
    public static MovieImage[] images = new MovieImage[250];

    public static MovieImage[] readICSV() {

        try (BufferedReader reader = new BufferedReader(new FileReader("imdb_top_250_images.csv"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {

                for (i = 0; i < 250; i++) {

                    line = reader.readLine();
                    String[] dvd = line.split(";");
                    MovieImage image = new MovieImage();

                    image.setImageNo(dvd[0]);
                    image.setImageUrl(dvd[1]);

                    images[i] = image;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return images;

    }

    public static void main(String[] args) {

        String filePath =  "C:\\Users\\90505\\IdeaProjects\\Moviedle";
        ReadICSV icsvReader = new ReadICSV();
        icsvReader.readICSV();

        for (MovieImage image : images) {
            System.out.println("Image No: " + image.getImageNo());
            System.out.println("Image URL: " + image.getImageUrl());
            System.out.println("----------------------------------------");
        }
    }


}
