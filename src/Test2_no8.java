import java.util.Random;
public class Test2_no8 {
    public static int random(int a, int b) {
        if (b <= a) {
            return a;
        }
        Random random = new Random();
        return random.nextInt(b - a + 1) + a;
    }

    public static void main(String[] args) {
        System.out.println("난수를 생성합니다.");
        System.out.println("하한값:10");
        System.out.println("상한값:99");
        System.out.printf("생성한 난수는 %d입니다.", random(10, 99));
    }
}