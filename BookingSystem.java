import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Theater theater = new Theater();
        Scanner sc = new Scanner(System.in);

        while (true) {
            theater.showMovies();

            System.out.print("Select movie (1-3) or 0 to exit: ");
            int movieChoice = sc.nextInt();
            if (movieChoice == 0) break;

            System.out.print("Enter number of tickets to book: ");
            int seats = sc.nextInt();

            boolean success = theater.bookTicket(movieChoice - 1, seats);

            if (success) {
                System.out.println(" Booking successful!\n");
            } else {
                System.out.println(" Not enough seats available.\n");
            }
        }

        System.out.println(" Thank you for using Movie Ticket Booking System!");
        sc.close();
    }
}
