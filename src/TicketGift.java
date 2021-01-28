public class TicketGift extends TicketStandard {
    private static final int EXTRA_COST_PERCENT = 5;

    public TicketGift(String eventName, Address address, String ticketType, double basicPrice, double discount, int ticketId) {
        super(eventName, address, ticketType, basicPrice, discount, ticketId);
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() + (super.getBasicPrice() * EXTRA_COST_PERCENT / 100);
    }
}
