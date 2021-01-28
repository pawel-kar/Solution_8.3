import java.util.Scanner;

public class TicketBase {
    private int index = 0;
    private TicketCreator ticketCreator = new TicketCreator();
    private Ticket[] tickets = new Ticket[10];  // In this case, I'll just assume there will be no more than 10


    public void startTicketSystem() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to add next Ticket to system?");
            printOptions();
            int option = scanner.nextInt();
            if (option == 0) {
                break;
            } else if (option == 1) {
                addTicket();
            } else {
                System.out.println("Sorry, wrong input");
            }
        }
    }

    private void printOptions() {
        System.out.println("Yes -  insert '1'");
        System.out.println("No  -  insert '0'");
    }


    private void addTicket() {
        tickets[index] = ticketCreator.createTicket();
        index++;
    }

    public void printInfoAboutTickets() {
        for (Ticket ticket : tickets) {
            if (ticket == null) {
                break;
            }
            System.out.println(ticket);
        }
    }
}
