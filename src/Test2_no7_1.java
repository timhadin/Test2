public class Test2_no7_1 {
    public static void putChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    public static void putStart(int n) {
        putChar('*', n);  // putChar 호출하면서 *이라는 문자를 n번 표시하라는 뜻
    }

    public static void main(String[] args) {
        putChar('c', 3); // putChar 호출하면서 c라는 문자를 3번 표시하라는 뜻
        System.out.println();
        putStart(5);
    }
}
