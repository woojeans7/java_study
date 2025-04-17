package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println( strArray[0] == strArray[1] ); //true -> 리터럴로 작성 시 같은 문자열이면 주소 공유
        System.out.println( strArray[0] == strArray[2] ); //false -> 다른 주소
        System.out.println( strArray[0].equals(strArray[2]) ); //true -> 내용을 비교
    }
}