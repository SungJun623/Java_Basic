package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); // \n :줄바꿈 
        
        // 해물파전 9000원
        // 김치전  8000원
        // 부추전  8000원
        System.out.println("해물파전\t\t9000원"); // \t : Tab
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        System.out.println("C:\\Program Files\\Java"); // \\ : 역슬래시

        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요"); // 문자열 사이에 큰따음표를 쓰고싶을떄는 역슬래시를 포함해준다

        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘봐?\' 라는 표정을 지었어요"); // 작은 따옴표도 위와같이 적용
        System.out.println("단비가 '뭘봐? 라는 표정을 지었어요"); // 작은 따옴표는 역슬래시 없어도 적용가능

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
