public class Movie {
    String title;
    int availableSeats;

    public Movie(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public boolean bookSeats(int count) {
        if (count <= availableSeats) {
            availableSeats -= count;
            return true;
        }
        return false;
    }

    public String toString() {
        return title + " (Seats Available: " + availableSeats + ")";
    }
}
