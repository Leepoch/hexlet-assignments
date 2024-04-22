package exercise;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int countApartments) {

        var result = new ArrayList<String>();
        var sortedApartments = new ArrayList<>(apartments);
        Arrays.sort(sortedApartments, Comparator.comparing((apartment1, apartment2) -> apartment1.compareTo(apartment2)));
        for (var i = 0; i < countApartments; i++) {
            result.add(sortedApartments.get(i).toString());
        }
        return result;
    }
}
// END
