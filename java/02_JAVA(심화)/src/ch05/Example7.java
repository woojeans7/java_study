package ch05;

public class Example7 {
    public static void main(String[] args) {
        int [][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        int sum = 0;
        double  avg  = 0;

        for(int i =0; i<array.length;i++) {
            for(int j=0; j<array[i].length;j++) {
                sum += array[i][j];
            }
            avg = (double) sum / array[i].length;
            System.out.println((i+1) + "번째 배열의 합: " + sum);
            System.out.printf("%d번째 배열의 평균: %.2f\n",(i+1),avg);
            System.out.println();
            sum = 0;
        }
    }
}
