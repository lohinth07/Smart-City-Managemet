import java.util.*;

public class CityGuide {
    private List<Place> places = new ArrayList<>();

    public void addPlace(String name, String type, String address, String contact) {
        places.add(new Place(name, type, address, contact));
        System.out.println("Place added successfully.");
    }

    public void viewAllPlaces() {
        if (places.isEmpty()) {
            System.out.println("No places available.");
        } else {
            for (Place place : places) {
                place.display();
            }
        }
    }

    public void searchByType(String type) {
        boolean found = false;
        for (Place place : places) {
            if (place.getType().equalsIgnoreCase(type)) {
                place.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No places found for type: " + type);
        }
    }
}
