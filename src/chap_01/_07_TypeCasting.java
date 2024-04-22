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

        String s2 = String.valueOf(93);
//        s2 = Integer.toString(93);
        System.out.println(s2);

        int i = Integer.parseInt("98");
        System.out.println(i);
    double d = Double.parseDouble("98");
        System.out.println(d);

    }

}
