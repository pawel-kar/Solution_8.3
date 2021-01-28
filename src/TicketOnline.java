public class TicketOnline extends Ticket {

    public TicketOnline(String eventName, Address address, String ticketType, double basicPrice, double discount, int ticketId) {
        super(eventName, address, ticketType, basicPrice, discount, ticketId);

    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
