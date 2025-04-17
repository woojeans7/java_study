package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // 배열 객체가 없기 때문에 값을 저장할 수 없음.

        String str = null; // 문자열 객체가 없기 때문에 길이도 계산할 수 없음.
        System.out.println("총 문자 수: " + str.length() );
    }
}
