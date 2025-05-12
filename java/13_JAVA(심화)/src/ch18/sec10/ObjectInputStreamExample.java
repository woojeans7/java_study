package ch18.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("java/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m1 = (Member) ois.readObject();
        Product p1 = (Product) ois.readObject();
        int[] arr1 = (int[]) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(m1);
        System.out.println(p1);
        System.out.println(Arrays.toString(arr1));
    }
}
