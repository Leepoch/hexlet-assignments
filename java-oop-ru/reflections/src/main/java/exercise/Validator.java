package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        var fieldsWithNull = new ArrayList<String>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    fieldsWithNull.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                System.out.println("Error");
            }
        }
        return fieldsWithNull;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        var wrongFields = new HashMap<String, List<String>>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (var field : fields) {
            field.setAccessible(true);
            try {
                var fieldName = field.getName();
                var fieldValue = field.get(address);
                var errorsList = wrongFields.getOrDefault(fieldName, new ArrayList<>());
                if (field.isAnnotationPresent(NotNull.class) && fieldValue == null) {

                    errorsList.add("can not be null");
                    wrongFields.put(fieldName, errorsList);
                }
                if (field.isAnnotationPresent(MinLength.class) && fieldValue != null) {
                    MinLength length = field.getAnnotation(MinLength.class);
                    if (length.minLength() > fieldValue.toString().length()) {
                        errorsList.add(String.format("length less than %d", 4));
                        wrongFields.put(fieldName, errorsList);
                    }
                }
            } catch (IllegalAccessException e) {
                System.out.println("Error");
            }
        }
        return wrongFields;
    }
}
// END
