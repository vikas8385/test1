import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Time tm = new Time();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours and minutes");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i + " Hours " + j + " Minutes");

        tm.addTime(2, 40, 3, 30);
        tm.displayMinutes(2, 20);

    }

    public void addTime(int i, int j, int k, int l) {
        int sumHours = i + k;

        int sumMinutes = j + l;
        if (sumMinutes > 60) {
            sumMinutes = sumMinutes - 60;
            sumHours++;
        }

        System.out.println("total add is:" + sumHours + " Hours " + sumMinutes + " minutes ");
    }

    public void displayMinutes(int a, int b) {
        int total_minutes = 0;
        total_minutes = (a * 60) + b;
        System.out.println("total minutes is:" + total_minutes);
    }
}
