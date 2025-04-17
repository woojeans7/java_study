package ch05;

public class Example6 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,2};

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i]; // 더 큰 값이 나타나면 교체
            }
        }
        System.out.println("최대값: " + temp);
    }
}
