package ch06;

public class Database {
    // 1. 자기 자신 타입의 static 필드 (오직 1개만 존재!)
    private static Database instance = new Database();

    // 2. 실제 연결 정보
    private String connection = "MySQL";

    // 3. 생성자 private: 외부에서 new 못 하게 막음
    private Database() {}

    // 4. 인스턴스를 외부에 공개하는 메서드
    public static Database getInstance() {
        return instance;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}