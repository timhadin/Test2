import java.util.Scanner;
public class Test2_no7_2 {
    public static void putChar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void putStart(int nn) {
        for (int i = 1; i <= nn; i++) {
            putChar(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는:");
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();

        putStart(nn);
    }
}