package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "도히";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작되었습니다. " + hour + "시에 방문 예정입니다");
        System.out.println(name + "님, 배송이 완료 되었습니다");

        double score = 90.5; //실수 값 저장
        char grade = 'A';// char은 작은 따옴표 사용
        name = "도햐햐";

        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번시험 합격 여부 : " + pass);

        double d = 3.14753753737272; // 보다 정밀한 소수 계산
        float f = 3.14782727275752752f; // 정밀하지 않음. 그리고 쓸 때 만 뒤에 f or F를 붙여야 함

        System.out.println(d);
        System.out.println(f);

        int i = 1000000000; // int 값은 +21억~-21억 까지만 담을 수 있음
        long l = 10000000000000L; // long 형은 큰 범위를 담을 수 있는 자료형 . 대신 뒤에 l or L을 넣어야 함
        l = 1_000_000_000_000L;

        System.out.println(l);

    }
}
