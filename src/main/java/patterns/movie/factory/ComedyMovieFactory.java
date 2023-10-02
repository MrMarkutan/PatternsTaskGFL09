package patterns.movie.factory;

import patterns.movie.Movie;

import java.util.List;

public class ComedyMovieFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title, String country, String shortDescription, String director, List<String> actors) {
        return new Movie.Builder()
                .title(title)
                .priceCode(Movie.MovieType.COMEDY)
                .country(country)
                .shortDescription(shortDescription)
                .director(director)
                .actors(actors)
                .build();
    }
}

