package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 typecasting

        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double) score);

        float score_f = 39.3F;
        double score_d = 39.8;

        System.out.println((int)score_f); // 39
        System.out.println((int)score_d); // 39
    }

}
