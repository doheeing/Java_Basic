public class _01_Quiz {
    public static void main(String[] args) {
        int i, j;
        System.out.println("[구구단 출력]");
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
