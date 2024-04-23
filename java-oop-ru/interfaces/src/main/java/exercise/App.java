package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int countApartments) {
        if (apartments.isEmpty()) {
            return new ArrayList<>();
        }
//      Arrays.sort(sortedApartments, Comparator.comparing(
//      (apartment1, apartment2) -> apartment1.compareTo(apartment2)));
        var result = new ArrayList<String>();
        var sortedApartments = new ArrayList<>(apartments);
        sortedApartments.sort(Home::compareTo);
        for (var i = 0; i < countApartments; i++) {
            result.add(sortedApartments.get(i).toString());
        }
        return result;
    }
}
// END
