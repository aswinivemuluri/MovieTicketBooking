public class Theater {
    Movie[] movies;

    public Theater() {
        movies = new Movie[] {
            new Movie("Inception", 50),
            new Movie("Avengers", 40),
            new Movie("Interstellar", 30)
        };
    }

    public void showMovies() {
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }
    }

    public boolean bookTicket(int movieIndex, int seats) {
        if (movieIndex >= 0 && movieIndex < movies.length) {
            return movies[movieIndex].bookSeats(seats);
        }
        return false;
    }
}
