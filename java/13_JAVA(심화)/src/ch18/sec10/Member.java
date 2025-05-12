package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String name;

    Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
