import java.util.Scanner;

public class TicketCreator {
    private static final int ONLINE_TICKET = 1;
    private static final int STANDARD_TICKET = 2;
    private static final int GIFT_TICKET = 3;

    private static int ticketId = 0;

    private Scanner scanner = new Scanner(System.in);

    public Ticket createTicket() {
        System.out.print("Name of event: ");
        String nameOfEvent = scanner.nextLine();
        var adressCreator = new AdressCreator();
        var adress = adressCreator.createAdress();
        System.out.print("Basic price: ");
        double basicPrice = scanner.nextDouble();
        System.out.println("Discount: (0-1)");
        double discount = scanner.nextDouble();

        switch (askUserWhichTicket()) {
            case ONLINE_TICKET:
                return new TicketOnline(nameOfEvent, adress, "Online ticket", basicPrice, discount, ++ticketId);
            case STANDARD_TICKET:
                return new TicketStandard(nameOfEvent, adress, "Standard ticket", basicPrice, discount, ++ticketId);
            case GIFT_TICKET:
                return new TicketGift(nameOfEvent, adress, "Gift ticket", basicPrice, discount, ++ticketId);
            default:
        }
        return null;
    }

    private int askUserWhichTicket() {
        System.out.println("What kind of ticket is it??");
        while (true) {
            printTicketOption();
            int option = scanner.nextInt();
            if (!checkForRightNumberInput(option)) {
                continue;
            }
            scanner.nextLine();
            return option;
        }
    }

    private void printTicketOption() {
        System.out.println("Online ticket   - \tinsert '1'");
        System.out.println("Standard ticket - \tinsert '2'");
        System.out.println("Gift ticket     - \tinsert '3'");
    }

    private boolean checkForRightNumberInput(int input) {
        if (input == ONLINE_TICKET || input == STANDARD_TICKET || input == GIFT_TICKET) {
            return true;
        }
        System.out.println("You need to choose following options.");
        return false;
    }
}
