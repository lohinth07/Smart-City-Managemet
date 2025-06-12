import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CityGuide guide = new CityGuide();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Smart City Guide ---");
            System.out.println("1. Add a Place (Admin)");
            System.out.println("2. View All Places");
       
            System.out.println("3. Search Place by Type");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Type (e.g., Hospital, School): ");
                    String type = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    guide.addPlace(name, type, address, contact);
                    break;

                case 2:
                    guide.viewAllPlaces();
                    break;

                case 3:
                    System.out.print("Enter Type to Search: ");
                    String searchType = sc.nextLine();
                    guide.searchByType(searchType);
                    break;

                case 4:
                    exit = true;
                    System.out.println("Thank you for using Smart City Guide.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
