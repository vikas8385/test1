public class Q9 {
    public static void main(String[] args) {
        String input = "wwwwaaadebbbbbw";

        StringBuilder str = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                str.append(input.charAt(i - 1));
                str.append(count);
                count = 1;
            }
        }

        str.append(input.charAt(input.length() - 1));
        str.append(count);
        System.out.println(str);
    }

}
