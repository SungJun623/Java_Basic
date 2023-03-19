package chap_01;

public class _03_Variables { // 변수 : 어떤 데이터,값을 저장하는 공간
    public static void main(String[] args) {
        // 프로그래밍에서는 = 는 오른쪽에 있는 어떤값을 왼쪽의 변수에다가 넣겠다는 의미
        String name = "성준"; // 문자열 변수를 선언할때는 String
        int hour = 15;       // 정수형 변수를 선언할때는 int (정수,실수같은 숫자를 넣을때는 ""필요없다)

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호"; // 값을 업데이트 할수있다
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; // true,false는 "" 필요없다
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000L; //  int 범위이상인 값일때는 long 을 사용
        l = 1_000_000_000_000L; // _바를쓰더라도 결과에는 정상적으로 출력된다
        System.out.println(l);

        // int , long, float, double, char, String, boolean
    }
}
