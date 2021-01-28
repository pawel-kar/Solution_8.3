import java.util.Scanner;

public class AdressCreator {
    private Scanner scanner = new Scanner(System.in);

    public Address createAdress() {
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Street: ");
        String street = scanner.nextLine();
        return new Address(city, street);
    }
}
