import java.util.HashSet;
import java.util.Set;

public class LaunchCodes {

    public static int getCodes(String[] codes) {
        if (codes == null || codes.length == 0) {
            return 0;
        }
        Set<String> uniqueCodes = new HashSet<>();
        for (String code : codes) {
            if (!uniqueCodes.contains(new StringBuilder(code).reverse().toString())) {
                uniqueCodes.add(code);
            }
        }
        return uniqueCodes.size();
    }

    public static void main(String[] args) {
        String[] codes1 = {"123", "321", " abc", "cba"};

        System.out.println(getCodes(codes1));

    }
}
