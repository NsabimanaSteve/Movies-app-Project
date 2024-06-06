/**
 * MovieListApp class to manage a list of movies using CustomArrayList.
 */

public class MovieListApp {
    
    // Instance of CustomArrayList to store Movie objects
    private CustomArrayList moviesList; 
    // Constructor to initialize the moviesList
    public MovieListApp() {
        moviesList = new CustomArrayList();
    }

    /**
     *Method that adds a new movie to the list.
     * 
     * @param title The title of the movie.
     * @param releaseYear The release year of the movie.
     * @param rating The rating of the movie.
     */
    public void addMovie(String title, int releaseYear, double rating) {
        Movie newMovie = new Movie(title, releaseYear, rating); // Create a new Movie object
        moviesList.add(newMovie); // Add the new movie to the list
        System.out.println("Movie added: " + title);
        
    }
    
    
    /**
     * Method that returns a string representation of the list of movies.
     * @return A string representing the list of movies.
     */
    public String displayMovies() {
        StringBuilder result = new StringBuilder("["); // StringBuilder to build the result string

        // Iterate through the movies list
        for (int i = 0; i < moviesList.size(); i++) {
            Movie movie = (Movie) moviesList.get(i); // Get the movie at index i

            // Append movie details to the result string
            result.append("{Title: ").append(movie.getTitle())
                .append(", Release Year: ").append(movie.getReleaseYear())
                .append(", Rating: ").append(movie.getRating()).append("}");

            // Check if it is not the last element
            if (i < moviesList.size() - 1) {
                result.append(", ");
            }
        }
        result.append("]"); // Append closing bracket
        return result.toString(); // Return the result string
    }


    
    /**
     * Method that calculates the average rating of all movies in the list.
     * 
     * @return The average rating of the movies.
     */
    public double calculateAverageRating() {
        if (moviesList.isEmpty()) {
            return 0.0; // Return 0 if the list is empty
        }

        double totalRating = 0.0;
        for (int i = 0; i < moviesList.size(); i++) {
            Movie movie = (Movie) moviesList.get(i); // Get the movie at index i
            totalRating += movie.getRating(); // Add the rating to the total
        }

        return totalRating / moviesList.size();// Calculate and return the average rating
    }

    /**
     * Method that removes all movies from the list with the specified title.
     * 
     * @param title The title of the movie(s) to be removed.
     */
    public void removeMovie(String title) {
        boolean removed = false;
        for (int i = 0; i < moviesList.size(); i++) {
            Object obj = moviesList.get(i);
            if (obj instanceof Movie) {
                Movie movie = (Movie) obj;
                if (movie.getTitle().equalsIgnoreCase(title)) {
                    moviesList.remove(i); // Remove the movie from the list
                    System.out.println("Movie removed: " + title);
                    removed = true;
                    i--; // Decrement i to account for the removed movie
                }
            }
        }
        if (!removed) {
            System.out.println("Movie not found: " + title);
        }
}



    
        
    
        
}
