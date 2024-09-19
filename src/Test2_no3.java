import java.util.Scanner;
public class Test2_no3 {
    public static int Med(int a, int b, int c) {
        if (a >= b) {
            if (b >= c)
                return b;
            else if (a >= c)
                return c;
            else
                return a;
        } else {
            if (a >= c)
                return a;
            else if (b >= c)
                return c;
            else
                return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a:");
        int a = sc.nextInt();
        System.out.print("정수b:");
        int b = sc.nextInt();
        System.out.print("정수c:");
        int c = sc.nextInt();

        int result = Med(a, b, c);

        System.out.printf("중간값은 %d입니다.", result);
    }
}

// a가 b이상? true -> b가 c이상? true -> 중간값 b
// ----------------------------false -> a가 c이상? true -> 중간값 c
// -----------------------------------------------false -> 중간값 a
// ----------false -> a가 c이상? true -> 중간값 a
// -----------------------------false -> b가 c이상? true -> 중간값 c
// ------------------------------------------------false -> 중간값 b