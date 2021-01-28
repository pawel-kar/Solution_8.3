public class Ticket {

    private String eventName;
    private Address address;
    private String ticketType;
    private double basicPrice;
    private double discount;
    private int ticketId;
    private double finalPrice;

    public Ticket(String eventName, Address address, String ticketType, double basicPrice, double discount, int ticketId) {
        this.eventName = eventName;
        this.address = address;
        this.ticketType = ticketType;
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.ticketId = ticketId;
        finalPrice = calculateFinalPrice();
    }

    public double calculateFinalPrice() {
        return basicPrice - (basicPrice * discount);
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    @Override
    public String toString() {
        return String.format("TICKET ID: %d#|\tEvent: %-15s|\tAdress: %-15s - %-15s |" +
                        "\tType: %-17s|\tBasic price: %3.2f USD|" +
                        "\tDiscount: %3.2f %%|\tFinal price: %3.2f USD",
                ticketId, eventName, address.getCity(), address.getStreet(), ticketType, basicPrice, (discount * 100), finalPrice);
    }

}


