package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29 문자열의 길이를 확인할수있다 컴퓨터에서는 문자열의 첫번째위치는 0 이다

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 출력 되는 모든 문장을 대문자로 변경해준다
        System.out.println(s.toLowerCase()); // 출력 되는 모든 문장을 소문자로 변경해준다

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 확인 가능 29 문자중에서 7번째
        System.out.println(s.indexOf("C#")); // 포함되어있지않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false)
    }
}
