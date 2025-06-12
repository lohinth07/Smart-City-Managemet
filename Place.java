public class Place {
    private String name;
    private String type;
    private String address;
    private String contact;

    public Place(String name, String type, String address, String contact) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
        System.out.println("----------------------------");
    }
}
