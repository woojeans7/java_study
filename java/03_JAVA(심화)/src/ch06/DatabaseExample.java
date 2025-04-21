package ch06;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        System.out.println("데이터베이스: "+db.connect());
        db.close();
    }
}
