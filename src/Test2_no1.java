import java.util.Scanner;
public class Test2_no1 {
    public static int signof(int num) {  // signof 메서드 생성
        if (num < 0) {  // num이 0보다 작으면
            return -1;  // -1을 반환
        } else if (num == 0) {
            return 0;
        } else
            return 1;
    }

    public static void main(String[] args) {
        System.out.print("정수x:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int number = signof(num);  // signof 메서드의 값을 받기위한 number 변수 생성

        System.out.printf("signof(x)는 %d입니다.", number);
    }
}
