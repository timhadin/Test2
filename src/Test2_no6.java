import java.util.Scanner;
public class Test2_no6 {
    public static void printSeason(int m) {
        if (m == 3 || m == 4 || m == 5) {
            System.out.print("해당 월의 계절은 봄입니다.");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.print("해당 월의 계절은 여름입니다.");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.print("해당 월의 계절은 가을입니다.");
        } else if (m == 12 || m == 1 || m == 2) {
            System.out.print("해당 월의 계절은 겨울입니다.");
        } else
            System.out.print("");
    }

    public static void main(String[] args) {
        System.out.print("몇 월입니까(1~12):");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        printSeason(m);
    }
}
