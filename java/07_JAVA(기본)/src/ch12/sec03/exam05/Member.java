package ch12.sec03.exam05;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Member {
    private String id;
    private String name;
    private int age;
}
