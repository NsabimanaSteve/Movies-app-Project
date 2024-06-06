/**
 * Represents a movie with a title, release year, and rating.
 */
public class Movie {
    // Private fields to store movie details
    private String title;       // Title of the movie
    private int releaseYear;    // Release year of the movie
    private double rating;      // Rating of the movie

    /**
     * Constructor to initialize the movie with title, release year, and rating.
     * 
     * @param title       The title of the movie.
     * @param releaseYear The release year of the movie.
     * @param rating      The rating of the movie.
     */
    public Movie(String title, int releaseYear, double rating) {
        this.title = title;           // Initialize title
        this.releaseYear = releaseYear; // Initialize release year
        this.rating = rating;         // Initialize rating
    }

    /**
     * Gets the title of the movie.
     * 
     * @return The title of the movie.
     */
    public String getTitle() {
        return title; // Return the title
    }

    /**
     * Gets the release year of the movie.
     * 
     * @return The release year of the movie.
     */
    public int getReleaseYear() {
        return releaseYear; // Return the release year
    }

    /**
     * Gets the rating of the movie.
     * 
     * @return The rating of the movie.
     */
    public double getRating() {
        return rating; // Return the rating
    }

    /**
     * Returns a string representation of the movie.
     * 
     * @return A formatted string containing movie details.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Release Year: " + releaseYear + ", Rating: " + rating;
    }
}
