import java.util.HashSet;
import java.util.Set;

public class LaunchCodes {

    /**
     * Given a list of launch codes as a String array, determine the number of duplicate codes in the list.
     * Due to a bug in the launch software, codes that are the same both forwards and reverse are considered to be
     * the same code.
     *
     * For example, the code "123" is the same as the code "321," so the list {"123", "321", "12"} contains only 2
     * unique codes.
     *
     */

    public static void main(String[] args) {
        String[] codes1 = {"123", "321", " abc", "cba"};

        System.out.println(getCodes(codes1));
    }

    //Implement this method
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


}
