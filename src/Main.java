import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var ticketBase = new TicketBase();
        ticketBase.startTicketSystem();
        ticketBase.printInfoAboutTickets();
    }
}
