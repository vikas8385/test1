import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        int N = 3;
        String S = "GACCBDDBAGEE";
        HashSet<Character> h = new HashSet<>();
        int count = 0;

        for (char c : S.toCharArray()) {
            if (h.contains(c)) {
                h.remove(c);
                N++;
            } else if (N > 0) {
                h.add(c);
                N--;
            } else {
                count++;
            }
        }
        System.out.print(count / 2);
    }
}
