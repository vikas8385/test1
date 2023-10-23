import java.util.HashMap;
import java.util.Map;

public class Q8 {
    public static void main(String[] args) {
        String String = "Robert000Smith000123";

        Map<String, String> result = new HashMap<>();
        String[] parts = String.split("0+");
        if (parts.length >= 3) {
            result.put("first_name", parts[0]);
            result.put("last_name", parts[1]);

            String id = parts[parts.length - 1];
            result.put("id", id);
        }

        System.out.println(result);
    }

}
