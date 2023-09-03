import java.util.Scanner;

public class TicketingSystem {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketManager ticketManager = new TicketManager();
        FNBManager fnbManager = new FNBManager();
        MovieManager movieManager = new MovieManager();
        MemberManager memberManager = new MemberManager();


        while (true) {
            System.out.println("Welcome to the Ticketing System");
            System.out.println("1. Ticket");
            System.out.println("2. FNB");
            System.out.println("3. Movie");
            System.out.println("4. Member");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    ticketManager.sellTicket(scanner, memberManager, movieManager, fnbManager);
                    break;
                case 2:
                    fnbManager.sellFNB(scanner, memberManager);
                    break;
                case 3:
                    movieManager.displayMovies();
                    break;
                case 4:
                    memberManager.manageMembers(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the Ticketing System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
