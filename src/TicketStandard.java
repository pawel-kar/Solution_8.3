public class TicketStandard extends Ticket {
    private static final int LOGISTICS_COST = 5;

    public TicketStandard(String eventName, Address address, String ticketType, double basicPrice, double discount, int ticketId) {
        super(eventName, address, ticketType, basicPrice, discount, ticketId);
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() + LOGISTICS_COST;
    }
}
